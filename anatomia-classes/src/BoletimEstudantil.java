// arquivo BoletimEstudantil.java

//PROGRAMA QUE RETORNA UMA MENSAGEM CONFORME O VALOR DA VARIAVEL
public class BoletimEstudantil {
    public static void main(String[] args) {

        // programa sem identação!!!

        int mediaFinal = 7; // declarando valor int 6 a variavel mediaFinal
        if (mediaFinal < 6) // se mediaFinal for menor que 6...
            System.out.println("REPROVADO"); // o sistema vai imprimir na tela a mensagem "REPROVADO"
        else if (mediaFinal == 6) // caso for igual a 6...
            System.out.println("PROVA MINERVA");
        else // caso a variavel nao corresponder as condicoes acima...
            System.out.println("APROVADO"); // mensagem de "APROVADO"
        //comando para identação automática ctrl + alt + f 
    }
}
