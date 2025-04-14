package cadastroee.servlets;

import cadastroee.controller.ProdutoFacade;
import cadastroee.model.Produto;
import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletProdutoFC")
public class ServletProdutoFC extends HttpServlet {
    
    @EJB
    private ProdutoFacade facade;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        String destino = "";
        
        switch (acao) {
            case "listar":
                request.setAttribute("produtos", facade.findAll());
                destino = "ProdutoLista.jsp";
                break;
                
            case "formIncluir":
                destino = "ProdutoDados.jsp";
                break;
                
            case "formAlterar":
                Integer id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("produto", facade.find(id));
                destino = "ProdutoDados.jsp";
                break;
                
            case "excluir":
                id = Integer.parseInt(request.getParameter("id"));
                Produto produto = facade.find(id);
                facade.remove(produto);
                request.setAttribute("produtos", facade.findAll());
                destino = "ProdutoLista.jsp";
                break;
                
            case "incluir":
                produto = new Produto();
                produto.setNome(request.getParameter("nome"));
                produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
                produto.setPrecoVenda(Float.parseFloat(request.getParameter("precoVenda")));
                facade.create(produto);
                request.setAttribute("produtos", facade.findAll());
                destino = "ProdutoLista.jsp";
                break;
                
            case "alterar":
                produto = facade.find(Integer.parseInt(request.getParameter("id")));
                produto.setNome(request.getParameter("nome"));
                produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
                produto.setPrecoVenda(Float.parseFloat(request.getParameter("precoVenda")));
                facade.edit(produto);
                request.setAttribute("produtos", facade.findAll());
                destino = "ProdutoLista.jsp";
                break;
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}