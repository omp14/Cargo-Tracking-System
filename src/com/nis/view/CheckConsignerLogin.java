package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nis.Controller.ConsignerController;
import com.nis.model.Consigner;

/**
 * Servlet implementation class CheckConsignerLogin
 */
@WebServlet("/CheckConsignerLogin")
public class CheckConsignerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckConsignerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String aid=request.getParameter("cid");
		String password=request.getParameter("password");
		Consigner C=ConsignerController.checkPassword(aid,password);
		if(C!=null){
		HttpSession ses=request.getSession();	
		ses.putValue("SCONSIGNER",C);
		ses.putValue("LTIME", new java.util.Date());
		response.sendRedirect("ConsignerHome");
		}
		else{
			out.println("Invalid ConsignerId/Password");
		}
	}

}
