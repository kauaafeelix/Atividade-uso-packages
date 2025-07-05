<h1 align = "center">Organização de Pastas e Packages no Java</h1>
Esta atividade foi desenvolvida na Unidade Curricular de Técnicas de Programção com o Professor Bruno de Andrade.

---
O intituito da atividade foi práticar:

<ul> Criação de superclasse e subclasses com uso de herança </ul>
<ul> Organização do projeto em pacotes (model, service, view, main </ul>
<ul> Uso de ArrayList para armazenar objetos dinamicamente </ul>
<ul> Entrada de dados com Scanner </ul>
<ul> Aplicação do **princípio da responsabilidade única </ul>
<ul> Implementação das funções de cadastro, listagem, remoção, edição e busca </ul>
<ul> Criação de menu interativo com switch-case </ul>
<ul> Prática com boas práticas de modelagem orientada a objetos </ul>

---
<h2> Estrutura do Projeto </h2>
Exemplo do Cadastro de Livros:

<ul>📦 com.bibliotech </ul>
 <ul>┣ 📁 model       → Classe Livro </ul>
 <ul>┣ 📁 service     → Classe Biblioteca </ul>
 <ul>┣ 📁 view        → Classe Atendente </ul>
<ul> ┗ 📁 main        → Classe BiblioTech (main) </ul>

### Enunciado

Você foi contratado para desenvolver um sistema de controle de **livros** para uma pequena biblioteca comunitária. A ideia é permitir que os atendentes possam cadastrar, editar, buscar, listar e remover livros de forma prática e eficiente.

Para isso, o sistema será dividido em camadas, utilizando **orientação a objetos** e **organização modular por pacotes**.

<h2> Funcionalidades Implementadas </h2>

Cadastro de livros: Permite adicionar novos livros com informações como título, autor, ano de publicação e gênero.

Listagem de livros: Exibe todos os livros cadastrados no sistema, organizados de forma clara.

Busca de livros: Permite encontrar livros pelo título ou autor.

Edição de livros: Possibilita atualizar as informações de um livro já cadastrado.

Remoção de livros: Exclui livros do sistema a partir do seu identificador único.

Menu interativo: Interface simples baseada em console para navegar entre as opções usando o switch-case.

<h2> Como Executar </h2>

Clone o repositório:

git clone https://github.com/kauaafeelix/Atividade-uso-packages.git

---
<h2> Tecnologias Utilizadas </h2>
Java SE 11+

Estrutura de pacotes organizada

ArrayList para gerenciamento dinâmico dos livros

Scanner para entrada de dados via console

---
<h2> Estrutura dos Pacotes e Classes </h2>

Pacote	Classe	Descrição

### model
Livro	Representa o objeto livro com seus atributos

### service
Biblioteca	Contém a lógica para manipulação dos livros

### view
Atendente	Interface de interação com o usuário (entrada/saída)

### main	
BiblioTech	Classe principal que inicia a aplicação

---
<h2> Próximas Melhorias </h2>

Implementar persistência de dados em arquivo ou banco de dados.


Criar interface gráfica para melhorar a usabilidade.

Adicionar autenticação para usuários (ex: administradores e atendentes).

Inclusão de categorias mais detalhadas e avaliação dos livros.
