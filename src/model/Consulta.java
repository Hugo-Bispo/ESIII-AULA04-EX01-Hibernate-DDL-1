package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "consulta")

public class Consulta {
	
	@Id
	@ManyToOne(targetEntity = Paciente.class)
	@JoinColumn(name = "id_paciente")
	@NotNull
	private Paciente consulta_id_paciente;
	
	@Id
	@ManyToOne(targetEntity = Medico.class)
	@JoinColumn(name = "codigo_medico")
	@NotNull
	private Medico consulta_codigo_medico;
	
	@Id
	@Column(name= "data_consulta")
	@NotNull
	private LocalDate data_consulta;
	
	@Id
	@ManyToOne(targetEntity = Observacao.class)
	@JoinColumn(name = "id_observacao" )
	@NotNull
	private Observacao observacao;
	
	public Paciente getId_paciente() {
		return consulta_id_paciente;
	}
	public void setId_paciente(Paciente id_paciente) {
		this.consulta_id_paciente = id_paciente;
	}
	public Medico getCodigo_medico() {
		return consulta_codigo_medico;
	}
	public void setCodigo_medico(Medico codigo_medico) {
		this.consulta_codigo_medico = codigo_medico;
	}
	public LocalDate getData_consulta() {
		return data_consulta;
	}
	public void setData_consulta(LocalDate data_consulta) {
		this.data_consulta = data_consulta;
	}
	public Observacao getId_observacao() {
		return observacao;
	}
	public void setId_observacao(Observacao id_observacao) {
		this.observacao = id_observacao;
	}
	
	@Override
	public String toString() {
		return "Consulta [id_paciente=" + consulta_id_paciente + ", codigo_medico=" + consulta_codigo_medico + ", data_consulta="
				+ data_consulta + ", id_observacao=" + observacao + "]";
	}
	
	

}
