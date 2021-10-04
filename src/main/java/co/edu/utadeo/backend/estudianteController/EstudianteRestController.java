package co.edu.utadeo.backend.estudianteController;

import co.edu.utadeo.backend.estudianteService.IEstudianteService;
import co.edu.utadeo.backend.modelEntity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstudianteRestController {

    @Autowired
    private IEstudianteService estudianteService;
    @GetMapping
    public List<Estudiante> listarEstudiantes(){
        return estudianteService.findAll();
    }

}
