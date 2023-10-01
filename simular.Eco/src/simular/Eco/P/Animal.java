package simular.Eco.P;

public class Animal extends Elemento {

    public Animal(String nome, int idade, boolean predador, boolean presa) {
        super(nome, idade, predador);
    }

    public void comer(Elemento elemento) {
        if (this.isPredador() && elemento instanceof Animal && !elemento.equals(this)) {
            System.out.println(getNome() + " esta comendo " + elemento.getNome() + ".");
        } else {
            System.out.println(getNome() + " nao pode comer " + elemento.getNome() + ".");
        }
    }

    public void crescer() {
        // Incrementa a idade do animal a cada ciclo
        int novaIdade = getIdade() + 1;
        setIdade(novaIdade);
        System.out.println(getNome() + " esta envelhecendo. Sua idade e : " + getIdade());
    }

    // Define a idade do animal
    private void setIdade(int novaIdade) {
        this.idade = novaIdade;
        System.out.println("--------------------"); 
    }
}
