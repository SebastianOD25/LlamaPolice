package pe.gob.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Delitos")
public class Delitos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Delitos delitos_id;
	
	private Delitos nombre_delitos;
	private Delitos descripcion_d;
	public Delitos getDelitos_id() {
		return delitos_id;
	}
	public void setDelitos_id(Delitos delitos_id) {
		this.delitos_id = delitos_id;
	}
	public Delitos getNombre_delitos() {
		return nombre_delitos;
	}
	public void setNombre_delitos(Delitos nombre_delitos) {
		this.nombre_delitos = nombre_delitos;
	}
	public Delitos getDescripcion_d() {
		return descripcion_d;
	}
	public void setDescripcion_d(Delitos descripcion_d) {
		this.descripcion_d = descripcion_d;
	}
	
	

}
