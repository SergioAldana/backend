package co.edu.utadeo.backend.modelsDAO;

import co.edu.utadeo.backend.modelEntity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDAO extends JpaRepository<Estudiante, Long > {



}
