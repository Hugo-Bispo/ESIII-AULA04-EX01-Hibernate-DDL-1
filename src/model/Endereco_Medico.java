package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Endereco_Medico")
public class Endereco_Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_endereco_medico")
	@NotNull
	private int id_endereco;
	
	@Column(name= "logadouro", length = 50)
	@NotNull
	private String logadouro;
	
	@Column(name= "numero")
	@NotNull
	private int numero;
	
	@Column(name= "cep")
	@NotNull
	private int cep;
	
	@Column(name= "complemento", length = 0)
	private String complemento;
	
	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@Override
	public String toString() {
		return "Endereco_Paciente [id_endereco=" + id_endereco + ", logadouro=" + logadouro + ", numero=" + numero
				+ ", cep=" + cep + ", complemento=" + complemento + "]";
	}
	

}
