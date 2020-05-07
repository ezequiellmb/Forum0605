package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "FormAluno",
        urlPatterns = {"/form-aluno"}
)

public class FormAluno extends HttpServlet {
    static String nome     = "";
    static String nota1 = "";
    static String nota2 = "";
    static String sexo  = "";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>Alunos</title>");
        out.println("   </head>");
        out.println("   <body>");
        out.println(String.format("<h1>Fomulario de Alunos </h1>"));
        out.println("<form action='cria' method='POST'>");
        out.println(String.format("  Nome:   <input type='text' name='email' value='%s'> <br>", nome));
        out.println(String.format("  Primeira nota:   <input type='text' name='nota1' value='%s'> <br>", nota1));
        out.println(String.format("  Segunda nota:   <input type='text' name='notas2' value='%s'> <br>", nota2));
        out.println(String.format("  Sexo:   <input type='text' name='sexo' value='%s'> <br>", sexo));
        out.println("<input type='submit' value='Salvar'>");
        out.println("   </body>");
        out.println("   </html>");
    }
}
