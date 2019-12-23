package negocio;

import java.util.List;


import javax.ejb.Remote;

import modelo.Medico;
@Remote
public interface GestionMedicoRemote {
	
	public void guardarMedico(int codigo,String nombre, String apellido, String cedula, String direccion, String telefono,String email, String area);
	public List<Medico> getMedico();
}
