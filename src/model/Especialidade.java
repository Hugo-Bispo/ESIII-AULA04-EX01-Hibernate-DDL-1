package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "especialidade")
public class Especialidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_especialidade")
	@NotNull
	private int id_especialidade;
	
	@Column(name= "nome_especialidade", length = 20)
	@NotNull
	private String nome_especialidade;
	
	public int getId_especialidade() {
		return id_especialidade;
	}
	public void setId_especialidade(int id_especialidade) {
		this.id_especialidade = id_especialidade;
	}
	public String getNome_especialidade() {
		return nome_especialidade;
	}
	public void setNome_especialidade(String nome_especialidade) {
		this.nome_especialidade = nome_especialidade;
	}
	
	@Override
	public String toString() {
		return "Especialidade [id_especialidade=" + id_especialidade + ", nome_especialidade=" + nome_especialidade
				+ "]";
	}
	
	
}
