package exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        // Uso da fachada para iniciar e finalizar uma corrida
        CarroFacade carro = new CarroFacade();
        carro.iniciarCorrida("FM 101.5");
        System.out.println("\n--- Corrida em andamento ---\n");
        carro.finalizarCorrida();
    }
}