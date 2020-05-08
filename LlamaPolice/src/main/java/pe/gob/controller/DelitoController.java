package pe.gob.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.entity.Delito;
import pe.gob.service.DelitoService;

@Named
@RequestScoped
public class DelitoController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private DelitoService dService;
	private Delito delito;
	List<Delito> listaDelitos;
	
	@PostConstruct
	public void init() {
		this.listaDelitos = new ArrayList<Delito>();
		this.delito = new Delito();
		this.listar();
	}

	public String nuevoUsuario() {
		this.setDelito(new Delito());
		return "delito.xhtml";
	}
	
	public void listar() {
		try {
			listaDelitos = dService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void eliminar(Delito de) {
		try {
			dService.eliminar(de.getIdDelito());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	//get y set
	
	public Delito getDelito() {
		return delito;
	}

	public void setDelito(Delito delito) {
		this.delito = delito;
	}

	public List<Delito> getListaDelitos() {
		return listaDelitos;
	}

	public void setListaDelitos(List<Delito> listaDelitos) {
		this.listaDelitos = listaDelitos;
	}
	
	
}
