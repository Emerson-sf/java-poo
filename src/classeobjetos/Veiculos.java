package classeobjetos;

public abstract class Veiculos {

    private String marca;

    public Veiculos(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void acelerar();

    public void buzinar() {
        System.out.println("Veículo buzinando");
    }

    public void desligar() {
        System.out.println("Veiculo desligado");
    }

}



