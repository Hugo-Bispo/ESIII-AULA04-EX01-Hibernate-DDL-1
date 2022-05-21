package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_paciente")
	@NotNull
	private int id_paciente;

	@OneToOne(targetEntity = Endereco_Paciente.class)
	@JoinColumn(name= "id_endereco_paciente")
	@NotNull
	private Endereco_Paciente endereco_paciente;
	
	@Column(name= "nome", length = 50)
	@NotNull
	private String nome;
	
	@Column(name= "telefone", length = 11)
	@NotNull
	private String telefone;
	
	@Column(name= "numero_beneficiario")
	@NotNull
	private int numero_beneficiario;
	
	public int getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	public Endereco_Paciente getId_endereco() {
		return endereco_paciente;
	}
	public void setId_endereco(Endereco_Paciente id_endereco) {
		this.endereco_paciente = id_endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getNumero_beneficiario() {
		return numero_beneficiario;
	}
	public void setNumero_beneficiario(int numero_beneficiario) {
		this.numero_beneficiario = numero_beneficiario;
	}
	public String toString() {
		return "Paciente [id_paciente=" + id_paciente + ", id_endereco=" + endereco_paciente + ", nome=" + nome
				+ ", telefone=" + telefone + ", numero_beneficiario=" + numero_beneficiario + "]";
	}
	
}
