package pe.gob.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.gob.dao.DenunciaDao;
import pe.gob.entity.Denuncia;
import pe.gob.service.DenunciaService;

public class DenunciaServiceImpl implements DenunciaService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private DenunciaDao dDe;
	
	@Override
	public void insert(Denuncia denuncia) {
		dDe.insert(denuncia);
	}

	@Override
	public List<Denuncia> list() {
		// TODO Auto-generated method stub
		return dDe.list();
	}

	@Override
	public void delete(int idDenuncia) {
		dDe.delete(idDenuncia);
	}

}