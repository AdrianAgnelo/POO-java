package construtores;

public class sistemaCadastros {
    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa("123", "marcos");
        
        marcos.setEndereco("Rua 1");

        System.out.println(marcos.getNome() + ", " + marcos.getCpf() + ", " + marcos.getEndereco());
    }
}
