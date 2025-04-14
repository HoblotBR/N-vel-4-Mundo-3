https://user-images.githubusercontent.com/104142117/204535322-571ae0a5-b475-4441-83b2-06ba02d9930d.png



Aluna: CARLOS HENRIQUE FERREIRA
Matricula: 202403622467
Curso: Desenvolvimento Full Stack
Turma: RPG0016

RPG0017  - Vamos integrar sistemas

Implementação de sistema cadastral com interface Web, baseado nas tecnologias de
Servlets, JPA e JEE.
  
  
  Resumo do Projeto
O projeto é uma aplicação web Jakarta EE projetada para gerenciamento de produtos, utilizando JPA para persistência, EJB para lógica de negócios e Servlets/JSPs para a interface web. Ele visa fornecer uma plataforma robusta para gerenciar dados de produtos com uma interface amigável aprimorada pelo estilo Bootstrap. A aplicação suporta operações CRUD e destina-se a fins educacionais, ajudando os alunos a obter experiência prática com tecnologias web Java.

Descrição dos Módulos do Projeto
Persistência JPA: Gerencia a persistência dos dados do produto usando o SQL Server.
Componentes EJB: Implementa a lógica de negócios para o gerenciamento de produtos.
Servlets: Lida com requisições e respostas HTTP, implementando o padrão Front Controller.
Páginas JSP: Fornece interface de usuário para listagem de produtos e entrada de dados, estilizada com Bootstrap para design aprimorado.
Estrutura de Diretórios


java_template/

 pom.xml                      # Configuração e dependências do projeto
src/main/java/
│cadastroee/
│ controller/
│ ProdutoFacade.java  # EJB para gerenciamento de produtos
│model/
│ Produto.java         # Entidade JPA para produtos
│ servlets/
│ ServletProduto.java  # Servlet simples para teste
│  ServletProdutoFC.java # Servlet Front Controller
├ src/main/resources/
│  META-INF/
│    persistence.xml         # Configuração de persistência JPA
├src/main/webapp/
│  ProdutoDados.jsp            # Formulário de entrada/edição de dados do produto
│  ProdutoLista.jsp            # Página de listagem de produtos
│ WEB-INF/
│  web.xml                 # Descritor da aplicação web
│   index.jsp                   # Página de boas-vindas
template_config.json            # Modelo de configuração





Inventário de Descrição de Arquivos
pom.xml: Configura o projeto como uma aplicação Jakarta EE com as dependências necessárias para JPA, EJB e tecnologias web.
Produto.java: Representa a entidade produto no banco de dados.
ProdutoFacade.java: Bean de sessão EJB que fornece lógica de negócios para operações de produtos.
persistence.xml: Configura as definições do JPA para conexão com o SQL Server.
web.xml: Define as configurações da aplicação web e os mapeamentos de servlet.
ServletProduto.java: Um servlet de teste simples para exibir informações do produto.
ServletProdutoFC.java: Implementa o padrão Front Controller para gerenciar requisições relacionadas a produtos.
ProdutoDados.jsp: Página JSP para inserir e editar detalhes do produto.
ProdutoLista.jsp: Página JSP para exibir uma lista de produtos.
index.jsp: A página inicial da aplicação.
Pilha de Tecnologias
Jakarta EE 8: Framework para desenvolvimento de aplicações corporativas.
JPA: API de Persistência Java para gerenciamento de dados relacionais.
EJB: Enterprise JavaBeans para encapsular a lógica de negócios.
Servlets/JSP: Para lidar com requisições web e gerar conteúdo web dinâmico.
Bootstrap: Framework CSS para design responsivo.
Utilização
Instalar Dependências: Certifique-se de ter JDK, SQL Server e um IDE como o NetBeans instalados.
Configurar o SQL Server: Crie o banco de dados conforme exercícios anteriores.
Configurar o Servidor GlassFish: Configure o pool de conexões JDBC para o SQL Server.
Construir a Aplicação: Use a ferramenta de construção configurada no pom.xml.
Executar a Aplicação: Implante a aplicação no servidor GlassFish e acesse a interface web.
