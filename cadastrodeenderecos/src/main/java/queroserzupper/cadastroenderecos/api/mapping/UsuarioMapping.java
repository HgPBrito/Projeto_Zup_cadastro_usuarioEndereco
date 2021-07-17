package queroserzupper.cadastroenderecos.api.mapping;

import queroserzupper.cadastroenderecos.api.request.UsuarioRequest;
import queroserzupper.cadastroenderecos.api.response.UsuarioResponse;
import queroserzupper.cadastroenderecos.model.Usuario;

import java.util.stream.Collectors;

public class UsuarioMapping {

    public static Usuario paraUsuario(UsuarioRequest usuarioRequest){
        Usuario usuario = new Usuario();
        usuario.setId(usuarioRequest.getId());
        usuario.setNome(usuarioRequest.getNome());
        usuario.setCpf(usuarioRequest.getCpf());
        usuario.setNascimento(usuarioRequest.getNascimento());
        usuario.setEmail(usuarioRequest.getEmail());
        return usuario;
    }

    public static UsuarioResponse paraUsuarioResponse(Usuario usuario){
        UsuarioResponse usuarioResponse = new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getCpf(),
                usuario.getNascimento(),
                usuario.getEmail(),
                usuario.getEnderecos().stream()
                        .map(e -> EnderecoMapping.paraEnderecoResponse(e) )
                        .collect(Collectors.toList())
        );
        return usuarioResponse;
    }





}
