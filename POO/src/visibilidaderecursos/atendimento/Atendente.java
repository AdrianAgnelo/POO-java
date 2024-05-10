package visibilidaderecursos.atendimento;

public class Atendente {

    public void atenderMesa () {
        System.out.println("Atendendo mesa");
    }

    public void servirMesa () {
        pegarLancheCozinha();
        System.out.println("Servindo mesa");
    }

    private void pegarLancheCozinha () {
        System.out.println("Pegando lanche");
    }

    public void receberPagamento () {
        System.out.println("Recebendo pagamento");
    }

    public void pegarPedidoBalcao () {
        System.out.println("Pegando o pedido");
    }
}
