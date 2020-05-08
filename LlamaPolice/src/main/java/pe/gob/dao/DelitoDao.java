package pe.gob.dao;

import java.util.List;

import pe.gob.entity.Delito;

public interface DelitoDao {

	public void eliminar(int idDelito);
	
	public List<Delito> listar();
}
