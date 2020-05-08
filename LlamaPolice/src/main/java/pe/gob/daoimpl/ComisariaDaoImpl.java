package pe.gob.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.gob.dao.ComisariaDao;
import pe.gob.entity.Comisaria;

public class ComisariaDaoImpl implements ComisariaDao, Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager emC;
	
	@Transactional
	@Override
	public void eliminar(int idComisaria) {
		Comisaria com = new Comisaria();
		try {
			com = emC.getReference(Comisaria.class, idComisaria);
			emC.remove(com);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Comisaria> listar() {
		List<Comisaria> lista = new ArrayList<Comisaria>();
		try {
			Query q = emC.createQuery("select c from Comisaria c");
			lista = (List<Comisaria>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	
}
