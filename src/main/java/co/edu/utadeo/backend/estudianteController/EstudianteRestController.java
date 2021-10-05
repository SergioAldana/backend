package co.edu.utadeo.backend.estudianteController;

import co.edu.utadeo.backend.estudianteService.IEstudianteService;
import co.edu.utadeo.backend.modelEntity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstudianteRestController {

    //Verificar porque agregando codigo a esta linea se resuelve el conflicto
    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/estudiante")
    public List<Estudiante> listarEstudiantes() {
        return estudianteService.findAll();
    }

    @PostMapping("/estudiante")
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante guardar(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }

    @DeleteMapping("/estudiante/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void borrar(@PathVariable Long id) {
        estudianteService.borrar(id);
    }

    @GetMapping("/estudiante/{id}")
    public Estudiante encontrarPorId(@PathVariable Long id) {
        return estudianteService.encontrarPorId(id);
    }

    @PutMapping("/estudiante/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Estudiante editar(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        Estudiante actual = estudianteService.encontrarPorId(id);
        actual.setNombre(estudiante.getNombre());
        actual.setApellido(estudiante.getApellido());
        return estudianteService.guardar(actual);
    }

}
