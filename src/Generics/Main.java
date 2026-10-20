package Generics;

public class Main {

    public static void main(String[] args){

        Caixa<String> caixa1 = new Caixa<>();
        Caixa<Integer> caixa2 = new Caixa<>();

        caixa1.setValor("Texto");
        caixa2.setValor(67);

        System.out.println(caixa1.getValor());
        System.out.println(caixa2.getValor());

        Caixa.exibirValor("Exibindo texto");
        Caixa.exibirValor(22);
        Caixa.exibirValor(6.9);
    }
}
