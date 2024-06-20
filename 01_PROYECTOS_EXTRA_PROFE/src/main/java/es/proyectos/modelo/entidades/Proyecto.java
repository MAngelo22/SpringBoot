package es.proyectos.modelo.entidades;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="proyectos")
public class Proyecto {
	@EqualsAndHashCode.Include
	@Id
	@Column(name="id_proyecto")
	private int idProyecto;
	private String descripcion;
	@Column(name="fecha_Inicio")
	@Temporal(TemporalType.DATE)
	private LocalDate fechaInicio;
	@Column(name="dias_Previstos")
	private int diasPrevistos;
	//unidireccional
	@ManyToOne
	@JoinColumn(name="director")
	private Empleado director;
	private String estado;

}
