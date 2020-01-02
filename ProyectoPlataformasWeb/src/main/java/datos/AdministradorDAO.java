package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Administrador;
import modelo.Paciente;

@Stateless
public class AdministradorDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Administrador persona)
	{
		em.persist(persona);
		
	}
	
	public void update(Administrador persona)
	{
		em.merge(persona);
		
	}
	
	public void remove(int codigo)
	{
		Administrador persona= this.read(codigo);
		em.remove(persona);
		
	}
	
	public Administrador read(int codigo)
	{
		Administrador p=em.find(Administrador.class, codigo);
		return p;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<Administrador> getAdministradores()
	{
		String jpql = "SELECT p FROM Administrador p";
		Query q = em.createQuery(jpql, Administrador.class);
		List<Administrador> personas = q.getResultList();
		return personas;
		
	}
	
	
	public List<Administrador> getPacientesNombre(String filtro)
	{
		String jpql = "SELECT p FROM Administrador p WHERE nombre LIKE ?1 ";
		Query q = em.createQuery(jpql, Administrador.class);
		q.setParameter(1, "%"+filtro+"%");
		List<Administrador> personas = q.getResultList();
		return personas;
		
	}
	
	
	

}
