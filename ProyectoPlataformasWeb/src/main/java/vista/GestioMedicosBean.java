package vista;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionMedicoLocal;
import negocio.GestionPacienteLocal;
import modelo.Medico;
import modelo.Paciente;

@ManagedBean
public class GestioMedicosBean {
	
	
	@Inject
	private GestionMedicoLocal Gd;
	
	/*Bean Properties*/
	private int id;
	private String nombre;
	private String apellido;
	private String cedula;
	private String direccion;
	private String telefono;
	private String email;
	private String area;
	private String clave;
	private List<Medico> medicos;
	
	@PostConstruct
	public void init() {
		medicos= Gd.getMedicos(); 
	}
	
	
	public String guardarMedico() {
		Gd.guardarMedico(id, nombre, apellido, cedula, direccion, telefono, email,area,clave);
		medicos= Gd.getMedicos();
		
		return "listar_medico";
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


	public GestionMedicoLocal getGd() {
		return Gd;
	}


	public void setGd(GestionMedicoLocal gd) {
		Gd = gd;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public List<Medico> getMedicos() {
		return medicos;
	}


	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
