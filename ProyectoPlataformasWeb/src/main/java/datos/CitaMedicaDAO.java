package datos;
 
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.CitaMedica;
import modelo.Medico;



@Stateless
public class CitaMedicaDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(CitaMedica citamedica)
	{
		em.persist(citamedica);
		
	}
	
	public void update(CitaMedica citamedica)
	{
		em.merge(citamedica);
		
	}
	
	public void remove(int codigo)
	{
		CitaMedica citamedica= this.read(codigo);
		em.remove(citamedica);
		
	}
	
	public CitaMedica read(int codigo)
	{
		CitaMedica p=em.find(CitaMedica.class, codigo);
		return p;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<CitaMedica> getCitasMedicas()
	{
		String jpql = "SELECT m FROM CitaMedica m";
		Query q = em.createQuery(jpql, CitaMedica.class);
		List<CitaMedica> personas = q.getResultList();
		return personas;
		
	}
	
	
	public List<CitaMedica> getCitasMedicasNombre(String filtro)
	{
		String jpql = "SELECT m FROM CitaMedica m WHERE nombre LIKE ?1 ";
		Query q = em.createQuery(jpql, CitaMedica.class);
		q.setParameter(1, "%"+filtro+"%");
		List<CitaMedica> personas = q.getResultList();
		return personas;
		
	}
	
	
	

}

