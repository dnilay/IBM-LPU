package comm.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/")
	public String home()
	{
		return "main-menu";
	}
	
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	
	@RequestMapping("/processForm")
	public String processForm() {
		// String str=request.getParameter("studentName");
		return "helloworld";
	}

	@RequestMapping("/processFormVersion2")
	public String processForm(HttpServletRequest request, Model model) {
		String message = "Yo! " + request.getParameter("studentName").toString();
		model.addAttribute("message", message);
		return "helloworld";
	}
	@RequestMapping("/processFormVersion3")
	public String processForm(@RequestParam("studentName") String str,Model model)
	{
		model.addAttribute("message1",str);
		return "helloworld";
	}
		
}
