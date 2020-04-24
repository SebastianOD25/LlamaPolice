package pe.gob.pnp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comisaria")
public class Comisaria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComisaria;
	
	@Column(name = "nombreComisaria",nullable = false,length = 30)
	private String nombreComisaria;

	@Column(name = "direccionComisaria",nullable = false,length = 50)
	private String direccionComisaria;
	
	private int num_policias;

	public Comisaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comisaria(int idComisaria, String nombreComisaria, String direccionComisaria, int num_policias) {
		super();
		this.idComisaria = idComisaria;
		this.nombreComisaria = nombreComisaria;
		this.direccionComisaria = direccionComisaria;
		this.num_policias = num_policias;
	}

	public int getIdComisaria() {
		return idComisaria;
	}

	public void setIdComisaria(int idComisaria) {
		this.idComisaria = idComisaria;
	}

	public String getNombreComisaria() {
		return nombreComisaria;
	}

	public void setNombreComisaria(String nombreComisaria) {
		this.nombreComisaria = nombreComisaria;
	}

	public String getDireccionComisaria() {
		return direccionComisaria;
	}

	public void setDireccionComisaria(String direccionComisaria) {
		this.direccionComisaria = direccionComisaria;
	}

	public int getNum_policias() {
		return num_policias;
	}

	public void setNum_policias(int num_policias) {
		this.num_policias = num_policias;
	}
	
	
}
