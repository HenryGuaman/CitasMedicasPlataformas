package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Administrador;
import modelo.Paciente;
import negocio.GestionAdministradorLocal;
import negocio.GestionPacienteLocal;


@ManagedBean
public class BusquedaAdministradorBean {
	
	@Inject
	private GestionAdministradorLocal gl;
	
	/*Bean Properties*/
	private String filtro;
	
	private List<Administrador> administradores;
	
	public String getFiltro() {
		return filtro;
	}


	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}


	

	public GestionAdministradorLocal getGl() {
		return gl;
	}


	public void setGl(GestionAdministradorLocal gl) {
		this.gl = gl;
	}


	public List<Administrador> getAdministradores() {
		return administradores;
	}


	public void setAdministradores(List<Administrador> administradores) {
		this.administradores = administradores;
	}


	public String buscarPaciente() {
		
		administradores = gl.getAdministradorNombre(filtro);
		System.out.println("hola mundo");
		return filtro;
	}

	

}