package pe.gob.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Comisaria")
public class Comisaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Comisaria comisaria_id;
	
	private String nombre_comisaria;
	private String direccion_com;
	private int cantidad_policias;
	public Comisaria getComisaria_id() {
		return comisaria_id;
	}
	public void setComisaria_id(Comisaria comisaria_id) {
		this.comisaria_id = comisaria_id;
	}
	public String getNombre_comisaria() {
		return nombre_comisaria;
	}
	public void setNombre_comisaria(String nombre_comisaria) {
		this.nombre_comisaria = nombre_comisaria;
	}
	public String getDireccion_com() {
		return direccion_com;
	}
	public void setDireccion_com(String direccion_com) {
		this.direccion_com = direccion_com;
	}
	public int getCantidad_policias() {
		return cantidad_policias;
	}
	public void setCantidad_policias(int cantidad_policias) {
		this.cantidad_policias = cantidad_policias;
	}
	
	
}
