package pe.gob.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.dao.PersonaDao;
import pe.gob.entity.Persona;
import pe.gob.service.PersonaService;

@Named
@RequestScoped
public class PersonaServiceImpl implements PersonaService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private PersonaDao pD;
	
	@Override
	public void eliminar(int idPersona) {
		pD.eliminar(idPersona);
	}

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return pD.listar();
	}

	@Override
	public void insertar(Persona persona) {
		pD.insertar(persona);
	}

}
