package pe.gob.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.entity.Persona;
import pe.gob.service.PersonaService;

@Named
@RequestScoped
public class PersonaController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private PersonaService pService;
	private Persona persona;
	List<Persona> listaPersonas;
	
	@PostConstruct
	public void init() {
		this.listaPersonas = new ArrayList<Persona>();
		this.persona = new Persona();
		this.listar();
	}
	
	public String nuevoUsuario() {
		this.setPersona(new Persona());
		return "persona.xhtml";
	}

	public void insertar() {
		try {
			pService.insertar(persona);
			limpiarPersona();
			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listar() {
		try {
			listaPersonas = pService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void limpiarPersona() {
		this.init();
	}
	
	public void eliminar(Persona pe) {
		try {
			pService.eliminar(pe.getIdPersona());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	//get y set
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	
}
