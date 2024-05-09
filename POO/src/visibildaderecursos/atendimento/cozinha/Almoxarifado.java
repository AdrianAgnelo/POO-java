package visibildaderecursos.atendimento.cozinha;

public class Almoxarifado {
    
    private void controlarEntrada () {
        System.out.println("Controlando entrada");
        controlarEntrada();
    }
    
    private void controlarSaida () {
        System.out.println("Controlando saida");
        controlarSaida();
    }

    void entregarIngredientes () {
        System.out.println("Entregando ingredientes");
    }

    void trocarGas () {
        System.out.println("Almoxarife trocando gás");
    }


}
