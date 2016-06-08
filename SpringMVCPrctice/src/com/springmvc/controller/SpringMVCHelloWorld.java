package com.springmvc.controller;
import com.springmvc.resource.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class SpringMVCHelloWorld {

	@RequestMapping(value = "/AdmissionForm.html" ,method= RequestMethod.GET)
	public ModelAndView getAdmissionForm( ) {

		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
		//return new ModelAndView("welcome", "message", message);
	}

	@ModelAttribute
	public void addingCommonObj(Model model)
	{
		model.addAttribute("msg","Hi How r u?");
	}


	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1) {
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		return modelAndView;

	}
}
