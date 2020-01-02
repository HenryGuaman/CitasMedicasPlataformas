package vista;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionPacienteLocal;


@ManagedBean
public class EliminaPacientesBean {
	@Inject
	private GestionPacienteLocal gl;
	
	
	/*Beans properties*/
	private String filtro;
	private int codigo;
	
	public String eliminaPaciente() {
		System.out.println("Entrandooooo");
		gl.eliminaPacientesNombre(codigo);
		
		return filtro;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
