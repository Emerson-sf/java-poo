package classeobjetos;

//classe
public class Carro extends Veiculos {

    private String modelo;
    private int ano;
    private int portas;


    public Carro(String marca, int portas){
        super(marca);
        this.portas = portas;
    }

    /** encapsulamento -

    public String getMarca() {return marca; }
    public String getModelo() {return modelo; }
    public int getAno() {return ano; }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano){
        if(ano > 0) {
            this.ano = ano;
        }
    }*/

    public void exibirInformacoes() {
        System.out.println("-------\nMarca: " + getMarca() + "\nModelo: " + modelo + "\nAno: " + ano);

    }

    @Override
    public void acelerar(){
        System.out.println("Carro acelerando");
    }

    @Override
    public void buzinar() {
        System.out.println("BEEP BEEP");
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto");
    }
}