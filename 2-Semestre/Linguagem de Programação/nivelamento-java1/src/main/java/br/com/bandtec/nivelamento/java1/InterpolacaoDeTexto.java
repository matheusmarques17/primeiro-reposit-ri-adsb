
package br.com.bandtec.nivelamento.java1;

public class InterpolacaoDeTexto {
    public static void main(String[] args) {
        
        String nome = "Matheus";
        String sobrenome = "Silva";
        Integer idade = 19;
         Double preco = 22.555555555;
        
        System.out.println("Meu nome é: " + nome + " e tenho " + idade + " anos.");
        
        
        // %s -> texto
        // %d -> número inteiro
        // %.xf -> número reais (casas decimais)
        
        
        String frase = String.format("Nome: %s e idade %d anos.",  nome, idade);
        
        System.out.println(frase);
         
       // String nomeCompleto =  nome + " " + sobrenome;
       
       String nomeCompleto = String.format("Nome: %s Sobrenome: %s", nome, sobrenome);
       
       // System.out.println(nomeCompleto);
        
        System.out.println(String.format("O preço é R$%.1f", preco));
        
    }
}
