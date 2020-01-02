package negocio;

import java.util.List;

import javax.ejb.Local;
import modelo.Paciente;

@Local
public interface GestionPacienteLocal {
	
	public void guardarPaciente(int codigo,String nombre, String apellido, String cedula, String direccion, String telefono,String email, String clave);
	public List<Paciente> getPacientes();
	public List<Paciente> getPacientesNombre(String filtro);
	public void eliminaPacientesNombre(int codigo);
}
