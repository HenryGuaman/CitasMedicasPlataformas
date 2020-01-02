package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CitaMedica implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4081883801015277020L;
	@Id
	private int id;
	private Paciente paciente;
	private Medico medico;
	private String fecha;
	private String turno;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public Paciente getPaciente() {
		return paciente;
	}




	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}








	public Medico getMedico() {
		return medico;
	}








	public void setMedico(Medico medico) {
		this.medico = medico;
	}








	public String getFecha() {
		return fecha;
	}








	public void setFecha(String fecha) {
		this.fecha = fecha;
	}








	public String getTurno() {
		return turno;
	}








	public void setTurno(String turno) {
		this.turno = turno;
	}








	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", paciente=" + paciente + ", medico=" + medico + ", fecha=" + fecha
				+ ", turno=" + turno + "]";
	}
	

	
	

	
	
	
}
