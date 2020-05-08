package pe.gob.dao;

import java.util.List;

import pe.gob.entity.Comisaria;

public interface ComisariaDao {

	public void eliminar(int idComisaria);
	
	public List<Comisaria> listar();
}
