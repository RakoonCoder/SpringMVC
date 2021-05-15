package SpringCustomValidationMVCPassword;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password,String> {  
		  
	    public boolean isValid(String s, ConstraintValidatorContext cvc) {  
	          
	        boolean result=s.contains("jtp");  
	        return result;  
	    }  
  }

