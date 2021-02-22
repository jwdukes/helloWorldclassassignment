package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.Greeting;


@Controller
public class GreetingController {

//	@GetMapping(value = "/greeting")
//	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
//	public String greeting(@RequestParam(name="name", required=false, 
//	defaultValue="World")){
//	model.addAttribute("nombre", name);
//	return "greeting";
//	}
	
	@GetMapping(value = "/greeting")
	public String greetingForm(Greeting greeting, Model model) {
		model.addAttribute("greeting", greeting);
		return "greeting";
	}
	
	@PostMapping(value = "/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting, 
			Model model) {
		model.addAttribute("greeting", greeting);
		return "result";
	}
	
	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
}





