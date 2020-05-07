package pe.gob.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.gob.model.entity.Personas;



@Named
public class PersonasRepository implements Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pwDU")
	private EntityManager em;
		
	public List<Personas> EncontrarT() throws Exception {
		List<Personas> persona = new ArrayList<>();
		
		TypedQuery<Personas> query = em.createQuery("SELECT u FROM Usuarios u", Personas.class);
		persona = query.getResultList();
		
		return persona;		
	}
}
