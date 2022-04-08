package hello.servlet.servletmvc;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "mvcMemberFormServlet",urlPatterns = "/servlet")
public class MvcMemberFormServlet extends HttpServlet {
}
