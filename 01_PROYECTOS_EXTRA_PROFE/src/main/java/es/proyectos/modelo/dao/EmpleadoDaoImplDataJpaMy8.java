package es.proyectos.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.proyectos.modelo.entidades.Empleado;
import es.proyectos.modelo.repository.EmpleadoRepository;

@Repository
public class EmpleadoDaoImplDataJpaMy8 implements EmpleadoDao{
	
	@Autowired
	private EmpleadoRepository erepo;

	@Override
	public Empleado buscarUno(int idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado altaEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

}
