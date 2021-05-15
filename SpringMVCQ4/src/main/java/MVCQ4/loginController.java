package MVCQ4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class loginController {
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response){

		String username= request.getParameter("username");
		String email = request.getParameter("email");
		int password = Integer.parseInt(request.getParameter("password"));
		
      ModelAndView userX= new ModelAndView(); 
      

    if(username=="anuragini" && email=="anuraginipathak0@gmail.com" && password==1234 )
    {
        userX.setViewName("success.jsp");
    return "sucess.jsp";
     }
    else{
    	 userX.setViewName("error.jsp");
    	 return "error.jsp";
    	   }
	

  }

}
