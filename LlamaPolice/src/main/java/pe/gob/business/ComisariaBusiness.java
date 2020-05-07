package pe.gob.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.model.entity.Comisaria;
import pe.gob.model.repository.ComisariaRepository;

@Named
public class ComisariaBusiness implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private ComisariaRepository comisariarepository;
	
	public List<Comisaria> EncontrarT() throws Exception {
		return comisariarepository.EncontrarT();		
	}
}
