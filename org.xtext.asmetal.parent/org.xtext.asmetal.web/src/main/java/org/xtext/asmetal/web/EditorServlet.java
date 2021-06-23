package org.xtext.asmetal.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.asmeta.parser.*;

/**
 * Servlet
 */
@WebServlet(name = "EditorServlet", urlPatterns = { "/EditorServlet/*" })

public class EditorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// to find the asm name
	static Pattern p = Pattern.compile("asm[\\s]*[^\\s]*");

	public EditorServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// NO GET use POST
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("XXXXX");
		// check if standard libary exists
		saveStandardLibrary();
		//
		String parseResult = "";
		String text = request.getParameter("key");
		System.out.println(text);
		if (text == null) {
			parseResult = "asm nulla";
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
					asmeta.AsmCollection asms = ASMParser.setUpReadAsm(codice);
					ParserResultLogger resultLogger = ASMParser.getResultLogger();
					if (resultLogger.errors.size() == 0)
						parseResult = "Nessun errore";
				} catch (Exception e) {
					parseResult = e.getMessage();
				}
			} else {
				parseResult = "devi dichiarare asm <nome>";
			}
		}
		response.setContentType("text/plain"); // Set content type of the response so that jQuery knows what it can
												// expect.
		response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
		response.getWriter().write(parseResult);
		// request.setAttribute("result", parseResult);
		// request.getRequestDispatcher("Editor.jsp").forward(request, response);
	}

	// save the standard library if not present
	private void saveStandardLibrary() throws FileNotFoundException {
		File stdLib = new File("StandardLibrary.asm");
		if (stdLib.exists())
			return;
		PrintWriter scrivi = new PrintWriter(stdLib);
		scrivi.print("module StandardLibrary");
		// TODO save the standard library
		scrivi.close();
	}

}
