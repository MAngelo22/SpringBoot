package es.proyectos.modelo.dao;

import java.util.List;

import es.proyectos.modelo.entidades.Empleado;

public interface EmpleadoDao {
	
	Empleado buscarUno(int idEmpleado);
	List<Empleado> buscarTodos();
	Empleado altaEmpleado(Empleado empleado);
	

}
