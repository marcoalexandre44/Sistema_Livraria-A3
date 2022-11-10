# 1. SISTEMA LIVRARIA - A3

"A leitura é uma fonte inesgotável de prazer, mas por incrível que pareça, a quase totalidade, não sente esta sede." (Carlos Drummond de Andrade)

### 1.1 DESENVOLVEDORES

 [<img src="https://avatars.githubusercontent.com/u/86306974?v=4=" width=115 > <br> <sub> Marco Alexandre - Documentação </sub>](https://github.com/marcoalexandre44)  
 
 [<img src="https://avatars.githubusercontent.com/u/114107276?v=4" width=115 > <br> <sub> PEDRO LADEIA - Back-End </sub>](https://github.com/Peuzebul)  
 
 [<img src="https://avatars.githubusercontent.com/u/93798662?v=4" width=115 > <br> <sub> ALEEF GUSTAVO - Back-End </sub>](https://github.com/AlefeCma)  

LEGENDA:

Back-End: ”O back-end é tudo o que está por trás do software, que o usuário/leitor
não tem acesso direto e não consegue interagir. “

Documentação: ”Documentação é o conjunto de todos documentos, que são todas as fontes contendo informações que ajudem a tomar decisões, comuniquem decisões tomadas,
registrem assuntos de interesse da organização ou do indivíduo.


### 1.2 DATA DE CRIAÇÃO

- 14/09/2022

# 2. INTRODUÇÃO  

O projeto inicialmente consiste em um sistema de livraria com cadastramento de livros realizada pelo administrador. O sistema deve permitir que o usuário se cadastre, mas apenas o administrador poderá conceder permissões, listar livros, usuários e editar estoque. Cada usuário pode ter acesso à tabela de livros e consultar a disponibilidade.  

### 2.1 OBJETIVO DO PROJETO

- Criar um software com automação de testes unitários e de integração;  
- Testes unitários com cobertura de 70% dos métodos;  
- testes de integração usando teste dublês;  
- Criar um documento descritivo com testes funcionais de todas as funcionalidades com casos de uso;  
- Criar um software com login e cadastro de usuário;  
- Criar uma tela com uma funcionalidade simples acessível somente para usuários logados;  
- Usar banco de dados real;  
- Pode ser web ou desktop;  
- Stack de desenvolvimento a critério da equipe;  

### 2.2 TECNOLOGIAS UTILIZADAS

- NetBeans IDE - v12.5
- Java - v8.0
- MySql - v8.0
- Xampp - v
- Beekeeper - v

# 3.0 REQUISITOS DO SISTEMA

### 3.1 REQUISITOS NÃO FUNCIONAIS

RNF01 O sistema deve ser desenvolvido em Java.

RNF02 O sistema deve ser exclusivo para membros cadastrados.

RNF03 O sistema deve estar online 24 h/ 7 dias por semana.

RNF04 O sistema deve ter uma interface de fácil utilização. RNF01

RNF05 O cadastro deve ser feito com: e-mail, nome e senha.

### 3.2 REQUISITOS FUNCIONAIS

RF01 O sistema deve permitir o cadastramento e manutenção de tipos de membro.

RF02 O sistema deve permitir o cadastramento e manutenção de tipos de livros.

RF03 O sistema deve permitir o cadastramento e manutenção de livros.

RF04 O sistema deve permitir o cadastramento e manutenção de estoque.

RF05 O sistema deve permitir o cadastramento e manutenção de gênero dos livros.

RF06 O sistema deve permitir o cadastramento e manutenção de ligação entre livro e gênero. RF05

RF07 O sistema deve conter tela de login.

### 3.3 CASOS DE USO

TELA DE LOGIN

O usuário deve preencher o campo de login e senha com dados válidos registrados no banco de dados e pressionar o botão "entrar" para ser direcionado a tela inicial do programa.

Caso o usuário preencha somente o campo de login válido no banco de dados e pressionar o botão "entrar", o sistema deve apresentar uma mensagem de erro "preencha todos os campos".

Caso o usuário preencha somente o campo de senha válido no banco de dados e pressionar o botão "entrar", o sistema deve apresentar uma mensagem de erro "preencha todos os campos".

Caso o usuário não preencha nenhum campo e aperte o botão de "entrar", deve apresentar uma mensagem de erro "preencha todos os campos".

Caso o usuário preencher o login com dados inexistentes porém a senha existente no banco de dados e pressionar o botão "entrar", o sistema deve apresentar uma mensagem de erro "login ou senha incorreto".

Caso o usuário preencher a senha com dados inexistentes porém o login existente no banco de dados e pressionar o botão "entrar", o sistema deve apresentar uma mensagem de erro "login ou senha incorreto".

Caso o usuário preencha somente o campo de senha com uma senha inexistente  e pressionar o botão "entrar", o sistema deve apresentar uma mensagem de erro "preencha todos os campos".

Caso o usuário preencha somente o campo de login com um login inexistente  e pressionar o botão "entrar", o sistema deve apresentar uma mensagem de erro "preencha todos os campos".

Ao pressionar o botão "registrar" o usuário será redirecionado a tela de registro.

TELA DE REGISTRO
  
O registro deve ser feito completando o campo de e-mail, nome e senha, clicando logo em seguida o botão 'registrar' e sendo levado ate a tela de login novamente.

caso o usuário preencha apenas o campo de e-mail
devera aparecer uma mensagem alertando 'preencha todos os dados'.

Caso o usuário preencha apenas o campo de nome
devera aparecer uma mensagem alertando 'preencha todos os dados'.

Caso o usuário preencha apenas o campo de senha
devera aparecer uma mensagem alertando 'preencha todos os dados'.

Caso o usuário preencha o campo de e-mail com um e-mail já existente devera aparecer
a mensagem 'e-mail invalido'.

Caso o usuário preencha apenas 2 campos devera aparecer uma mensagem alertando
"preencha todos os campos"

TELA DO ADMINISTRADOR

Ao acessar a tela do administrador o usuário pode deletar, adicionar e atualizar livros no banco de dados ao preencher os campos corretamente

Caso o usuário deixe algum campo vazio devera aparecer a mensagem "preencha todos os campos".

Caso o usuário preencha com dados já existentes e aperte em adicionar aparecera a mensagem de erro
"livro já existente"
 
Caso o usuário preencha os dados com informações inexistente e apertar o botão de atualizar ou deletar,
devera aparecer a mensagem de erro "livro não encontrado"

![Untitled Workspace (1)](https://user-images.githubusercontent.com/86306974/196167525-8822472c-9e78-497c-9860-8397c758ec4a.png)



# 4.0 PROTÓTIPO

### 4.1 TELA DE LOGIN

![tela login](https://user-images.githubusercontent.com/86306974/196172239-d9df065f-70ea-4b96-9fcc-9b47fd4f36f7.png)

### 4.2 TELA DE REGISTRO

![tela cadastro](https://user-images.githubusercontent.com/86306974/196172259-044211ea-58c7-45c8-bdfa-69e0f2ec6686.png)

### 4.3 TELA USUÁRIO

![tela membro](https://user-images.githubusercontent.com/86306974/196172293-2735d648-501c-4388-bf61-27ad19320760.png)

### 4.4 TELA USUÁRIO ADMIN

![tela admin](https://user-images.githubusercontent.com/86306974/196172319-387dcb10-ee7e-4ef7-9916-ab2ae39c73b4.png)

# 5.0 MANUAL DO USUÁRIO

Instalar o JAVA JDK e NETBEANS IDE:  

  Windows: https://www.webmundi.com/desenvolvimento-de-sistemas/java/como-instalar-o-java-jdk-e-netbeans-ide-windows/..                                    
  Linux: https://www.linuxdescomplicado.com.br/2011/05/linux-para-programadores-instalando-o-2.html  

Instalar o JAVA:   

  https://www.java.com/pt-BR/download/help/download_options_pt-br.html  

Instalar o XAMPP:   

  Windows: https://pt.wikihow.com/Instalar-o-XAMPP-para-Windows  
  Linux: https://pt.wikihow.com/Instalar-o-XAMPP-no-Linux  

Instalar MYSQL: 

  Windows: https://dicasdeprogramacao.com.br/como-instalar-o-mysql-no-windows/  
  Linux: http://devfuria.com.br/linux/instalando-mysql/   

Para acessar o sistema, o usuário deverá inserir os seus dados na tela de login.  Veja na imagem abaixo:

![login](https://user-images.githubusercontent.com/86306974/196175102-447cde12-95e7-46b5-a7be-ce223617836b.png)

Caso apareça uma mensagem de alerta, verifique se tudo foi digitado corretamente. Se estiver tudo ok, possa ser que o usuário ainda não está cadastrado no sistema, sendo assim, siga os passos das imagens abaixo:

![login](https://user-images.githubusercontent.com/86306974/196176595-f5d621cb-52cb-4d6f-864f-40c90b2de1fe.png)

Próxima etapa é inserir os dados para cadastro e depois clicar no botão "salvar".

![senha](https://user-images.githubusercontent.com/86306974/196177750-825d3510-f407-4381-a784-744c089523d0.png)

O usuário será redirecionado para a página de login, e basta inserir os dados informados na página de cadastro e logar no sistema.

# 5.0 TESTES

-
-
-
-
-
-

# 6.0 ANÁLISE DO SOFTWARE

Nessa análise temos as tabelas 01, 02, 03, 04, 05, 06, 07, 08, onde na primeira coluna categoriza o requisito, na segunda coluna descreve o requisito,
na terceira coluna temos se esse requisito é funcional ou não funcional e por fim na quarta coluna é respondido se esse determinado requisito é atendido,
não atendido, não informado ou parcialmente atendido no software.

TABELA 01

![1](https://user-images.githubusercontent.com/86306974/201102884-f9bde36b-b20f-48d1-95a4-e6f61185b1b3.png)

TABELA 02

![2](https://user-images.githubusercontent.com/86306974/201102940-cf02f92c-569b-4ad0-b25a-867297311438.png)

TABELA 03

![3](https://user-images.githubusercontent.com/86306974/201102971-bfd9e727-d5e8-4521-a5e3-88596e89003b.png)

TABELA 04

![4](https://user-images.githubusercontent.com/86306974/201103002-056b4021-c747-4454-b021-6c551928cde8.png)

TABELA 05

![5](https://user-images.githubusercontent.com/86306974/201103026-4c4ba0ac-7e94-4d63-ab03-fcc24742ae01.png)

TABELA 06

![6](https://user-images.githubusercontent.com/86306974/201103047-66425eba-2718-4018-bc72-1b63ba458591.png)

TABELA 07

![7](https://user-images.githubusercontent.com/86306974/201103067-16ed5e0f-d68b-4915-9620-2e42997959a2.png)

TABELA 08

![8](https://user-images.githubusercontent.com/86306974/201103077-7054dc27-2cf1-40d9-9517-340ce6a01824.png)





