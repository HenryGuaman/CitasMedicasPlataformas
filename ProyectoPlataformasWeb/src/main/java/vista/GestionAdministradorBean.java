package vista;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionAdministradorLocal;
import negocio.GestionPacienteLocal;
import modelo.Administrador;
import modelo.Paciente;

@ManagedBean
public class GestionAdministradorBean {
	
	
	@Inject
	private GestionAdministradorLocal Gd;
	
	/*Bean Properties*/
	private int id;
	private String nombre;
	private String apellido;
	private String cedula;
	private String direccion;
	private String telefono;
	private String email;
	private String clave;
	
	private List<Administrador> administradores;
	
	@PostConstruct
	public void init() {
		administradores= Gd.getAdministradores();
	}
	
	
	public String guardarAdministrador() {
		Gd.guardarAdministrador(id, nombre, apellido, cedula, direccion, telefono, email, clave);
		administradores=Gd.getAdministradores();
		
		return "listar_administradores";
	}


	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public GestionAdministradorLocal getGd() {
		return Gd;
	}


	public void setGd(GestionAdministradorLocal gd) {
		Gd = gd;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public List<Administrador> getAdministradores() {
		return administradores;
	}


	public void setAdministradores(List<Administrador> administradores) {
		this.administradores = administradores;
	}



	

}
