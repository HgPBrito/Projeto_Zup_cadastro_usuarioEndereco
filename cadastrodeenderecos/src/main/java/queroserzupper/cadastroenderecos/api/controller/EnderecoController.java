package queroserzupper.cadastroenderecos.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import queroserzupper.cadastroenderecos.api.mapping.EnderecoMapping;
import queroserzupper.cadastroenderecos.api.request.EnderecoRequest;
import queroserzupper.cadastroenderecos.api.response.EnderecoResponse;
import queroserzupper.cadastroenderecos.client.DadosCep;
import queroserzupper.cadastroenderecos.client.ViaCepClient;
import queroserzupper.cadastroenderecos.model.Endereco;
import queroserzupper.cadastroenderecos.model.Usuario;
import queroserzupper.cadastroenderecos.repository.EnderecoRepository;
import queroserzupper.cadastroenderecos.repository.UsuarioRepository;

@RestController
@RequestMapping("/enderecos")
@CrossOrigin("*") // Restringe o acesso a API por um determinado domínio
public class EnderecoController {

	@Autowired
	public ViaCepClient cepClient;

	@Autowired
	public EnderecoRepository enderecoRepository;

	@Autowired
	public UsuarioRepository usuarioRepository;

	@PostMapping
	public ResponseEntity<EnderecoResponse> cadastraEndereco(@Valid @RequestBody EnderecoRequest enderecoRequest) {

		Usuario usuario = usuarioRepository.getOne(enderecoRequest.getId_usuario());
		Endereco endereco = EnderecoMapping.paraEndereco(enderecoRequest, usuario);
		DadosCep dadosCep = cepClient.buscaCep(enderecoRequest.getCep());

		if (dadosCep != null) {
			endereco.setEstado(dadosCep.getUf());
			endereco.setCidade(dadosCep.getLocalidade());
			endereco.setBairro(dadosCep.getBairro());
			endereco.setLogradouro(dadosCep.getLogradouro());
			endereco.setComplemento(dadosCep.getComplemento());
		}
		Endereco enderecoSalvo = enderecoRepository.save(endereco);

		EnderecoResponse enderecoResponse = EnderecoMapping.paraEnderecoResponse(enderecoSalvo);
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoResponse);
	}
}
