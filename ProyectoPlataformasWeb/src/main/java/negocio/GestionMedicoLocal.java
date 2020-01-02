package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Medico;

@Local
public interface GestionMedicoLocal {
	
	public void guardarMedico(int codigo,String nombre, String apellido, String cedula, String direccion, String telefono,String email, String area,String clave);
	public List<Medico> getMedicos();
	public List<Medico> getMedicosNombre(String filtro);
	public void eliminaMedicosNombre(int codigo);
}
