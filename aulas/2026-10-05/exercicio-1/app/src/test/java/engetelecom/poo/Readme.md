```mermaid
    classDiagram
    direction LR
    
    class Autor{
    - idAutor: int
    - nome: String 
    }

    class Livro{
        - idLivro: int
        - titulo: String
        - idioma: String
        - edicao: ArrayList<Edicoes>
        - autores: ArrayList<Autor>
        - editora: Editora
    }
    
    class Editora{
        - idEditora: int
        - nome: String
        - cidade: String
    }
    
    class Edicao{
        - idEdicao: int
        - isbn: String
        - paginas: int
        - ano: int
        - idEditora: int
    }
    
    Autor "1..*" --o "0..*" Livro
    Livro "1" *-- "1..*" Edicao
    Edicao "1..*" --o "1" Editora
    
```

```mermaid  

    classDiagram
    direction TB
    
    class Aluno{
        - nome: String
        - cpf: String
        - dataNasc: LocalDate
        - matriculas: ArrayList<Matricula>
    }
    
    class Curso{
       - nome: String
       - cargaHoraria: int
       - idCurso: int
    }

    class Matricula{
        - dataDeMatricula: LocalDate
        - matricula: String
        - situacao: String
        - curso: Curso
    }
    
    
    Aluno "1" --o "1..*" Matricula
    Curso "0..*" --o "1" Matricula
    
    
```

```mermaid

    classDiagram
    direction TB
    
    class App{ }
    
    class Agenda{ }
    
    class Contato{ }
    
    class Telefone{ }
    
    class Email{ }

    App ..> Contato
    App "1" *-- "1" Agenda
    Agenda "1" o-- "0..*" Contato
    Email "1" o-- "0..*" Contato
    Telefone "1" o-- "0..*" Contato

```