package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "Lista",
        urlPatterns = {"/lista"}
)

public class Lista extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>Alunos</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("<Form action ='form-aluno' method='Get'>");
        out.println("<input type='submit' value='Criar'>");
        out.println("   </body>");
        out.println("   </html>");
    }
}
