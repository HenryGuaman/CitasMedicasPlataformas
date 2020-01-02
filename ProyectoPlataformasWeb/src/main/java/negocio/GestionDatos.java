package negocio;

import java.util.List;


import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.CitaMedicaDAO;
import datos.MedicoDAO;
import datos.PacienteDAO;
import modelo.CitaMedica;
import modelo.Medico;
import modelo.Paciente;


@Stateless
public class GestionDatos implements  GestionPacienteRemote ,GestionPacienteLocal,GestionMedicoLocal, GestionMedicoRemote,GestionCitaMedicaLocal, GestionCitaMedicaRemote {
	
	
	@Inject
	private PacienteDAO daoPr;
	@Inject
	private MedicoDAO daoMed;
	
	@Inject
	private CitaMedicaDAO daoCiM;
	
	
	//metodos para pacientes
	
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
	
	public void eliminaPacientesNombre(int codigo)
	{
		System.out.println("Metodo eliminar");
		daoPr.remove(codigo);
	}

	// metodos para citas medicas
	public void guardarCitaMedica(int codigo,Paciente paciente, Medico medico, String fecha, String turno){
		CitaMedica cm = new CitaMedica();
		cm.setId(codigo);
		cm.setPaciente(paciente);
		cm.setMedico(medico);
		cm.setFecha(fecha);
		cm.setTurno(turno);
		daoCiM.insert(cm);
	}
	
	public List<CitaMedica> getCitasMedicas(){
		return daoCiM.getCitasMedicas();
	}
	
	public List<CitaMedica> getCitasMedicasNombre(String filtro)
	{
		return daoCiM.getCitasMedicasNombre(filtro);
	}
	
	//metodos para medicos
	
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
	
	

	public CitaMedicaDAO getDaoCiM() {
		return daoCiM;
	}

	public void setDaoCiM(CitaMedicaDAO daoCiM) {
		this.daoCiM = daoCiM;
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


	 @Override
	public List<CitaMedica> getCitaMedica() {
		// TODO Auto-generated method stub
		return null;
	}

}
