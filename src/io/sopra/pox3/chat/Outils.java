package io.sopra.pox3.chat;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Outils {
	
	public static User getConnectedUser(HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute(Constantes.CLE_SESSION_USER);
		return user;
	}
	
	public static void setConnectedUser(User user, HttpServletRequest req) {
		req.getSession().setAttribute(Constantes.CLE_SESSION_USER, user);
	}
	
	public static void vueWelcomeConnected(User user, HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setAttribute("user", user);
		vue("welcomeconnected", req, resp);
	}
	
	public static void vueWelcomeNotConnected(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		vue("welcomenotconnected", req, resp);
	}
	
	public static void vue(String jspName, HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.getRequestDispatcher( "/WEB-INF/"+jspName+".jsp" ).forward( req, resp);
	}

}
