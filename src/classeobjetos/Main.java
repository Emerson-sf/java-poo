package classeobjetos;

public class Main {

    // Classe = modelo.
    // Instância = objeto criado a partir da classe.
    // Estado = valores atuais dos atributos de um objeto.
    // Método de instância = comportamento executado por um objeto específico.

    //static → pertence à classe
    //sem static → pertence às instâncias da classe

    //Método de instância
    //É um método que pertence aos objetos criados a partir de uma classe.
    // Ele pode acessar e usar diretamente os atributos daquela instância.


    public static void main(String[] args) {

        /*Pessoa pessoa1 = new Pessoa();
        Aqui, Carro é a classe e carro1 referencia uma instância de Carro.

        pessoa1.nome = "Emerson";
        pessoa1.idade = 22;

        pessoa1.apresentar();*/

        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        //  Construtor é um mecanismo usado para inicializar um objeto no momento em que ele é criado.

//        carro1.marca = ;
//        carro1.modelo = ;
//        carro1.ano = ;

        Carro carro2 = new Carro("Honda", "Civic", 2022);

//        carro2.marca = ;
//        carro2.modelo = ;
//        carro2.ano = ;

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
        carro1.acelerar();
        carro2.acelerar();

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());

        carro1.setModelo("Yaris");
        carro1.setAno(-10);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());

    }
}
