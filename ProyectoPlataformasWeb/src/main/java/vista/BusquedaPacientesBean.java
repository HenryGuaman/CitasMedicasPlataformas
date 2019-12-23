package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Paciente;
import negocio.GestionPacienteLocal;


@ManagedBean
public class BusquedaPacientesBean {
	
	@Inject
	private GestionPacienteLocal gl;
	
	/*Bean Properties*/
	private String filtro;
	
	private List<Paciente> pacientes;
	
	
	public String BuscarPaciente()
	{
		pacientes = gl.getPacientesNombre();
		return null;
	}


	public GestionPacienteLocal getGl() {
		return gl;
	}


	public void setGl(GestionPacienteLocal gl) {
		this.gl = gl;
	}


	public String getFiltro() {
		return filtro;
	}


	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}


	public List<Paciente> getPacientes() {
		return pacientes;
	}


	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	

	

}