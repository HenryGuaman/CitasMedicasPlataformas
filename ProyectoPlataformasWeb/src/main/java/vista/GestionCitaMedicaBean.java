package vista;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionCitaMedicaLocal;
import negocio.GestionMedicoLocal;
import negocio.GestionPacienteLocal;
import modelo.CitaMedica;
import modelo.Medico;
import modelo.Paciente;

@ManagedBean
public class GestionCitaMedicaBean {
	
	
	@Inject
	private GestionCitaMedicaLocal Gd;
	
	/*Bean Properties*/
	private int id;
	private Paciente paciente;
	private Medico medico;
	private String fecha;
	private String turno;
	private List<CitaMedica> citamedica;
	
	@PostConstruct
	public void init() {
		citamedica =Gd.getCitasMedicas();
	}
	
	
	public String guardarCitaMedica() {
		Gd.guardarCitaMedica(id, paciente, medico, fecha, turno);
		citamedica=Gd.getCitasMedicas();
		
		return "listar_citaMedica";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public GestionCitaMedicaLocal getGd() {
		return Gd;
	}


	public void setGd(GestionCitaMedicaLocal gd) {
		Gd = gd;
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


	public List<CitaMedica> getCitamedica() {
		return citamedica;
	}


	public void setCitamedica(List<CitaMedica> citamedica) {
		this.citamedica = citamedica;
	}


	
	

}
