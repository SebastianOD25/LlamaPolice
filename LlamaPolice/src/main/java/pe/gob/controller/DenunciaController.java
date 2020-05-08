package pe.gob.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.entity.Comisaria;
import pe.gob.entity.Delito;
import pe.gob.entity.Denuncia;
import pe.gob.entity.Persona;
import pe.gob.service.ComisariaService;
import pe.gob.service.DelitoService;
import pe.gob.service.DenunciaService;
import pe.gob.service.PersonaService;

@Named
@SessionScoped
public class DenunciaController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private DenunciaService dS;
	
	@Inject
	private PersonaService pS;
	
	@Inject
	private ComisariaService cS;
	
	@Inject
	private DelitoService deS;
	
	private Denuncia denuncia;
	private Persona persona;
	private Comisaria comisaria;
	private Delito delito;
	
	private List<Delito> listDelito;
	private List<Persona> listPersona;
	private List<Comisaria> listComisaria;
	private List<Denuncia> listDenuncia;
	
	public void init() {
		
		denuncia = new Denuncia();
		persona = new Persona();
		comisaria = new Comisaria();
		delito = new Delito();
		
		listComisaria = new ArrayList<Comisaria>();
		listPersona = new ArrayList<Persona>();
		listDelito = new ArrayList<Delito>();
		listDenuncia = new ArrayList<Denuncia>();
		this.listComisaria();
		this.listDelito();
		this.listPersona();
		this.listDenuncia();
	}
	
	//Metodos
	
	public String nuevaDenuncia() {
		this.setDenuncia(new Denuncia());
		return "listarDenuncia.xhtml";
	}
	
	public void insertar() {
		try {
			dS.insert(denuncia);
			cleanDenuncia();
			this.listDenuncia();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void borrar(Denuncia denuncia) {
		try {
			dS.delete(denuncia.getIdDenuncia());
			listDenuncia();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listDenuncia() {
		try {
			listDenuncia = dS.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listPersona() {
		try {
			listPersona = pS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	public void listComisaria() {
		try {
			listComisaria = cS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listDelito() { 
		try {
			listDelito = deS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void cleanDenuncia() { 
		this.init();
	}
	
	//get y set
	
	public Denuncia getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Comisaria getComisaria() {
		return comisaria;
	}

	public void setComisaria(Comisaria comisaria) {
		this.comisaria = comisaria;
	}

	public Delito getDelito() {
		return delito;
	}

	public void setDelito(Delito delito) {
		this.delito = delito;
	}

	public List<Delito> getListDelito() {
		return listDelito;
	}

	public void setListDelito(List<Delito> listDelito) {
		this.listDelito = listDelito;
	}

	public List<Persona> getListPersona() {
		return listPersona;
	}

	public void setListPersona(List<Persona> listPersona) {
		this.listPersona = listPersona;
	}

	public List<Comisaria> getListComisaria() {
		return listComisaria;
	}

	public void setListComisaria(List<Comisaria> listComisaria) {
		this.listComisaria = listComisaria;
	}

	public List<Denuncia> getListDenuncia() {
		return listDenuncia;
	}

	public void setListDenuncia(List<Denuncia> listDenuncia) {
		this.listDenuncia = listDenuncia;
	}
	
	
}
