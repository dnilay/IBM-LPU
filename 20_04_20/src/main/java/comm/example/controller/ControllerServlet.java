package comm.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.ToDo;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<String> errors;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);

	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		errors=new ArrayList<String>();
		String name = request.getParameter("name").toString();
		int id =0;
		if(name.length()<8)
		{
			errors.add("invalid name.");
		}
		try {
	
			id= Integer.parseInt(request.getParameter("id").toString());
		} catch (Exception e) {
			errors.add("todo id must be numeric");
		}
	
		String c_by=request.getParameter("c_by").toString();
		if(c_by.length()<=0)
		{
			errors.add("completeed by field cant not be blank");
		}
			
		if(errors.isEmpty())
		{
			ToDo todo=new ToDo(id, name, c_by);
			request.setAttribute("todo", todo);//key and value pair
			RequestDispatcher view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
		else
		{
			
			request.setAttribute("error",errors);//key and value pair
			RequestDispatcher view=request.getRequestDispatcher("error.view");
			view.forward(request, response);
		}
		
		
	}

}
