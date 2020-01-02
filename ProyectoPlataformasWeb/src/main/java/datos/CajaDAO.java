package datos;
 
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Caja;
import modelo.CitaMedica;
import modelo.Medico;



@Stateless
public class CajaDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Caja caja)
	{
		em.persist(caja);
		
	}
	
	public void update(Caja caja)
	{
		em.merge(caja);
		
	}
	
	public void remove(int codigo)
	{
		Caja caja= this.read(codigo);
		em.remove(caja);
		
	}
	
	public Caja read(int codigo)
	{
		Caja c=em.find(Caja.class, codigo);
		return cs;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<Caja> getCajas()
	{
		String jpql = "SELECT m FROM Caja m";
		Query q = em.createQuery(jpql, Caja.class);
		List<Caja> caja = q.getResultList();
		return caja;
		
	}
	
	
	public List<Caja> getCajaNombre(String filtro)
	{
		String jpql = "SELECT m FROM Caja m WHERE nombre LIKE ?1 ";
		Query q = em.createQuery(jpql, Caja.class);
		q.setParameter(1, "%"+filtro+"%");
		List<Caja> personas = q.getResultList();
		return personas;
		
	}
	
	
	

}

