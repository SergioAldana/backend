package co.edu.utadeo.backend.estudianteService;

import co.edu.utadeo.backend.modelEntity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    public List<Estudiante> findAll();
    public Estudiante guardar(Estudiante estudiante);

}
