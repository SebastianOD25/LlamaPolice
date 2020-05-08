package pe.gob.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.gob.dao.PersonaDao;
import pe.gob.entity.Persona;

public class PersonaDaoImpl implements PersonaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager emP;

	@Transactional
	@Override
	public void insertar(Persona persona) {
		try {
			emP.persist(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	@Transactional
	@Override
	public void eliminar(int idPersona) {
		
		Persona per = new Persona();
		try {
			per =emP.getReference(Persona.class, idPersona);
			emP.remove(per);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<Persona>();
		try {
			Query q =emP.createQuery("select p from Persona p");
			lista = (List<Persona>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	
}
