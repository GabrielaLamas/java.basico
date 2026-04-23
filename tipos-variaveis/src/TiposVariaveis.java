public class TiposVariaveis {
    // estrutura das variaveis: <tipo> <nome> = <valor>;
    //tipos primitivos: int, double, float, char, boolean
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        final double salario = 1250.70; //mil e duzentos e cinquenta reais e setenta centavos
        final double numero = 1.7; // numero com ponto flutuante, um numero com virgula nao é aceito

        System.out.println(salario);
        System.out.println(numero);
        //salario = 2000.00; - erro, pois a variavel salario é do tipo final, ou seja, nao pode ser alterada
        
        //quando uma variavel é do tipo final, ela é uma constante, ou seja, seu valor nao pode ser alterado depois de atribuido
    }
}
