// devo essere esposte su un file java che abbiamo un menu di ingresso ( esci,entra )
// che riporti a un secondo me che permetta di visualizzare e modificare le
// risposte scegliendo quale aprire e se terminare

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Inizializzo variabili
        boolean active = true;
        boolean risp = true;

        // creazione risposte
        Risposte r1 = new Risposte(
                "Java è un linguaggio di programmazione ad alto livello, orientato agli oggetti Java supporta la programmazione orientata agli oggetti, il che significa che tutto in Java è un oggetto, tranne i tipi primitivi. Fornisce concetti come classi, oggetti, incapsulamento, ereditarietà e polimorfismo. Portabilità: Le applicazioni Java sono altamente portabili, grazie al concetto di write once, run anywhere (WORA). Ciò significa che il codice sorgente Java può essere scritto una volta e poi eseguito su qualsiasi piattaforma che abbia una Java Virtual Machine (JVM). Sicurezza: Java è progettato per essere un linguaggio sicuro. La JVM esegue un'analisi statica e dinamica del codice Java per garantire che non vengano eseguite operazioni non sicure. Gestione della memoria: Java gestisce la memoria in modo automatico attraverso il garbage collector. L'allocazione e la deallocazione della memoria per gli oggetti sono gestite automaticamente, semplificando la gestione della memoria e riducendo i problemi di accesso errato alla memoria.",
                1);
        Risposte r2 = new Risposte(
                "Le condizioni in programmazione sono istruzioni utilizzate per eseguire diverse azioni in base a una condizione specifica. Nella programmazione, conosciamo diverse condizioni come: if: esegue un blocco di codice se una condizione è vera. else: esegue un blocco di codice alternativo se la condizione dell'if non è vera. else if: viene utilizzato per testare ulteriori condizioni nel caso in cui la condizione dell'if non sia vera.switch: permette di eseguire un blocco di codice diverso in base al valore di una variabile.",
                2);
        Risposte r3 = new Risposte(
                "I cicli sono strutture di controllo che permettono di eseguire ripetutamente un blocco di codice fino a quando una condizione è verificata. Alcuni cicli comuni sono: for: esegue un blocco di codice per un numero specificato di volte. while: esegue un blocco di codice finché una condizione è vera. do-while: esegue un blocco di codice almeno una volta e poi continua a eseguirlo finché una condizione è vera.",
                3);
        Risposte r4 = new Risposte(
                "In Java, un metodo è un blocco di codice riutilizzabile che esegue un'azione specifica. Esso può ricevere input (parametri), elaborare il codice e restituire un valore. I metodi consentono di strutturare il codice in unità modulari e favoriscono la riusabilità del codice. Una classe, invece, rappresenta un modello o una struttura per creare oggetti. Una classe è un'entità astratta che definisce gli attributi (variabili) e i metodi (funzioni) che un oggetto può avere.",
                4);
        Risposte r5 = new Risposte(
                "Incapsulamento: Si riferisce alla combinazione di dati e metodi in una singola entità (ad esempio una classe) e il controllo dell'accesso a questi componenti. Ereditarietà: Permette di definire una nuova classe basata su una classe esistente, ereditando i suoi attributi e metodi. Polimorfismo: Consente di utilizzare gli oggetti di una classe in modi diversi, a seconda del contesto. . La quarta regola è l'astrazione, che riguarda la creazione di classi e oggetti che rappresentano concetti del mondo reale in modo astratto,",
                5);

        tabella t1 = new tabella();
        t1.addR(r1);
        t1.addR(r2);
        t1.addR(r3);
        t1.addR(r4);
        t1.addR(r5);

        while (active) {
            // Inizializzo scanner

            System.out.println("1) Entra");
            System.out.println("2) Esci");
            Scanner INPUT = new Scanner(System.in);
            int scelta = INPUT.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Sei entrato");
                    break;
                case 2:
                    System.out.println("Sei uscito");
                    active = false;
                    break;
                default:
                    System.out.println("Valore inserito non corretto");
                    break;
            }// fine switch
            while (risp) {
                System.out.println("1) stampa le domande 2) modifica");
                Scanner RISPOSTA = new Scanner(System.in);
                int risposta = RISPOSTA.nextInt();
                switch (risposta) {
                    case 1:
                        System.out.println("Risposte: ");
                        t1.mostraRisposta();
                        System.out.println("-------------------------------------");
                        risp = false;
                        break;
                    case 2:
                        System.out.println("Inserisci il numero della domanda che vuoi modificare");
                        System.out.println("Non sono ancora arrivato a questo punto");
                        risp = false;
                        break;
                    default:
                        System.out.println("Valore inserito non corretto");
                        break;
                }
            }
        } // fine while
    }// fine main
}
