package queroserzupper.cadastroenderecos.api.mapping;

import queroserzupper.cadastroenderecos.api.request.EnderecoRequest;
import queroserzupper.cadastroenderecos.api.response.EnderecoResponse;
import queroserzupper.cadastroenderecos.model.Endereco;
import queroserzupper.cadastroenderecos.model.Usuario;

public class EnderecoMapping {

    public static Endereco paraEndereco(EnderecoRequest enderecoRequest, Usuario usuario){
        Endereco endereco = new Endereco();
        endereco.setId(enderecoRequest.getId());
        endereco.setUsuario(usuario);
        endereco.setCep(enderecoRequest.getCep());
        endereco.setEstado(enderecoRequest.getEstado());
        endereco.setCidade(enderecoRequest.getCidade());
        endereco.setBairro(enderecoRequest.getBairro());
        endereco.setLogradouro(enderecoRequest.getLogradouro());
        endereco.setNumero(enderecoRequest.getNumero());
        endereco.setComplemento(enderecoRequest.getComplemento());
        return endereco;
    }

    public static EnderecoResponse paraEnderecoResponse(Endereco endereco){
        EnderecoResponse enderecoResponse = new EnderecoResponse(
                endereco.getId(),
                endereco.getEstado(),
                endereco.getCidade(),
                endereco.getCep(),
                endereco.getBairro(),
                endereco.getLogradouro(),
                endereco.getComplemento(),
                endereco.getNumero(),
                endereco.getUsuario().getId(),
                endereco.getUsuario().getNome()
        );
        return enderecoResponse;
    }
}
