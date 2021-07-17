package queroserzupper.cadastroenderecos.api.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EnderecoRequest {

    private long id;

    @NotNull
    @Size(min = 2, max = 60, message = "Precisa ter emtre 2 a 60 caracteres")
    private String estado;

    @NotNull
    @Size(min = 1, max = 60, message = "Precisa ter emtre 2 a 60 caracteres")
    private String cidade;

    @NotNull
    @Size(min = 8, max = 8, message = "Precisa ter 8 caracteres")
    private String cep;

    @NotNull
    @Size(min = 1, max = 100, message = "Precisa ter emtre 1 a 100 caracteres")
    private String bairro;

    @NotNull
    @Size(min = 1, max = 255, message = "Precisa ter emtre 1 a 255 caracteres")
    private String logradouro;

    @NotNull
    private String complemento;

    @NotNull
    @Size(min = 1, max = 10, message = "Precisa ter emtre 1 a 10 caracteres")
    private String numero;

    @NotNull
    private Long id_usuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
}
