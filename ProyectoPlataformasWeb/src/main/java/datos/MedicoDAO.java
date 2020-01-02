package datos;
 
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Medico;



@Stateless
public class MedicoDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Medico medico)
	{
		em.persist(medico);
		
	}
	
	public void update(Medico medico)
	{
		em.merge(medico);
		
	}
	
	public void remove(int codigo)
	{
		Medico medico= this.read(codigo);
		em.remove(medico);
		
	}
	
	public Medico read(int codigo)
	{
		Medico p=em.find(Medico.class, codigo);
		return p;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<Medico> getMedicos()
	{
		String jpql = "SELECT m FROM Medico m";
		Query q = em.createQuery(jpql, Medico.class);
		List<Medico> personas = q.getResultList();
		return personas;
		
	}
	
	
	public List<Medico> getMedicosNombre(String filtro)
	{
		String jpql = "SELECT m FROM Medico m WHERE nombre LIKE ?1 ";
		Query q = em.createQuery(jpql, Medico.class);
		q.setParameter(1, "%"+filtro+"%");
		List<Medico> personas = q.getResultList();
		return personas;
		
	}
	
	
	

}

