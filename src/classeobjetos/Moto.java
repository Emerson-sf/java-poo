package classeobjetos;

public class Moto extends Veiculos {

    private int cilindradas;

    public Moto(String marca, int cilindradas){
        super(marca);
        this.cilindradas = cilindradas;
    }

    void empinar(){
        System.out.println("A moto está empinando");
    }

    //Sobrescrita de metodo
    @Override
    public void acelerar(){
        System.out.println("A moto está acelerando");
    }
}
