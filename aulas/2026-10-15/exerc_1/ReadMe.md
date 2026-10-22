 ```mermaid
    classDiagram
        class Telefone{
            
        }

    class Dimensao{

        }

    class SemFio{

        }

```

 ```mermaid
    classDiagram
        
        direction BT
        
        class Humano{ 
            - nome: String
        }
        class Diretor{
             - Despesas ArrayList<ContasEscola>
        }
        
        class Coordenador{
            - cargo: String
        }
        
        class Professor{
            
        }
        
        class Aluno{
            - matricula: String
            - nome: String
            - disciplinas: ArrayList<Disciplina>
            - listaNotas: ArrayList<notasAlunos>
        }
        
        class Disciplina{
            - nome: String
        }
        
        Professor "1" --|> Humano
        Aluno "1" --|> Humano
        Aluno "0..* "--o "0..*" Disciplina
        Coordenador --|> Humano
        Diretor --|> Coordenador
        Disciplina "1" --o "0..*" Professor

```


```mermaid
    classDiagram
         
        class livro{
            - autor: String
            - isbn: int
        }
        
        class revista{
            - tema: String
        }
        
        class jornal{
            - materia: String
            
        }
        
        class gibi{
            - ilustrador: String
        }
        
        class obra{
            - titulo
        }
        
        class periodico{
            -issn: String
        }

        obra <|-- periodico
        periodico <|-- jornal
        obra <|-- livro
        periodico <|-- gibi
        periodico <|-- revista

```

```mermaid
classDiagram
    
    class gato{
        + miar()
        }
    
    class cachorro{
        + latir()
         }
         
    class arara{
        + falar()
         }
    
    class galinha{
        + cacarejar()
    }
    
    class baleia{
        
        + respirar()
        
    }
    
    class tubarao{
        + 
    }
    
    class aquatico{
        
        + nadar()
    }
    
    class terrestre{
        
        + andar()
    }
    
    class aereo{
        
        + voar()
    }
    
    class animal{
        + comer()
        + reproduzir()
    }
    
    class mamifero{
        
        + gestar()
        + mamar()
    }
    
    class oviparo{
        + porOvos()
    }
    
    
    gato --|> terrestre
    cachorro --|> terrestre
    aereo --|> terrestre
    galinha --|> aereo
    arara --|> aereo
    tubarao --|> aquatico
    baleia --|> aquatico
    aquatico --|> animal
    terrestre --|> mamifero
    mamifero --|> animal
    oviparo --|> animal
    
    
    
    
    
    
    
    



```