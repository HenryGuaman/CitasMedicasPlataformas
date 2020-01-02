package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.CitaMedica;
import modelo.Medico;
import modelo.Paciente;
import negocio.GestionCitaMedicaLocal;
import negocio.GestionMedicoLocal;
import negocio.GestionPacienteLocal;


@ManagedBean
public class BusquedaCitaMedicaBean {
	
	@Inject
	private GestionCitaMedicaLocal gl;
	
	/*Bean Properties*/
	private String filtro;
	
	private List<CitaMedica> citaMedica;
	
	
	public String BuscarCitaMedica()
	{
		citaMedica=gl.getCitasMedicasNombre(filtro);
		return filtro;
	}



	

	public GestionCitaMedicaLocal getGl() {
		return gl;
	}





	public void setGl(GestionCitaMedicaLocal gl) {
		this.gl = gl;
	}





	public List<CitaMedica> getCitaMedica() {
		return citaMedica;
	}





	public void setCitaMedica(List<CitaMedica> citaMedica) {
		this.citaMedica = citaMedica;
	}





	public String getFiltro() {
		return filtro;
	}


	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	

}