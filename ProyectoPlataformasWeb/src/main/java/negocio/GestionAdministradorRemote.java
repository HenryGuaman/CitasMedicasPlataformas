package negocio;

import java.util.List;


import javax.ejb.Remote;

import modelo.Administrador;
import modelo.Paciente;
@Remote
public interface GestionAdministradorRemote {
	
	public void guardarAdministrador(int codigo,String nombre, String apellido, String cedula, String direccion, String telefono,String email, String clave);
	public List<Administrador> getAdministrador();
}
