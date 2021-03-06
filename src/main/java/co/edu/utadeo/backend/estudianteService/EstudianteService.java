package co.edu.utadeo.backend.estudianteService;

import co.edu.utadeo.backend.modelEntity.Estudiante;
import co.edu.utadeo.backend.modelsDAO.IEstudianteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService implements IEstudianteService {

    @Autowired
    private IEstudianteDAO estudianteDAO;

    @Override
    public List<Estudiante> findAll() {
        return estudianteDAO.findAll();
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return estudianteDAO.save(estudiante);
    }

    @Override
    public void borrar(Long id) {
        estudianteDAO.deleteById(id);
    }

    @Override
    public Estudiante encontrarPorId(Long id) {
        return estudianteDAO.findById(id).orElse(null);
    }

}
