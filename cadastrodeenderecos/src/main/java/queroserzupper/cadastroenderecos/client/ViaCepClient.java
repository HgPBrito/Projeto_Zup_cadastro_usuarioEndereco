package queroserzupper.cadastroenderecos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cepClient",url = "https://viacep.com.br/ws")
public interface ViaCepClient {
    @GetMapping(value = "/{cep}/json/")
    DadosCep buscaCep(@PathVariable("cep") String cep);
}