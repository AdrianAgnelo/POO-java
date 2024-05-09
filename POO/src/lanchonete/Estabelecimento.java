package lanchonete;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponiveis
        cozinheiro.lavarIngredientesVitamina();
        cozinheiro.baterVitamina();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();

        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarifado almoxarifado = new Almoxarifado();
        //ações que não precisam estarem disponiveis
        almoxarifado.controlarEntrada();
        almoxarifado.controlarSaida();
        // ações que somente o package cozinha precisa conhecer(default)
        almoxarifado.entregarIngredientes();
        almoxarifado.trocarGas();

        Atendente atendente = new Atendente();
       atendente.pegarLancheCozinha();
       atendente.receberPagamento();
       atendente.servirMesa();
       //ação que só o pacote cozinha precisa saber (default)
       atendente.trocarGas();

       Clientes clientes = new Clientes();
       clientes.escolherLanche();
       clientes.pedirLanche();
       clientes.pagarConta();

       //não deveria, mas o estabelecimento ainda não definiu normas de atendimento
       clientes.pegarPedidoBalcao();

       //esta ação é muito sigilosa (private)
       clientes.olharSaldo();

       //esta ação é muito sigilosa (private)
       cozinheiro.pedirParaTrocarGas(atendente);
       cozinheiro.pedirParaTrocarGas(almoxarifado);
    }
}
