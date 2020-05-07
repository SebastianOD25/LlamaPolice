package pe.gob.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.gob.model.entity.Comisaria;



@Named
public class ComisariaRepository implements Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pwDU")
	private EntityManager em;
		
	public List<Comisaria> EncontrarT() throws Exception {
		List<Comisaria> comisarias = new ArrayList<>();
		
		TypedQuery<Comisaria> query = em.createQuery("SELECT c FROM Comisaria c", Comisaria.class);
		comisarias = query.getResultList();
		
		return comisarias;		
	}
}
