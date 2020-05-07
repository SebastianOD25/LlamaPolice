package pe.gob.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.gob.model.entity.Denuncia;
import pe.gob.model.repository.DenunciaRepository;


@Named
public class DenunciaBusiness implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private DenunciaRepository denunciarepository;
	
	@Transactional
	public Long insertar(Denuncia denuncia) throws Exception{
		return denunciarepository.insert(denuncia);
	}
	
	public Long update(Denuncia denuncia) throws Exception{
		return denunciarepository.update(denuncia);
	}

	@Transactional
	public void delete(Denuncia denuncia) throws Exception{
		denunciarepository.delete(denuncia);
	}
	
	public List<Denuncia> EncontrarT() throws Exception{
		return denunciarepository.EncontrarT();
	}
		
	public List<Denuncia> EncontrarD(String delito) throws Exception{
			return denunciarepository.EncontrarD(delito);
	}
	public List<Denuncia> EncontrarC(String comisaria) throws Exception{
		return denunciarepository.EncontrarC(comisaria);
		}
}
