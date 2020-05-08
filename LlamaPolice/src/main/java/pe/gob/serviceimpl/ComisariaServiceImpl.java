package pe.gob.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.dao.ComisariaDao;
import pe.gob.entity.Comisaria;
import pe.gob.service.ComisariaService;

@Named
@RequestScoped
public class ComisariaServiceImpl implements ComisariaService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private ComisariaDao cD;
	
	@Override
	public void eliminar(int idComisaria) {
		cD.eliminar(idComisaria);
	}

	@Override
	public List<Comisaria> listar() {
		// TODO Auto-generated method stub
		return cD.listar();
	}

}
