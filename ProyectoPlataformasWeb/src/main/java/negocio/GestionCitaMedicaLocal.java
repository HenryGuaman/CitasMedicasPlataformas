package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.CitaMedica;
import modelo.Medico;
import modelo.Paciente;

@Local
public interface GestionCitaMedicaLocal {
	
	public void guardarCitaMedica(int codigo,Paciente paciente, Medico medico, String fecha, String turno);
	public List<CitaMedica> getCitasMedicas();
	public List<CitaMedica> getCitasMedicasNombre(String filtro);
}
