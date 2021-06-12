package survey.control;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import survey.models.SurveyQuestion;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	/**
	 * Create Date : 2021-06-12
	 * Author : 구가은
	 * Copyrighter : 구가은
	 * Action 
	 * 		설문조사 폼을 
	 * @return 설정항목 리스트 : ArrayList
	 */
	
	private List<SurveyQuestion> createQuestions() {
		SurveyQuestion sq1 = new SurveyQuestion("당신의 역할은 무엇입니까?", Arrays.asList("백엔드", "프론트엔드", "풀스택"));
		SurveyQuestion sq2 = new SurveyQuestion("많이 사용하는 개발 도구는 무엇입니까?", Arrays.asList("이큽립스", "인텔리J", "노트패드++"));
		SurveyQuestion sq3 = new SurveyQuestion("하고싶은 말을 적어주세요");
		
		return Arrays.asList(sq1, sq2, sq3);
	}
	
	@GetMapping
	public String surveyForm(Model model) {
		model.addAttribute("questions", createQuestions());
		return "survey/SurveyForm";
	}
	
	@PostMapping
	public String SurveySubmit() {
		return "survey/Submitted"; 
	}

}
