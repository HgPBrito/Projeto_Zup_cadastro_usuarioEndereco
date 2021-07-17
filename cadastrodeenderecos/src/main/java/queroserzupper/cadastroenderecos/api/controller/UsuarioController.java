package queroserzupper.cadastroenderecos.api.controller;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import queroserzupper.cadastroenderecos.api.request.UsuarioRequest;
import queroserzupper.cadastroenderecos.api.mapping.UsuarioMapping;
import queroserzupper.cadastroenderecos.api.response.UsuarioResponse;
import queroserzupper.cadastroenderecos.model.Usuario;
import queroserzupper.cadastroenderecos.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*") //Restringe o acesso a API por um determinado domínio
public class UsuarioController {

	@Autowired
	public UsuarioRepository repository;
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<List<UsuarioResponse>> listarPorId(@PathVariable("id") Long id) {
		Optional<Usuario> resp = repository.findById(id);

		if (resp.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.ok(resp.stream().map(u -> UsuarioMapping.paraUsuarioResponse(u)).collect(Collectors.toList()));
		}
	}
	
	@PostMapping
	public ResponseEntity<UsuarioResponse> cadastraUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest) {
		Usuario usuario = UsuarioMapping.paraUsuario(usuarioRequest);
		Usuario usuarioSalvo = repository.save(usuario);
		UsuarioResponse usuarioResponse = UsuarioMapping.paraUsuarioResponse(usuarioSalvo);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioResponse);
	}
}