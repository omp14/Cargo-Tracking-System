package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.nis.Controller.ConsignerController;
import com.nis.model.Admin;
import com.nis.model.Consigner;

/**
 * Servlet implementation class ConsignerSubmit
 */
@WebServlet("/ConsignerSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)

public class ConsignerSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsignerSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//(firmname,registration_no,ownername,contactperson,mobileno,phoneno,email,address,country,state,
//city,deals_in,website,firmlogo,password) values ('"+C.getFirmname()+"','"+C.getRegistration_no()+"','"+C.getOwnername()+"','"+C.getContactperson()+"','"+C.getMobileno()+"','"+C.getPhoneno()+"','"+C.getEmail()+"','"+C.getAddress()+"','"+C.getCountry()+"','"+C.getState()+"','"+C.getCity()+"','"+C.getDeals_in()+"','"+C.getWebsite()+"','"+C.getFirmlogo()+"','"+C.getPassword()+"')";
        		
		PrintWriter out=response.getWriter();
		Consigner C=new Consigner();
		C.setFirmname(request.getParameter("firmname"));
	    C.setRegistration_no(request.getParameter("registrationno"));
	    C.setOwnername(request.getParameter("ownername"));
	    C.setContactperson(request.getParameter("contactperson"));
	    C.setMobileno(request.getParameter("moileno"));
		C.setPhoneno(request.getParameter("phoneno"));
        C.setEmail(request.getParameter("email"));
        C.setAddress(request.getParameter("address"));
        C.setCountry(request.getParameter("country"));
        C.setState(request.getParameter("state"));
        C.setCity(request.getParameter("city"));
        C.setDeals_in(request.getParameter("dealsin"));
        C.setWebsite(request.getParameter("website"));
        Part part=request.getPart("firmlogo");
        String path="D:/Eclipse Mars/eclipse/CargoTracking/WebContent/images";
        FileUpload F=new FileUpload(part,path);
        C.setFirmlogo(F.filename);

        C.setPassword(request.getParameter("password"));
        boolean st=ConsignerController.addNewRecord(C);
        out.println("<html>");
        if(st)
        {out.println("<b><i>Record Submitted</i></b>");
         }
        else
        {out.println("<b><i>Fail to Submit Record</i></b>");
        	
        }
        out.println("</html>");
        out.flush();
	
	}

}

