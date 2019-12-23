package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Paciente;

@Stateless
public class PacienteDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Paciente persona)
	{
		em.persist(persona);
		
	}
	
	public void update(Paciente persona)
	{
		em.merge(persona);
		
	}
	
	public void remove(int codigo)
	{
		Paciente persona= this.read(codigo);
		em.remove(persona);
		
	}
	
	public Paciente read(int codigo)
	{
		Paciente p=em.find(Paciente.class, codigo);
		return p;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<Paciente> getPacientes()
	{
		String jpql = "SELECT p FROM Paciente p";
		Query q = em.createQuery(jpql, Paciente.class);
		List<Paciente> personas = q.getResultList();
		return personas;
		
	}
	
	
	public List<Paciente> getPacientesNombre(String filtro)
	{
		String jpql = "SELECT p FROM Paciente p WHERE nombre LIKE ?1 ";
		Query q = em.createQuery(jpql, Paciente.class);
		q.setParameter(1, "%"+filtro+"%");
		List<Paciente> personas = q.getResultList();
		return personas;
		
	}
	
	
	

}
