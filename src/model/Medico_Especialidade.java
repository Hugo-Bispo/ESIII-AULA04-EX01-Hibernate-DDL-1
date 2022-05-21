package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico_especialidade")
public class Medico_Especialidade {
	@Id
	@JoinColumn(name = "codigo_medico")
	@ManyToOne(targetEntity = Medico.class)
	@NotNull
	private Medico id_codigo_medico;
	
	@Id
	@JoinColumn(name= "id_especialidade")
	@ManyToOne(targetEntity = Especialidade.class)
	@NotNull
	private Especialidade id_especialidade;
	
	public Medico getId_codigo_medico() {
		return id_codigo_medico;
	}
	public void setId_codigo_medico(Medico id_codigo_medico) {
		this.id_codigo_medico = id_codigo_medico;
	}
	public Especialidade getId_especialidade() {
		return id_especialidade;
	}
	public void setId_especialidade(Especialidade id_especialidade) {
		this.id_especialidade = id_especialidade;
	}
	
	@Override
	public String toString() {
		return "Medico_Especialidade [id_codigo_medico=" + id_codigo_medico + ", id_especialidade=" + id_especialidade
				+ "]";
	}
	
	
}
