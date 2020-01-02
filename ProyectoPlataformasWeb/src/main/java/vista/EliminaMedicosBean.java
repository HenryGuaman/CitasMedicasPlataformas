package vista;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionMedicoLocal;
import negocio.GestionPacienteLocal;


@ManagedBean
public class EliminaMedicosBean {
	@Inject
	private GestionMedicoLocal gl;
	
	
	/*Beans properties*/
	private int codigo;
	
	public int eliminaMedico() {
		
		System.out.println("Entrandooooo");
		gl.getMedicos();
		gl.eliminaMedicosNombre(codigo);
		return 0;
		
	}

	
	public GestionMedicoLocal getGl() {
		return gl;
	}


	public void setGl(GestionMedicoLocal gl) {
		this.gl = gl;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
