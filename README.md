# TP3 - Buscas e Relacionamento N:N

Este projeto expande as funcionalidades do sistema de gerenciamento de tarefas ao adicionar um relacionamento N:N entre tarefas, categorias e rotulos, permitindo que uma tarefa esteja vinculada a várias categorias e vice-versa. Além disso, foi implementado um mecanismo de buscas por termos nas tarefas utilizando listas invertidas, otimizando a eficiência na recuperação de informações. O uso de estruturas como as listas invertidas para os termos e uma tabela de associação para gerenciar as relações N:N garante maior flexibilidade e desempenho na manipulação e busca dos dados, mesmo em cenários de grande volume.

## Alunos

- Arthur Clemente Machado
- Gabriel Cunha Schlegel
- Lucas Henrique Rocha Hauck

## Estrutura das Classes
---

### Classe `ArquivoTarefas`
Estende a classe `Arquivo` para gerenciar os dados de tarefas.
- **Métodos**:
- `create(Tarefa tarefa):` Insere uma nova tarefa e a associa a uma categoria.
- `createN(int idTarefa, ArrayList<Integer> id2):` Vincula uma tarefa a múltiplos rótulos.
- `getN(int idTarefa):` Retorna os IDs dos rótulos associados a uma tarefa.
- `delete(int id):` Remove uma tarefa e atualiza os índices relacionados.
- `deleteN(int idTarefa):` Remove os vínculos de uma tarefa com seus rótulos.
- `update(Tarefa novaTarefa):` Atualiza uma tarefa, incluindo vínculos com categorias e índices.
- `updateN(int idTarefa, ArrayList<Integer> id2):` Atualiza os rótulos vinculados a uma tarefa.
- `buscarPorCategoria(int idCategoria):` Lista as tarefas de uma categoria específica.
- `printTarefas():` Exibe todas as tarefas disponíveis.
- `getTarefas():` Retorna uma lista com todas as tarefas.
- `getTarefasbyRotulos(ArrayList<Integer> idRotulo):` Retorna tarefas associadas a todos os rótulos fornecidos.

---

### Classe `ArquivoRotulos`
Estende a classe `Arquivo` para gerenciar os dados de tarefas.
- **Métodos**:
- `create(Rotulo rotulo)`: Insere um novo rótulo e inicializa seus índices.
- `createN(int idRotulo, ArrayList<Integer> id2)`: Vincula um rótulo a múltiplas tarefas.
- `read(int id)`: Retorna o rótulo correspondente ao ID fornecido.
- `getN(int idRotulo)`: Retorna os IDs das tarefas associadas a um rótulo.
- `update(Rotulo rotulo)`: Atualiza as informações de um rótulo.
- `updateN(int idRotulo, ArrayList<Integer> id2)`: Atualiza os vínculos entre um rótulo e suas tarefas.
- `delete(int id)`: Remove um rótulo e seus vínculos com as tarefas.
- `getRotulos()`: Retorna todos os rótulos disponíveis.
- `getRotulosByTarefa(int idTarefa)`: Retorna os rótulos associados a uma tarefa específica.

---

### Classe `MenuRotulos`
- **Métodos**:
- `menu()`: Exibe o menu principal para manipulação de rótulos e processa a escolha do usuário.
- `adicionarRotulo()`: Solicita informações do usuário e adiciona um novo rótulo.
- `atualizarRotulo()`: Permite ao usuário selecionar e atualizar um rótulo existente.
- `excluirTarefa()`: Exclui um rótulo selecionado pelo usuário.
- `listarRotulctlRotulos()`: Lista todos os rótulos armazenados.

---

### Classe `Categoria`
Define a entidade `Categoria`, que permite organizar tarefas em grupos.
- **Métodos**:
  - `getId`: Retorna o ID da categoria.
  - `setId`: Define o ID da categoria.
  - `getNome`: Retorna o nome da categoria.
  - `setNome`: Define o nome da categoria.
  - `getChaveIndice`: Retorna a chave do índice com base no nome da categoria em letras minúsculas.
  - `setExcluido`: Define o status de exclusão da categoria.
  - `isExcluido`: Verifica se a categoria está marcada como excluída.
  - `toByteArray`: Serializa o objeto `Categoria` em um array de bytes.
  - `fromByteArray`: Reconstrói o objeto `Categoria` a partir de um array de bytes.
  - `compareTo`: Compara a categoria atual com outra categoria pelo ID.
  - `toString`: Retorna uma representação textual da categoria, exibindo ID e nome.

---

### Classe `Categorias_ctl`
Controla o gerenciamento de categorias.
- **Métodos**:
  - `adicionarCategoria`: Tenta adicionar uma nova categoria, caso seja possível utiliza o create do ArquivoCategorias.
  - `excluirCategoria`: Realiza as verificações necessárias e utiliza o delete do ArquivoCategorias para excluir a categoria.
  - `gerarRelatorioTarefasPorCategoria`: Utiliza o printCategorias do ArquivoCategorias para mostrar todas as categorias e a tarefas vinculadas a cada uma.

---

### Classe `Tarefas_ctl`
Controla o gerenciamento de tarefas.
- **Métodos**:
  - `adicionarTarefa`: Tenta adicionar uma nova tarefa, caso seja possível utiliza o create do ArquivoTarefas.
  - `excluirTarefa`: Realiza as verificações necessárias e utiliza o delete do ArquivoTarefas para excluir a categoria.
  - `printTarefas`: Utiliza o printTarefas do ArquivoTarefas para mostrar todas tarefas.

---

### Classe `IO`
Classe principal utilizada para testar a funcionalidade do projeto. Possui o Menu inicial e chama os menus de categoria e tarefa dependendo da opção.

---

### Classe `MenuCategorias`
Fornece uma interface de menu para o gerenciamento de categorias, permitindo ao usuário criar, atualizar, listar e excluir categorias de forma intuitiva.
- **Métodos**:
  - `menu()`: Exibe as opções de menu e chama os métodos de controle de acordo com as escolhas do usuário.
  - `adicionarCategoria`: Adiciona uma nova categoria.
  - `excluirCategoria`: Exclui uma categoria existente.
  - `listarCategorias`: Lista todas as categorias.
  - `gerarRelatorioTarefasPorCategoria`: Gera um relatório de tarefas agrupadas por categoria.

---

### Classe `MenuTarefas`
Fornece uma interface de menu para o gerenciamento de tarefas, permitindo ao usuário criar, atualizar, listar e excluir tarefas de forma intuitiva.
- **Métodos**:
  - `menu`: Exibe o menu de operações disponíveis para tarefas.
  - `adicionarTarefa`: Adiciona uma nova tarefa a uma categoria selecionada.
  - `excluirTarefa`: Exclui uma tarefa existente.
  - `listarTarefas`: Lista todas as tarefas registradas.

---

## Experiência

- **Dificuldades**: O principal desafio foi manter a organização dos diferentes arquivos e classes e lembrar onde está implementado cada funcionalidade envolvida no projeto. Também foram enfrentados problemas ao manter a compatibilidade entre um código e outro,
  causado ou pela herança feita de forma errada (Por exemplo ao usar o método toString de um objeto usar o toString padrão da classe Object.
  
- **Funcionamento**: Foi criada a entidade Categoria para agrupar as tarefas, além do CRUD de categorias e relacionamento entre categorias e tarefas. Também foram feitas as visões e os controles de tarefas e categorias para proporcionar uma interface interativa
  para o usuário.


## Perguntas e Respostas

- O índice invertido com os termos das tarefas foi criado usando a classe ListaInvertida?
- O CRUD de rótulos foi implementado?
- No arquivo de tarefas, os rótulos são incluídos, alterados e excluídos em uma árvore B+? 
- É possível buscar tarefas por palavras usando o índice invertido?
- É possível buscar tarefas por rótulos usando uma árvore B+? 
- O trabalho está completo?
- O trabalho é original e não a cópia de um trabalho de um colega?

