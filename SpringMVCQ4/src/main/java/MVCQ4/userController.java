package MVCQ4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userController {
	
	@RequestMapping("/user")
	public String user(@RequestParam("username") String username, 
			         @RequestParam("email") String email,
			         @RequestParam("password") int password){
		return "login.jsp";
	
	}
}
