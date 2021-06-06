package mvcStudy.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvcStudy.model.RegisterRequest;

@Controller
public class MemberRegisterController {
	@GetMapping("/register/Step1")
	
	public String handleStep1() {
		return "register/Step1";
	}
	
	@PostMapping("/register/Step2")
	public String handleStep2(@RequestParam(value = "agree", defaultValue = "false") Boolean agree, Model model) {
		
		if(!agree) {
			return "register/Step1";
		}
		
		model.addAttribute("registerRequest", new RegisterRequest()); 
		return "register/Step2";
	}
	
	
}
