package queroserzupper.cadastroenderecos.api.mapping;

import queroserzupper.cadastroenderecos.api.request.UsuarioRequest;
import queroserzupper.cadastroenderecos.api.response.UsuarioResponse;
import queroserzupper.cadastroenderecos.model.Usuario;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapping {

    public static final UsuarioMapping INSTANCE = Mappers.getMapper(UsuarioMapping.class);

    public abstract Usuario toUsuario(UsuarioRequest usuarioRequest);

    public UsuarioResponse toUsuarioResponse(Usuario usuario);
}