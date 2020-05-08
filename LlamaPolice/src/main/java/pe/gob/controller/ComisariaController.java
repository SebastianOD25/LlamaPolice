package pe.gob.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.entity.Comisaria;
import pe.gob.service.ComisariaService;

@Named
@RequestScoped
public class ComisariaController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private ComisariaService cService;
	private Comisaria comisaria;
	List<Comisaria> listacoComisarias;
	
	@PostConstruct
	public void init() {
		this.listacoComisarias = new ArrayList<Comisaria>();
		this.comisaria = new Comisaria();
		this.listar();
	}
	
	public String nuevoUsuario() {
		this.setComisaria(new Comisaria());
		return "comisaria.xhtml";
	}
	
	public void listar() {
		try {
			listacoComisarias = cService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public void eliminar(Comisaria co) {
		try {
			cService.eliminar(co.getIdComisaria());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	//get y set
	
	public Comisaria getComisaria() {
		return comisaria;
	}

	public void setComisaria(Comisaria comisaria) {
		this.comisaria = comisaria;
	}

	public List<Comisaria> getListacoComisarias() {
		return listacoComisarias;
	}

	public void setListacoComisarias(List<Comisaria> listacoComisarias) {
		this.listacoComisarias = listacoComisarias;
	}
	

	
}
