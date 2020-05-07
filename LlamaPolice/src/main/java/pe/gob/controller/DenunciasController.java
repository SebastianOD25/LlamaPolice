package pe.gob.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

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
			if(denuncia.getDenuncia_id() != null) {
				denuncia.setPersona(persona);
				denuncia.setDelitos(delitos);
				denuncia.setComisaria(comisaria);
				denunciaB.update(denuncia);
				Message.messageInfo("Registro Actualizado Correctamente");
			}else {
				denuncia.setPersona(persona);
				denuncia.setDelitos(delitos);
				denuncia.setComisaria(comisaria);
				denunciaB.insertar(denuncia);
				Message.messageInfo("Registro Insertado Correctamente");
			}
			this.getDenunciasT();
			//resetForm();
			view = "listar";
		} catch (Exception e) {
			
		}
		return view;
	}
	
	public String BorrarD() {
		String view = "";
		try {
			this.denuncia = denunciaS;
			denunciaB.delete(denuncia);
			Message.messageInfo("Denuncia Eliminada Correctamente");
			view = "listar";
		} catch (Exception ex) {
			Message.messageError("Error en Denuncia: " + ex.getMessage());
		}
		return view;
	}
	
	public void resetForm() {
		this.filtroD = "";
		this.denuncia = new Denuncia();
	}
	
	public void BuscarDenunciaPorDelito() {
		try {
			denun = denunciaB.EncontrarD(this.filtroD.trim());
			resetForm();
			if (denun.isEmpty()) {
				Message.messageInfo("No se encontraron denuncias");
			}
		}
		catch(Exception ex) {
			Message.messageError("Error al buscar Producto: " + ex.getMessage());
		}		
	}
	
	public void SeleccionaDenuncia(SelectEvent e) {
		this.denunciaS = (Denuncia)e.getObject();
	}

	public Denuncia getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

	public List<Denuncia> getDenun() {
		return denun;
	}

	public void setDenun(List<Denuncia> denun) {
		this.denun = denun;
	}

	public Personas getPersona() {
		return persona;
	}

	public void setPersona(Personas persona) {
		this.persona = persona;
	}

	public List<Personas> getPers() {
		return pers;
	}

	public void setPers(List<Personas> pers) {
		this.pers = pers;
	}

	public Comisaria getComisaria() {
		return comisaria;
	}

	public void setComisaria(Comisaria comisaria) {
		this.comisaria = comisaria;
	}

	public List<Comisaria> getComi() {
		return comi;
	}

	public void setComi(List<Comisaria> comi) {
		this.comi = comi;
	}

	public Delitos getDelitos() {
		return delitos;
	}

	public void setDelitos(Delitos delitos) {
		this.delitos = delitos;
	}

	public List<Delitos> getDeli() {
		return deli;
	}

	public void setDeli(List<Delitos> deli) {
		this.deli = deli;
	}

	public String getFiltroD() {
		return filtroD;
	}

	public void setFiltroD(String filtroD) {
		this.filtroD = filtroD;
	}
	
	
}
