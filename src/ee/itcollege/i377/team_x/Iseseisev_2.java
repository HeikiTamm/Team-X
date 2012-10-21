package ee.itcollege.i377.team_x;

/*Tekita JSP, mis võimaldab sisestada piiripunkti nime, aadressi ja piirivalvurite hulka.
 Tekita JSP, mis võimaldab kuvada eelnevas punktis kirjeldatud JSP andmeid tabelis
 Tekita Servlet, mis kuvab kõik request parameetrid. Näiteks:
 Kui url on localhost:8080/smth/servletName?nimi=Pille&sugu=N
 Siis väljundisse tuleb: 
 nimi: Pille
 sugu: N*/

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Iseseisev_2
 */
@WebServlet(description = "Tekita JSP, mis võimaldab sisestada piiripunkti nime, aadressi ja piirivalvurite hulka.", urlPatterns = { "/Iseseisev_2" })
public class Iseseisev_2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Iseseisev_2() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
    }

}
