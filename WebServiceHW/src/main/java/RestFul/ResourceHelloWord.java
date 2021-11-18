package RestFul;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloword")
public class ResourceHelloWord extends HttpServlet {

	@GET
	@Produces("text/plan")
	public String mostrar() {
		return "Hello Word";
	}
}
