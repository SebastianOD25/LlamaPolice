package pe.gob.entity;

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
private int	idComisaria;

@Column(name = "nombreComisaria",nullable = false,length = 30)
private String nombreComisaria;

@Column(name = "direccion", nullable = false,length = 30)
private String direccion;

@Column(name = "num_policias", nullable = false,length = 2)
private int numP;

public Comisaria() {
	super();
	// TODO Auto-generated constructor stub
}

public Comisaria(int idComisaria, String nombreComisaria, String direccion, int numP) {
	super();
	this.idComisaria = idComisaria;
	this.nombreComisaria = nombreComisaria;
	this.direccion = direccion;
	this.numP = numP;
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

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public int getNumP() {
	return numP;
}

public void setNumP(int numP) {
	this.numP = numP;
}



}
