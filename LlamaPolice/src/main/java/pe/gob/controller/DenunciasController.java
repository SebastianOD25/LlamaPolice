package pe.gob.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.gob.business.ComisariaBusiness;
import pe.gob.business.DelitosBusiness;
import pe.gob.business.DenunciaBusiness;
import pe.gob.business.PersonaBusiness;
import pe.gob.model.entity.Comisaria;
import pe.gob.model.entity.Delitos;
import pe.gob.model.entity.Denuncia;
import pe.gob.model.entity.Personas;
import pe.gob.util.Message;

@Named
@SessionScoped
public class DenunciasController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private DenunciaBusiness denunciaB;
	
	@Inject
	private PersonaBusiness personaB;
	
	@Inject
	private ComisariaBusiness comisariaB;
	
	@Inject
	private DelitosBusiness delitosB;
	
	private Denuncia denuncia;
	private List<Denuncia> denun;
	private Denuncia denunciaS;
	
	private Personas persona;
	private List<Personas> pers;
	
	private Comisaria comisaria;
	private List<Comisaria> comi;
	
	private Delitos delitos;
	private List<Delitos> deli;
	
	private String filtroD;
	
	@PostConstruct
	public void init() {
		
		denuncia = new Denuncia();
		persona = new Personas();
		comisaria = new Comisaria();
		delitos = new Delitos();
		
		denun = new ArrayList<Denuncia>();
		pers = new ArrayList<Personas>();
		comi = new ArrayList<Comisaria>();
		deli = new ArrayList<Delitos>();
		
		getDenunciasT();
	}
	
	public void getDenunciasT() {
		try {
			denun = denunciaB.EncontrarT();
		} catch (Exception ex) {
			Message.messageError("Error al cargar la informacion : " + ex.getMessage());
		}
	}
	
	public String nuevaDenuncia() {
		try {
			this.comi = comisariaB.EncontrarT();
			this.deli = delitosB.EncontrarT();
			this.pers = personaB.EncontrarT();
		} catch (Exception e) {
			
		}return "insert.xhtml";
	}
	
	public String ListarDenuncia() {
		return "listar.xhtml";
	}
	
	public String guardarDenuncia() {
		String view = "";
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
