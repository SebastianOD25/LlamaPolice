package pe.gob.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.gob.dao.DelitoDao;
import pe.gob.entity.Delito;

public class DelitoDaoImpl implements DelitoDao, Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager emD;
	
	@Override
	public void eliminar(int idDelito) {
		Delito del = new Delito();
		try {
			del = emD.getReference(Delito.class, idDelito);
			emD.remove(del);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Delito> listar() {
		List<Delito> lista = new ArrayList<Delito>();
		try {
			Query q = emD.createQuery("select m from Delito m");
			lista = (List<Delito>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

}
