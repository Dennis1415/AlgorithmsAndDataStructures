public class wuerfelSimmulator {

    private static void wuerfel(int anzahlJa, int anzahlNein, int wuerfe) {
        int again = 6 - (anzahlJa + anzahlNein);
        System.out.println("\nEin Würfel mit " + again + " nochmal, " + anzahlJa + "x JA und " + anzahlNein + "x nein wird " + wuerfe + " mal gewürfelt !\n\n");

        double gesamtThrows=0;
        double counterJa=0;

        for (int i = 0; i<=wuerfe; i++){

        int amountThrows=0;
        boolean determined = false;

        while(determined != true) {

            int wurf = wuerfel();
          //  System.out.println("Wurf: " + wurf);
            // again -> ja -> nein
            if (wurf <= again) {
                System.out.println("again");
            } else if (wurf <= again + anzahlJa) {
                System.out.println("ja");
                counterJa++;
                determined = true;
            } else {
                System.out.println("Nein");
                determined = true;
            }
            amountThrows++;
        }
        System.out.println("Anzahl Würfe: "+amountThrows);
        System.out.println("");
        gesamtThrows += amountThrows;
    }
        System.out.println("Durschnittliche Throws : "+ (gesamtThrows / wuerfe));
        System.out.println("Durschnittlich Ja: "+ (counterJa/wuerfe));
    }


    private static int wuerfel(){
        return (int) (Math.random() * 6) +1;
    }

    public static void main(String[] args) {
        wuerfel(2, 2, 500);


    }

}

