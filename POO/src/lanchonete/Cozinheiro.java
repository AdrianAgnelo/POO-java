package lanchonete;

public class Cozinheiro {
    
    public void adicionarLancheNoBalcao () {
        System.out.println("Adicionando lanche no balcão");
    }

    public void adicionarSucoNoBalcao () {
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao () {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche () {
        System.out.println("Preparando lanche");
    }

    public void prepararVitamina () {
        System.out.println("Preparando vitamina");
    }

    public void prepararCombo () {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche () {
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }

    public void selecionarIngredientesVitamina () {
        System.out.println("Selecionando Fruta, Leite e Suco");
    }

    public void lavarIngredientesVitamina () {
        System.out.println("Lavando");
    }

    public void baterVitamina () {
        System.out.println("Batendo vitamina");
    }

    public void fritarIngredientesLanche () {
        System.out.println("Fritando");
    }

    public void pedirParaTrocarGas (Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas (Almoxarifado meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIgredientes (Almoxarifado almoxarife) {
        almoxarife.entregarIngredientes();
    }


}
