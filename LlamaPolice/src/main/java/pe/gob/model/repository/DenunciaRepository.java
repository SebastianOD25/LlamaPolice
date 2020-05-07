package pe.gob.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.gob.model.entity.Denuncia;


@Named
public class DenunciaRepository implements Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="pwDU")
	private EntityManager em;
	
	public Long insert(Denuncia denuncia) throws Exception {
		em.persist(denuncia);
		return denuncia.getDenuncia_id();
	}

	public Long update(Denuncia denuncia) throws Exception {
		em.merge(denuncia);
		return denuncia.getDenuncia_id();
	}

	public void delete(Denuncia denuncia) throws Exception {
		em.remove(denuncia);
	}
	
	public List<Denuncia> EncontrarT() throws Exception {
		List<Denuncia> denuncias = new ArrayList<>();
		
		TypedQuery<Denuncia> query = em.createQuery("FROM Denuncia d", Denuncia.class);
		denuncias = query.getResultList();
		
		return denuncias;		
	}
	
	public List<Denuncia> EncontrarD(String delito) throws Exception {
		List<Denuncia> denuncias = new ArrayList<>();
		
		TypedQuery<Denuncia> query = em.createQuery("FROM Denuncia d WHERE d.nombre_delitos LIKE ?1", Denuncia.class);
		query.setParameter(1, "%" + delito + "%" );
		denuncias = query.getResultList();
		
		return denuncias;		
	}
	
	public List<Denuncia> EncontrarC(String comisaria) throws Exception {
		List<Denuncia> denuncias = new ArrayList<>();
		
		TypedQuery<Denuncia> query = em.createQuery("FROM Denuncia d WHERE d.nombre_comisaria LIKE ?1", Denuncia.class);
		query.setParameter(1, "%" + comisaria + "%" );
		denuncias = query.getResultList();
		
		return denuncias;		
	}
}
