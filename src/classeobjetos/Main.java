package classeobjetos;

public class Main {

    public static void main(String[] args) {

        //Herança --

        /** Carro carro1 = new Carro("Toyota", 4);
        Moto moto1 = new Moto("Honda", 500);

        System.out.println(carro1.getMarca());
        carro1.acelerar();
        System.out.println(moto1.getMarca());
        moto1.acelerar();

        Veiculos veiculo1 = new Carro("Ford", 2);
        Veiculos veiculo2 = new Moto("Yamaha", 300);

        veiculo1.acelerar();
        veiculo2.acelerar();
         **/

        //Polimorfismo --

        /**
        Veiculos[] veiculos = {
                new Carro("Toyota", 4),
                new Moto("Honda", 500),
                new Carro("Ford", 2),
                new Moto("Yamaha", 300)
        };

        for (Veiculos veiculo : veiculos) {
            veiculo.acelerar();

            if(veiculo instanceof Moto moto){
                moto.empinar();
            }
            else if (veiculo instanceof Carro carro){
                carro.abrirPortaMalas();
            }
        } */

        /**
        Veiculos v1 = new Carro("Toyota", 4);
        Veiculos v2 = new Moto("Honda", 500);

        v1.acelerar();
        v1.desligar();

        v2.acelerar();
        v2.desligar();
         */

        Carro carro = new Carro("Toyota", 4);

        carro.ligar();
        carro.acelerar();
        carro.desligar();
    }
}


/**   Anotações -
 // Classe = modelo.
 // Instância = objeto criado a partir da classe.
 // Estado = valores atuais dos atributos de um objeto.
 //static → pertence à classe
 //sem static → pertence às instâncias da classe
 //Um método de instância que pertence aos objetos criados a partir de uma classe.
 // Ele pode acessar e usar diretamente os atributos daquela instância.
*/