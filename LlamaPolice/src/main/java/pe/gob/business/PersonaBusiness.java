package pe.gob.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.model.entity.Personas;
import pe.gob.model.repository.PersonasRepository;

@Named
public class PersonaBusiness implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private PersonasRepository personarepository;
	
	public List<Personas> EncontrarT() throws Exception {
		return personarepository.EncontrarT();		
	}
	
}
