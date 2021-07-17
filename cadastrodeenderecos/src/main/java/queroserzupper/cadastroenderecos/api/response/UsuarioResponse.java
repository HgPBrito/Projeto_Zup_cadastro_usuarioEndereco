package queroserzupper.cadastroenderecos.api.response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsuarioResponse {

    private long id;
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private String email;
    private List<EnderecoResponse> enderecos = new ArrayList<>();

    public UsuarioResponse(long id, String nome, String cpf, LocalDate nascimento, String email, List<EnderecoResponse> enderecos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.enderecos = enderecos;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getEmail() {
        return email;
    }

    public List<EnderecoResponse> getEnderecos() {
        return enderecos;
    }
}
