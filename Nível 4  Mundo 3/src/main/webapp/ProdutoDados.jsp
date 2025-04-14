<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Dados do Produto</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container">
    <h1 class="mt-4 mb-4">Dados do Produto</h1>
    
    <form class="form" method="post" action="ServletProdutoFC">
        <input type="hidden" name="acao" value="${produto == null ? 'incluir' : 'alterar'}">
        
        <c:if test="${produto != null}">
            <input type="hidden" name="id" value="${produto.id}">
        </c:if>
        
        <div class="mb-3">
            <label for="nome" class="form-label">Nome:</label>
            <input type="text" class="form-control" id="nome" name="nome" 
                   value="${produto.nome}" required>
        </div>
        
        <div class="mb-3">
            <label for="quantidade" class="form-label">Quantidade:</label>
            <input type="number" class="form-control" id="quantidade" name="quantidade" 
                   value="${produto.quantidade}" required>
        </div>
        
        <div class="mb-3">
            <label for="precoVenda" class="form-label">Preço de Venda:</label>
            <input type="number" step="0.01" class="form-control" id="precoVenda" 
                   name="precoVenda" value="${produto.precoVenda}" required>
        </div>
        
        <button type="submit" class="btn btn-primary">
            ${produto == null ? 'Incluir' : 'Alterar'}
        </button>
        <a href="ServletProdutoFC?acao=listar" class="btn btn-secondary">Cancelar</a>
    </form>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>