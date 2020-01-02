package negocio;

import java.util.List;


import javax.ejb.Remote;

import modelo.CitaMedica;
import modelo.Medico;
import modelo.Paciente;
@Remote
public interface GestionCitaMedicaRemote {
	
	public void guardarCitaMedica(int codigo,Paciente paciente, Medico medico, String fecha, String turno);
	public List<CitaMedica> getCitaMedica();
}
