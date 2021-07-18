package queroserzupper.cadastroenderecos.api.response;

public class EnderecoResponse {

    private long id;
    private String estado;
    private String cidade;
    private String cep;
    private String bairro;
    private String logradouro;
    private String complemento;
    private String numero;

    public EnderecoResponse(long id, String estado, String cidade, String cep, String bairro, String logradouro,
            String complemento, String numero) {
        this.id = id;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getNumero() {
        return numero;
    }
}