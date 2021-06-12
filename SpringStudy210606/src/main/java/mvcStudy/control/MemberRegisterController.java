package mvcStudy.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvcStudy.model.RegisterRequest;
import springmvc.service.MemberRegisterService;

@Controller
@RequestMapping("/register")
public class MemberRegisterController {
	
	private MemberRegisterService memberRegisterService;
	
	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
//	@GetMapping("/register/step1")
	@GetMapping("/Step1")
	public String handleStep1(HttpServletRequest request) {
//		String test1 = request.getParameter("test1");
//		if(test1 == null || !test1.equals("true"))
//			return "no_found";
				
		return "register/Step1";
	}
	
//	@PostMapping("/register/step2")
	@PostMapping("/Step2")
	public String handleStep2(@RequestParam(value = "agree", defaultValue = "false") Boolean agree
						      , Model model)
	{
		if(!agree) {
			return "register/Step1";
		}
		
		model.addAttribute("registerRequest", new RegisterRequest());
		return "register/Step2";
	}
	
}
