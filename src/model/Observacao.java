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
@Table(name = "observacaS")
public class Observacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_observacao")
	@NotNull
	private int id_observacao;
	
	@OneToOne(targetEntity = Especialidade.class)
	@JoinColumn(name= "id_especialidade")
	@NotNull
	private Especialidade id_especialidade;
	
	@Column(name= "descricao", length = 1000)
	@NotNull
	private String descricao;
	
	public int getId_observacao() {
		return id_observacao;
	}
	public void setId_observacao(int id_observacao) {
		this.id_observacao = id_observacao;
	}
	public Especialidade getId_especialidade() {
		return id_especialidade;
	}
	public void setId_especialidade(Especialidade id_especialidade) {
		this.id_especialidade = id_especialidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Observacao [id_observacao=" + id_observacao + ", id_especialidade=" + id_especialidade + ", descricao="
				+ descricao + "]";
	}
	
	
}
