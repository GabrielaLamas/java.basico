// arquivo = MinhaClasse.java - nome do arquivo tem que ser igual o da classe
public class MinhaClasse {
    public static void main(String[] args) {
        /* declaracao de variaveis
        String meuNome = "Gabriela Lamas";
        int anoFabricacao = 2025;
        boolean verdadeira = false or true;

        mudar valor das variaveis
        anoFabricacao = 2018;
        */
       String primeiroNome = "Gabriela"; // declaracao de variavel
       String segundoNome = "Lamas"; // declaracao de variavel

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //string nomeCompleto recebendo 2 parametros

       System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        //concatenação posso usar + ou .concat

    }
}
