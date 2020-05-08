package pe.gob.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.dao.DelitoDao;
import pe.gob.entity.Delito;
import pe.gob.service.DelitoService;

@Named
@RequestScoped
public class DelitoServiceImpl implements DelitoService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private DelitoDao dD;
	
	@Override
	public void eliminar(int idDelito) {
		dD.eliminar(idDelito);
	}

	@Override
	public List<Delito> listar() {
		// TODO Auto-generated method stub
		return dD.listar();
	}

}
