package add;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddNumber {

		@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		
		int total=number1+number2;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("answer.jsp");
		mv.addObject("answer",total);
//		mv.
		return mv;
		
	}
}
