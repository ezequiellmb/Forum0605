package servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

import static servlet.FormAluno.*;

@WebServlet(
        name = "CriaArqv",
        urlPatterns = {"/cria"}
)

public class CriaArqv extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OutputStream acha = null;
        try {
            acha = new FileOutputStream("teste2.txt");
            OutputStreamWriter cria = new OutputStreamWriter(acha);
            BufferedWriter escreve = new BufferedWriter(cria);
            escreve.write(nome);
            escreve.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//
//    public void Imprime (HttpServletRequest req, HttpServletResponse resp) {
//        try {
//        InputStream teste = new FileInputStream("teste2.txt");
//        InputStreamReader tenta = new InputStreamReader(teste);
//        BufferedReader ler = new BufferedReader(tenta);
//
//        String imprime = ler.readLine();
//
//        System.out.println(imprime);
//        imprime = ler.readLine();
//
//        ler.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
