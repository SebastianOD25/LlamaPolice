package pe.gob.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int idPersona;
	
	@Column(name = "nombrePersona",nullable = false,length = 30)
	private String nombrePersona;
	
	@Column(name = "telef",nullable = false,length =9)
	private int telef;
	
	@Column(name = "correo",nullable = false,length = 30)
	private String correo;
	
	@Column(name = "edad",nullable = false,length = 2)
	private int edad;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int idPersona, String nombrePersona, int telef, String correo, int edad) {
		super();
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.telef = telef;
		this.correo = correo;
		this.edad = edad;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public int getTelef() {
		return telef;
	}

	public void setTelef(int telef) {
		this.telef = telef;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
