package gettersetters.escola;

public class Aluno {
    private String nome;
    private int idade;

    public String getName(){
        return nome;
    }

    public void setName (String newName) {
        nome = newName;
    }

    public int getAge() {
        return idade;
    }

    public void setAge (int newAge){
        this.idade = newAge;
    }
}
