package SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import SpringMVC1.userModel;

@Controller
public class userController {
	
	@RequestMapping("/user")
	public String user(@RequestParam("username") String username, 
			         @RequestParam("email") String email,
			         @RequestParam("password") int password){
		
		
		
		userModel userX= new userModel();
		userX.setUsername(username);
		userX.setEmail(email);
		userX.setPassword(password);
		
		if(username=="anuragini" && email=="anuraginipathak0@gmail.com" && password==1234 )
			return "success.jsp";
		else{
			return "error.jsp";
		}
		
		
		
		
		
		
	}

}
