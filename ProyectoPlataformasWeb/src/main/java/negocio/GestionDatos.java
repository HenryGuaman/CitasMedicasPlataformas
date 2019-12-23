package negocio;

import java.util.List;


import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.MedicoDAO;
import datos.PacienteDAO;

import modelo.Medico;
//GestionAutorLocal
import modelo.Paciente;


@Stateless
public class GestionDatos implements  GestionPacienteRemote ,GestionPacienteLocal,GestionMedicoLocal, GestionMedicoRemote {
	
	
	@Inject
	private PacienteDAO daoPr;
	@Inject
	private MedicoDAO daoMed;
	
	
	
	
	public void guardarPaciente(int codigo,String nombre, String apellido, String cedula, String direccion, String telefono,String email){
		Paciente P = new Paciente();
		P.setId(codigo);
		P.setNombre(nombre);
		P.setApellido(apellido);
		P.setCedula(cedula);
		P.setDireccion(direccion);
		P.setTelefono(telefono);
		P.setEmail(email);
		daoPr.insert(P);
	}
	
	public List<Paciente> getPacientes(){
		return daoPr.getPacientes();
	}
	
	public List<Paciente> getPacientesNombre(String filtro)
	{
		return daoPr.getPacientesNombre(filtro);
	}
	
	public void guardarMedico(int codigo,String nombre, String apellido, String cedula, String direccion, String telefono,String email, String area){
		Medico m = new Medico(); 
		m.setId(codigo);
		m.setNombre(nombre);
		m.setApellido(apellido);
		m.setCedula(cedula);
		m.setDireccion(direccion);
		m.setTelefono(telefono);
		m.setEmail(email);
		m.setArea(area);
		daoMed.insert(m);
		
	}
	
	public List<Medico> getMedicos(){
		return daoMed.getMedicos();
	}
	
	public List<Medico> getMedicosNombre(String filtro)
	{
		return daoMed.getMedicosNombre(filtro);
	}


	public MedicoDAO getDaoMed() {
		return daoMed;
	}

	public void setDaoMed(MedicoDAO daoMed) {
		this.daoMed = daoMed;
	}

	
	

	public PacienteDAO getDaoPr() {
		return daoPr;
	}

	public void setDaoPr(PacienteDAO daoPr) {
		this.daoPr = daoPr;
	}
	

	@Override
	public List<Paciente> getPaciente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Medico> getMedico() {
		// TODO Auto-generated method stub
		return null;
	}

}
