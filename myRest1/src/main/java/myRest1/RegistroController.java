package myRest1;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import myRest1.RegistroController;





@Controller
public class RegistroController {
	
	@GetMapping("/registro")
    public String obtener(String name, Model model) {
        model.addAttribute("alumnos", new Alumnos());
        return "registro";
    }
	
	@PostMapping("/registro")
	public String greetingSubmit(@ModelAttribute Alumnos alumnos, String nombre, String apellido) {
        return "registro";
	  }
	
	@PutMapping("/registro/{id}")
	public String modificar(@Valid @RequestBody Alumnos user) {
	    return "registro";
	  }
	
	@DeleteMapping("/registro/{id}")
	public String borrar(@Valid @RequestBody Alumnos user) {
	    return "registro";
	  }

}
