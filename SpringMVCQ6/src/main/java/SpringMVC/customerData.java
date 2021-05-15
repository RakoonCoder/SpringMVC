package SpringMVC;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class customerData {
	@RequestMapping("/customer")
	public String customerdata( @Valid  @ModelAttribute("customer") customer customer,  Errors errors ){
		if(errors.hasErrors()){
			System.out.println(errors);
			return "registrtion.jsp";
		}
		return "success.jsp";
		
		
	}
}

