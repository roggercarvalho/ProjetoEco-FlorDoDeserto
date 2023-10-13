package simular.Eco.P;

import java.util.ArrayList;
import java.util.List;

public class Ecossistema {
    public static void main(String[] args) {
        // Essa parte do código Cria uma lista para armazenar os elementos do ecossistema.
        List<SerVivo> elementos = new ArrayList<>();

        // Essa parte do código Adicionar animais, plantas e fenômenos naturais à lista.
        Animal gato = new Animal("Gato", 0, true);
        Animal rato = new Animal("Rato", 0, true);

        Planta florDoDeserto = new Planta("Flor do Deserto", 1, false);
        FenomenoNatural chuva = new FenomenoNatural("Chuva", 0, false);

        elementos.add(gato);
        elementos.add(rato);
        elementos.add(florDoDeserto);
        elementos.add(chuva);
        
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println(" || SIMULADOR ECO ||");
        System.out.println("--FLOR DO DESERTO--");
        System.out.println("--------------------");
        System.out.println("--------------------"); 
        
        System.out.println();
        
        System.out.println ("| Aqui veremos algumas simulacoes do nosso Ecossistema | ");
        System.out.println();
       
        // Aqui o código simula o ciclo da vida no ecossistema através de estrutura de repetição e cria inteções por estrutura de condiçõe.
        for (int ciclo = 1; ciclo <= 3; ciclo++) {
            System.out.println("Ciclo : " + ciclo );
            System.out.println();
          
            for (SerVivo elemento : elementos) {
                elemento.crescer();
                
                if (elemento instanceof Animal) {
                    Animal animal = (Animal) elemento;
                    animal.mover();
                    
                 
                    for (SerVivo possivelPresa : elementos) {
                        if (animal.isPredador() && possivelPresa instanceof Animal && !possivelPresa.equals(animal)) {
                            animal.comer(possivelPresa);
                             
                        }
                    } 
                } else if (elemento instanceof Planta) {
                    Planta planta = (Planta) elemento;
                    planta.reproduzir();
                } else if (elemento instanceof FenomenoNatural) {
                    FenomenoNatural fenomeno = (FenomenoNatural) elemento;
                    fenomeno.influenciarEcossistema();
                    System.out.println("--------------------"); 
                    System.out.println("--------,,----------"); 
                }
            }

            System.out.println();
        }
    }
}
