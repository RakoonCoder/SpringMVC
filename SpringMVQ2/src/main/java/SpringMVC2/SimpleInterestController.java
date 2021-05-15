package SpringMVC2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping("/SI")
	public ModelAndView SI(HttpServletRequest request, HttpServletResponse response){
		
		int amount= Integer.parseInt(request.getParameter("amount"));
		int years = Integer.parseInt(request.getParameter("years"));
		int rate  = Integer.parseInt(request.getParameter("rate"));
		
		int res= amount* years * rate;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showSimpleInterest.jsp");
		mv.addObject("result", res );
		
		return mv;
		
		
	}

}
