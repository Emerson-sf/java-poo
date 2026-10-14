package classeobjetos;

public class Moto extends Veiculos {

    private int cilindradas;

    public Moto(String marca, int cilindradas){
        super(marca);
        this.cilindradas = cilindradas;
    }

    public void empinar(){
        System.out.println("A moto está empinando");
    }

    //Sobrescrita de metodo
    @Override
    public void acelerar(){
        System.out.println("A moto está acelerando");
    }

    @Override
    public void buzinar() {
        System.out.println("BIP BIP");
    }
}
