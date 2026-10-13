package classeobjetos;

public class Veiculos {

    private String marca;

    public Veiculos(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void acelerar(){
        System.out.println("Veiculo acelerando");
    }
}


