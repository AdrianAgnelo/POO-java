package visibilidaderecursos.atendimento.cozinha;

import visibilidaderecursos.atendimento.Atendente;

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

    private void prepararLanche () {
        System.out.println("Preparando lanche");
    }

    private void prepararVitamina () {
        System.out.println("Preparando vitamina");
    }

    private void prepararCombo () {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche () {
        System.out.println("Selecionando o pão, salada, ovo e carne");
    }

    private void selecionarIngredientesVitamina () {
        System.out.println("Selecionando Fruta, Leite e Suco");
    }

    private void lavarIngredientesVitamina () {
        System.out.println("Lavando");
    }

    private void baterVitamina () {
        System.out.println("Batendo vitamina");
    }

    public void fritarIngredientesLanche () {
        System.out.println("Fritando");
    }


     void pedirParaTrocarGas (Almoxarifado meuAmigo) {
        meuAmigo.trocarGas();
    }

     void pedirIgredientes (Almoxarifado almoxarife) {
        almoxarife.entregarIngredientes();
    }


}
