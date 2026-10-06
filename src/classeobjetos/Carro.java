package classeobjetos;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano){
        if(ano > 0) {
            this.ano = ano;
        }
    }

    void exibirInformacoes() {
        System.out.println("-------\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano);
    }

    void acelerar() {
        System.out.println("O " + modelo + " está acelerando");
    }
}