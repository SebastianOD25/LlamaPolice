package pe.gob.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "denuncia")
public class Denuncia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDenuncia;
	
	@ManyToOne
	@JoinColumn(name="idPersona", nullable = false)
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name="idDelito", nullable = false)
	private Delito delito;
	
	@Column(name = "Lugar", nullable = false, length = 50)
	private String direccion;
	
	@ManyToOne
	@JoinColumn(name="idComisaria", nullable = false)
	private Comisaria comisaria;
	
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	
	@Column(name = "descripcion", nullable = false, length = 60)
	private String descripcion;

	public Denuncia(int idDenuncia, Persona persona, Delito delito, String direccion, Comisaria comisaria, Date fecha,
			String descripcion) {
		super();
		this.idDenuncia = idDenuncia;
		this.persona = persona;
		this.delito = delito;
		this.direccion = direccion;
		this.comisaria = comisaria;
		this.fecha = fecha;
		this.descripcion = descripcion;
	}

	public Denuncia() {
		super();
	}

	public int getIdDenuncia() {
		return idDenuncia;
	}

	public void setIdDenuncia(int idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Delito getDelito() {
		return delito;
	}

	public void setDelito(Delito delito) {
		this.delito = delito;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Comisaria getComisaria() {
		return comisaria;
	}

	public void setComisaria(Comisaria comisaria) {
		this.comisaria = comisaria;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}