package queroserzupper.cadastroenderecos.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "TB_ENDERECO")
public class Endereco {

	@Id
	@Column(name = "cd_endereco")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nm_estado", nullable = false, length = 60)
	private String estado;
	
	@Column(name = "nm_cidade", nullable = false, length = 60)
	private String cidade;
	
	@Column(name = "cd_cep", nullable = false, length = 8)
	private String cep;
	
	@Column(name = "nm_bairro", nullable = false, length = 100)
	private String bairro;
	
	@Column(name = "nm_logradouro", nullable = false, length = 255)
	private String logradouro;
	
	@Column(name = "nm_complemento", length = 255)			
	private String complemento;	
	
	@Column(name = "cd_numero", nullable = false, length = 10)
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "cd_usuario", referencedColumnName = "cd_usuario")
	private Usuario usuario;

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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
