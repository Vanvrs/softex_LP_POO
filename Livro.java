package orientacao_objeto;
//Crie uma classe de sua prefer�ncia com, no m�nimo, uma vari�vel, 
//um m�todo e um incremento.
//Depois, desenvolva tr�s ou mais objetos para testar o c�digo.

public class Livro {
       String nome;
       String descricao;
       String autor;
       String isbn;
       double preco;
       String dataPub;
       
void dadosLivro() {
    	   System.out.println("Nome do Livro: " + nome);
    	   System.out.println("Pre�o: " + preco);
    	   System.out.println("Autor: " + autor);
    	   System.out.println("Data de Publica��o: " + dataPub + "\n");
    	   
       }
       
public static void main(String[] args) {
   		Livro livro = new Livro();
   		
   		livro.nome = "Apredendendo Tecnologia";
   		livro.descricao = "Livro sobre Front End";
   		livro.isbn = "2987645825";
   		livro.preco = 89.95;
   		livro.autor = "Andrea Luiza";
   		livro.dataPub = "21/07/2022";
   		
   		livro.dadosLivro();
   		
   		
   				
   				
   		

   	}

}
