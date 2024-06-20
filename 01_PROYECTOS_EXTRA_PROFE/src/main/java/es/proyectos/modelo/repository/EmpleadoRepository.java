package es.proyectos.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.proyectos.modelo.entidades.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

}
