package queroserzupper.cadastroenderecos.api.request;

import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class UsuarioRequest {

    private long id;

    @NotNull
    @Size(min = 2, max = 100, message = "Precisa ter emtre 2 a 100 caracteres")
    private String nome;

    @NotNull
    @CPF
    @Size(min = 11, max = 11, message = "Precisa ter 11 caracteres")
    private String cpf;

    @NotNull
    private LocalDate nascimento;

    @Email
    @NotNull
    @Size(min = 5, max = 60, message = "Precisa ter emtre 5 a 60 caracteres")
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
