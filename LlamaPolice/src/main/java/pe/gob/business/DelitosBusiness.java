package pe.gob.business;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.model.entity.Delitos;
import pe.gob.model.repository.DelitosRepository;

@Named
public class DelitosBusiness {

	@Inject
	private DelitosRepository delitosrepository;
	
	public List<Delitos> EncontrarT() throws Exception {
		return delitosrepository.EncontrarT();		
	}
}
