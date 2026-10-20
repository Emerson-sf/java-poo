package Generics;

public class Caixa<T>{

    private T valor;

    public void setValor(T valor){
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public static <T> void exibirValor(T valor){
        System.out.println(valor);
    }
}
