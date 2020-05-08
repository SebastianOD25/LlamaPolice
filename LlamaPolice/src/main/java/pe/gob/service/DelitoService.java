package pe.gob.service;

import java.util.List;

import pe.gob.entity.Delito;

public interface DelitoService {

	public void eliminar(int idDelito);
	
	public List<Delito> listar();
}
