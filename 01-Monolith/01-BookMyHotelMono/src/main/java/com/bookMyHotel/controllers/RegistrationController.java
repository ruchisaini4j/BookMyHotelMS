package com.bookMyHotel.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookMyHotel.model.Login;
import com.bookMyHotel.model.Registration;
import com.bookMyHotel.services.RegistrationService;


@Controller
public class RegistrationController {
	
	
	
	@Autowired
	RegistrationService regService;
	
	//Login and Logout
	
	
	@GetMapping("/login.htm") 
	  public String showLoginForm(Model model) {
	  Login login = new Login();
	  
	  model.addAttribute("login",login); 
	  return "/login";
	  
	  
	  
	  }
	 
	
	@PostMapping("/login.htm")
	public String loginSubmission(@ModelAttribute("login") Login login,Model model,HttpSession session)
	{	
		String registrationId = login.getRegistrationId();
		 
		 String result = regService.checkLoginDetails(registrationId,login.getPassword());
		 if(!"Login Success".equals(result))
		 {
			    model.addAttribute("status",result);
				return "/login/loginFailure";
		 }
		 
		 session.setAttribute("registrationId",registrationId); 
		
		 return "/login/menu";
		
	}
	
	@GetMapping("/logout.htm") 
	  public String logoutForm(HttpSession session,Model model) {
		
		session.invalidate();
		Login login = new Login();
		  
		model.addAttribute("login",login); 
		return "/login";
	  
	  
	  
	  }
	
	
	//Register Customer
	@GetMapping("/registration/addCustomer.htm")
	public String showForm(Model model)
	{
		Registration reg = new Registration();
		
		model.addAttribute("registration",reg);
		return "/registration/addCustomer";
		
		
		
	}
	
	@PostMapping("/registration/addCustomer.htm")
	public String registerCustomer(@ModelAttribute("customer") Registration reg,Model model)
	{	
		Random rand = new Random();
		String regId = "c" + rand.nextInt();
		reg.setCustomerRegId(regId);
		String status = regService.addCustomerRegistration(reg);
		model.addAttribute("status",status);
		return "/registration/addCustomerOutput";
	}

	
	
	//view registration details
	
		@GetMapping("/registration/viewRegDetails.htm")
		public String viewRegDetails(Model model,HttpSession session)
		{	
			String registrationId = (String)session.getAttribute("registrationId");
			model.addAttribute("registrationId",registrationId);
			model.addAttribute("registration",regService.getRegistrationDetails(registrationId));
			
			return "/registration/viewRegDetails";
			
		}
		

}
