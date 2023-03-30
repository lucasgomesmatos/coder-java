package poo;

public class CarroTeste {

    public static void main(String[] args) {
        var carro = new Carro();
        carro.ligar();
        System.out.println(carro.estarLigado());
        System.out.println(carro.motor.giros());
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.motor.giros());
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        System.out.println(carro.motor.giros());
    }
}
