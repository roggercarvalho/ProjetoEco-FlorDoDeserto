package simular.Eco.P;

public class FenomenoNatural extends Elemento {
    public FenomenoNatural(String nome, int idade, boolean predador) {
        super(nome, idade, predador);
    }

    public void influenciarEcossistema() {
        System.out.println(getNome() + " esta influenciando o ecossistema.");
    }

    public void crescer() {
       
    }
}