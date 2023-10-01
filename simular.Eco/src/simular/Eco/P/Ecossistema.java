package simular.Eco.P;

import java.util.ArrayList;
import java.util.List;

public class Ecossistema {
    public static void main(String[] args) {
        // Criar uma lista para armazenar os elementos do ecossistema
        List<Elemento> elementos = new ArrayList<>();

        // Adicionar animais, plantas e fenômenos naturais à lista
        Animal gato = new Animal("Gatinho Bravo", 0, true, false);
        Animal rato = new Animal("Ratinho Malandro", 0, false, true);

        Planta florDoDeserto = new Planta("Flor do Deserto", 1, false);
        FenomenoNatural chuva = new FenomenoNatural("Chuva", 0, false);

        // Adicionar os elementos à lista
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
       
        //"ENQUANTO"Simular o ciclo da vida no ecossistema
        for (int ciclo = 1; ciclo <= 3; ciclo++) {
            System.out.println("Ciclo : " + ciclo );
            System.out.println();
            // "ENQUANTO"  ": É IGUAL A PERCORRER"
            for (Elemento elemento : elementos) {
                elemento.crescer();
                // "SE"
                if (elemento instanceof Animal) {
                    Animal animal = (Animal) elemento;
                    animal.mover();
                    
                    // "ENQUANTO" Simular caça de animais
                    for (Elemento possivelPresa : elementos) {
                        if (animal.isPredador() && possivelPresa instanceof Animal && !possivelPresa.equals(animal)) {
                            animal.comer(possivelPresa);
                             
                        }
                    } // "SENÃO SE"
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
