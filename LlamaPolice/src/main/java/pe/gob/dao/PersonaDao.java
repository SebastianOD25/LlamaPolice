package pe.gob.dao;

import java.util.List;

import pe.gob.entity.Persona;

public interface PersonaDao {

	public void insertar(Persona persona);
	
	public void eliminar(int idPersona);
	
	public List<Persona> listar();
	
}
