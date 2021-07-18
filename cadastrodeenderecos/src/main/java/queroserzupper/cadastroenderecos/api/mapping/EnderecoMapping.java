package queroserzupper.cadastroenderecos.api.mapping;

import queroserzupper.cadastroenderecos.api.request.EnderecoRequest;
import queroserzupper.cadastroenderecos.api.response.EnderecoResponse;
import queroserzupper.cadastroenderecos.model.Endereco;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EnderecoMapping {

    public static final EnderecoMapping INSTANCE = Mappers.getMapper(EnderecoMapping.class);

    public Endereco toEndereco(EnderecoRequest enderecoRequest);

    public abstract EnderecoResponse toEnderecoResponse(Endereco endereco);
}
