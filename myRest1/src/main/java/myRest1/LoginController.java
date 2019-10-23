package myRest1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
    public String obtener(String name, Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }
	
	@PostMapping("/login")
	public String greetingSubmit(@ModelAttribute Login login, String usuario, String contrasena) {
        return "login";
	  }
	

}
