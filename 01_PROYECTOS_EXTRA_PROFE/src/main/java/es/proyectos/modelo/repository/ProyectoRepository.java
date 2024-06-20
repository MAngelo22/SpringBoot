package es.proyectos.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.proyectos.modelo.entidades.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>{

}
