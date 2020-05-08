package pe.gob.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.gob.dao.DenunciaDao;
import pe.gob.entity.Denuncia;

public class DenunciaDaoImpl implements DenunciaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager emDe;

	@Transactional
	@Override
	public void insert(Denuncia denuncia) {
		try {
			emDe.persist(denuncia);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Denuncia> list() {
		List<Denuncia> lista = new ArrayList<Denuncia>();
		try {
			Query q = emDe.createQuery("select p from Part p");
			lista = (List<Denuncia>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;

	}

	@Transactional
	@Override
	public void delete(int idDenuncia) {
		Denuncia d = new Denuncia();
		try {
			d = emDe.getReference(Denuncia.class, idDenuncia);
			emDe.remove(d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	
}