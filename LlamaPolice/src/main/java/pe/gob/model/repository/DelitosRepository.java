package pe.gob.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.gob.model.entity.Delitos;



@Named
public class DelitosRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwDU")
	private EntityManager em;
		
	public List<Delitos> EncontrarT() throws Exception {
		List<Delitos> delito = new ArrayList<>();
		
		TypedQuery<Delitos> query = em.createQuery("SELECT d FROM Delitos d", Delitos.class);
		delito = query.getResultList();
		
		return delito;		
	}
}
