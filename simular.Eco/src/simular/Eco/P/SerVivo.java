package simular.Eco.P;

public class SerVivo {
    private String nome;
    protected int idade;
    private boolean predador;

    public SerVivo(String nome, int idade, boolean predador) {
        this.nome = nome;
        this.idade = idade;
        this.predador = predador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isPredador() {
        return predador;
    }

    public void mover() {
        System.out.println(nome + " esta se movendo no Ecossistema.");
        System.out.println("--------------------"); 
    }

    public void crescer() {
        idade++;
        System.out.println(nome + " cresceu. Idade: " + idade);
    }
}