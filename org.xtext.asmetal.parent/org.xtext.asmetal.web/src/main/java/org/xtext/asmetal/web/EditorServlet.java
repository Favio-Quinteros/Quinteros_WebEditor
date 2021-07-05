package org.xtext.asmetal.web;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.nio.file.Files;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import org.asmeta.parser.*;

 
/**
 * Servlet
 */
@WebServlet(name = "EditorServlet", urlPatterns = {"/EditorServlet"})

public class EditorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Pattern p = Pattern.compile("asm[\\s]*[^\\s]*");
	//modificare questo URL se si cambia server
	final String URLjsp = "http://localhost:8080/Editor.jsp";
	
	final int Timeout_cookie=180;
	
	public EditorServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
 
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saveStandardLibrary();
		//
		String parseResult = "";
		String text = request.getParameter("key");
		if (text == null) {
			parseResult = "empty asm";
		} else {
			// estrai il nome della asm
			Matcher m = p.matcher(text);
			if (m.find()) {
				String asmName = m.group(0).substring(4).trim();
				//
				File codice = new File(asmName + ".asm");
				if (codice.exists()) {
					codice.delete();
				}
				// save to a new file the asm
				codice.createNewFile();
				PrintWriter scrivi = new PrintWriter(codice);
				scrivi.print(text);
				scrivi.close();
				// call the parser
				try {
					@SuppressWarnings("unused")
					asmeta.AsmCollection asms = ASMParser.setUpReadAsm(codice);
					ParserResultLogger resultLogger = ASMParser.getResultLogger();
					if (resultLogger.errors.size() == 0)
						parseResult = "No errors found. Parsing succsessful.";
				} catch (Exception e) {
					parseResult = e.getMessage();
				}
			} else {
				parseResult = "Must declare asm <name>.";
			}
		}
		@SuppressWarnings("deprecation")
		String cod =  URLEncoder.encode(text);
		Cookie cookie = new Cookie("cookie",cod);
		cookie.setMaxAge(Timeout_cookie);
		response.addCookie(cookie);
		System.out.println(parseResult);
		@SuppressWarnings("deprecation")
		String cod2 = URLEncoder.encode(parseResult);
		Cookie cookie2 = new Cookie("cookie2",cod2);
		cookie2.setMaxAge(Timeout_cookie);
		response.addCookie(cookie2);
		response.sendRedirect (URLjsp);
	}
	
	// save the standard library if not present	
	private void saveStandardLibrary() throws FileNotFoundException, IOException {
		File stdLib = new File("StandardLibrary.asm");
		if (stdLib.exists())
			return;
		File sorgente = new File("STDL/StandardLibrary.asm");
		Files.copy(sorgente.toPath(), stdLib.toPath());
	}
 
}