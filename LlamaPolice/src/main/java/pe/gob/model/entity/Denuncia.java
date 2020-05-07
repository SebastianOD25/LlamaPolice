package pe.gob.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Denuncia")
public class Denuncia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Denuncia denuncia_id;
	
	@ManyToOne
	@JoinColumn(name="nombe", nullable=false)
	private Personas persona;
	
	@ManyToOne
	@JoinColumn(name="nombre_comisaria", nullable=false)
	private Comisaria comisaria;
	
	@ManyToOne
	@JoinColumn(name="nombre_delitos", nullable=false)
	private Delitos delitos;
	
	@Column(name="Fecha", nullable = false)
	private Date fecha;
	
	@Column(name="Lugar_del_crimen", nullable = false)
	private String lugar;
	
	@Column(name="Descripcion_del_crimen", nullable = false)
	private Long descripcion;

	public Denuncia getDenuncia_id() {
		return denuncia_id;
	}

	public void setDenuncia_id(Denuncia denuncia_id) {
		this.denuncia_id = denuncia_id;
	}

	public Personas getPersona() {
		return persona;
	}

	public void setPersona(Personas persona) {
		this.persona = persona;
	}

	public Comisaria getComisaria() {
		return comisaria;
	}

	public void setComisaria(Comisaria comisaria) {
		this.comisaria = comisaria;
	}

	public Delitos getDelitos() {
		return delitos;
	}

	public void setDelitos(Delitos delitos) {
		this.delitos = delitos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Long getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(Long descripcion) {
		this.descripcion = descripcion;
	}
	
}
