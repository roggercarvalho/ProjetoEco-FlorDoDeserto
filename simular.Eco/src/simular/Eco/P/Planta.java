package simular.Eco.P;

public class Planta extends SerVivo {
    public Planta(String nome, int idade, boolean predador) {
        super(nome, idade, predador);
    }

    public void reproduzir() {
    	System.out.println(getNome() + " esta se reproduzindo.");
    }
    
    public void crescer() {
    	
    }
}	