package vista;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionPacienteLocal;
import modelo.Paciente;

@ManagedBean
public class GestionPacientesBean {
	
	
	@Inject
	private GestionPacienteLocal Gd;
	
	/*Bean Properties*/
	private int id;
	private String nombre;
	private String apellido;
	private String cedula;
	private String direccion;
	private String telefono;
	private String email;
	
	private List<Paciente> pacientes;
	
	@PostConstruct
	public void init() {
		pacientes= Gd.getPacientes(); 
	}
	
	
	public String guardarPaciente() {
		Gd.guardarPaciente(id, nombre, apellido, cedula, direccion, telefono, email);
		pacientes= Gd.getPacientes(); 
		
		return "listar_pacientes";
	}


	public GestionPacienteLocal getGd() {
		return Gd;
	}


	public void setGd(GestionPacienteLocal gd) {
		Gd = gd;
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


	public List<Paciente> getPacientes() {
		return pacientes;
	}


	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}


	

}
