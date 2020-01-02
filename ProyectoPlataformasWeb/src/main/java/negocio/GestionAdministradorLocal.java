package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Administrador;
import modelo.Medico;

@Local
public interface GestionAdministradorLocal {
	
	public void guardarAdministrador(int codigo,String nombre, String apellido, String cedula, String direccion, String telefono,String email, String clave);
	public List<Administrador> getAdministradores();
	public List<Administrador> getAdministradorNombre(String filtro);
}
