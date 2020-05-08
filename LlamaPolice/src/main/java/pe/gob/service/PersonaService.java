package pe.gob.service;

import java.util.List;

import pe.gob.entity.Persona;

public interface PersonaService {

	public void insertar(Persona persona);
	
public void eliminar(int idPersona);
	
	public List<Persona> listar();
}
