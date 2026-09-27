package classeobjetos;

public class Carro {

    String marca;
    String modelo;
    int ano;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirInformacoes() {
        System.out.println("-------\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano);
    }

    void acelerar() {
        System.out.println("O " + modelo + " está acelerando");
    }
}