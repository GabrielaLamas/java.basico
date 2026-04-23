public class Operadores {
    public static void main(String[] args) throws Exception {
        String nome = "João";
        String sobrenome = "Maria" + " Silva";
        System.out.println(nome + " " + sobrenome);

        int numero = 10; //10
        //fazendo o numero se tornar negativo
        numero = -numero; //-10

        //fazendo o numero se tornar positivo
        numero = numero * -1; //10

        //numero++ = numero + 1
        //numero-- = numero - 1
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel); //inverte o valor da variável, ou seja, se for true, se torna false, e vice-versa

        //operadores ternários
        int a = 5;
        int b = 10;

        String resultado = (a > b) ? "a é maior que b" : "b é maior que a"; //se a for maior que b, o resultado será "a é maior que b", caso contrário, o resultado será "b é maior que a"
        //? vai representar o se e : vai representar o senão
        //vai retornar false, pois a não é maior que b

        //operadores lógicos
        // && = operador logico E
        // || = operador logico OU
        // ! = operador logico NÃO
        boolean x = true;
        boolean y = false;
        if (x && y) //se x e y forem verdadeiros, o resultado será verdadeiro, caso contrário, o resultado será falso
            {
            System.out.println("x e y são verdadeiros");
            } 

        else if (x || y) //se x ou y forem verdadeiros, o resultado será verdadeiro, caso contrário, o resultado será falso
            {
            System.out.println("pelo menos um dos valores é verdadeiro");
            } 

        else //se x for verdadeiro e y for falso, o resultado será verdadeiro, caso contrário, o resultado será falso
            {
            System.out.println("x é verdadeiro e y é falso");
            } 

        System.out.println("fim do programa");

    }
}
