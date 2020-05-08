package pe.gob.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Delito")
public class Delito implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDelito;

	@Column(name = "descripcion",nullable = false,length = 30)
	private String descripcion;
	
	@Column(name = "explicacion",nullable = false,length = 60)
	private String explicacion;

	public Delito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delito(int idDelito, String descripcion, String explicacion) {
		super();
		this.idDelito = idDelito;
		this.descripcion = descripcion;
		this.explicacion = explicacion;
	}

	public int getIdDelito() {
		return idDelito;
	}

	public void setIdDelito(int idDelito) {
		this.idDelito = idDelito;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExplicacion() {
		return explicacion;
	}

	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}
	
	
	
}
