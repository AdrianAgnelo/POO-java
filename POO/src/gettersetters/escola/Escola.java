package gettersetters.escola;


public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        
        felipe.setName("Felipe");
        felipe.setAge(12); 

        System.out.println("O aluno " + felipe.getName() + " Tem " + felipe.getAge() + " anos");
    }
}
