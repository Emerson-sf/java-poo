package Exceptions;

public class Main {

    public static void main(String[] args){

        try {
            validarSaldo(1000, 200);
        }
        catch (SaldoInvalidoException | SaqueInvalidoException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operação finalizada");
        }

        try {
            validarSaldo(1000, 1500);
        }
        catch (SaldoInvalidoException | SaqueInvalidoException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operação finalizada");
        }

        try {
            validarSaldo(1000, -50);
        }
        catch (SaldoInvalidoException | SaqueInvalidoException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operação finalizada");
        }

    }

    public static void validarSaldo(double saldo, double saque){
        if(saque <= 0){
            throw new SaqueInvalidoException("Saque invalido, digite um valor disponivel");
        }
        else if (saque > saldo){
            throw new SaldoInvalidoException("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
        }
    }
}
