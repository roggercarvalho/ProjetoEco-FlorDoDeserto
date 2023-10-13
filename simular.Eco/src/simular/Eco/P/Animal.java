package simular.Eco.P;

public class Animal extends SerVivo {

    public Animal(String nome, int idade, boolean predador) {
        super(nome, idade, predador);
    }

    public void comer(SerVivo elemento) {
        if (this.isPredador() && elemento instanceof Animal && !elemento.equals(this)) {
            System.out.println(getNome() + " esta comendo " + elemento.getNome() + ".");
        } else {
            System.out.println(getNome() + " nao pode comer " + elemento.getNome() + ".");
        }
    }

    public void crescer() {
        int novaIdade = getIdade() + 1;
        setIdade(novaIdade);
        System.out.println(getNome() + " esta envelhecendo. Sua idade e : " + getIdade());
    }

    private void setIdade(int novaIdade) {
        this.idade = novaIdade;
        System.out.println("--------------------"); 
    }
}
