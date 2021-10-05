package co.edu.utadeo.backend.estudianteService;

import co.edu.utadeo.backend.modelEntity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> findAll();

    Estudiante guardar(Estudiante estudiante);

    void borrar(Long id);

    Estudiante encontrarPorId(Long id);

}
