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
@Table(name = "Medico")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "codigo_medico")
	@NotNull
	private int codigo_medico;
	
	@OneToOne(targetEntity = Endereco_Medico.class)
	@JoinColumn(name= "id_endereco_medico")
	@NotNull
	private Endereco_Medico id_endereco;
	
	@Column(name= "nome", length = 50)
	@NotNull
	private String nome;
	
	@Column(name= "telefone", length = 11)
	@NotNull
	private String telefone;
	
	public int getCodigo_medico() {
		return codigo_medico;
	}
	public void setCodigo_medico(int codigo_medico) {
		this.codigo_medico = codigo_medico;
	}
	public Endereco_Medico getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(Endereco_Medico id_endereco) {
		this.id_endereco = id_endereco;
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
	
	@Override
	public String toString() {
		return "Medico [codigo_medico=" + codigo_medico + ", id_endereco=" + id_endereco + ", nome=" + nome
				+ ", telefone=" + telefone + "]";
	}
	
}
