package pe.gob.service;

import java.util.List;

import pe.gob.entity.Comisaria;

public interface ComisariaService {

	public void eliminar(int idComisaria);
	
	public List<Comisaria> listar();
}
