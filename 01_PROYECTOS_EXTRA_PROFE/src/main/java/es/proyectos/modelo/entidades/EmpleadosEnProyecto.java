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
@Table(name="empleados_en_Proyecto")
public class EmpleadosEnProyecto {
	@EqualsAndHashCode.Include
	@Id
	@Column(name="id_entrada")
	private int idEntrada; 
	@ManyToOne
	@JoinColumn(name="id_proyecto")
	private Proyecto proyecto; 
	@ManyToOne
	@JoinColumn(name="id_empleado")
	private Empleado empleado; 
	@Column(name="dias_Previstos")
	private int diasPrevistos;
	@Column(name="fecha_Incorporacion")
	@Temporal(TemporalType.DATE)
	private LocalDate fechaIncorporacion; 

}
