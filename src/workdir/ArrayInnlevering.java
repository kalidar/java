// Kristoffer Stranden

import java.util.Scanner;

public class ArrayInnlevering
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Oppgi arrayens lengde: ");
        int len = in.nextInt();

        int arrayFoo[] = fyll(len);
        print(arrayFoo);
        // System.out.println("\n" + sjekk(3, arrayFoo)); // For testing only.
    }

    public static int[] fyll(int len)
    {
        int[] array = new int[len];

        for (int i = 0; i < len; ++i)
            array[i] = (int) (Math.random() * len + 1);
        return array;
    }

    public static void print(int[] arrayFoo)
    {
        System.out.print("Arrayen inneholder:\n\t");
        for (int i = 0; i < arrayFoo.length; ++i)
            System.out.printf(arrayFoo[i] + "\t");
    }

    public static int sjekk(int val, int[] arrayFoo)
    {
        int count = 0;

        for (int i = 0; i < arrayFoo.length; ++i)
            if (arrayFoo[i] == val)
                ++count;
        return count;
    }

    public int felles(int[] arrayA, int[] arrayB)
    {

        return -1;
    }
}


/*
a) Skriv en metode fyll som har et heltall som parameter og som returnerer en heltallsarray.
Metoden oppretter en array med lengde lik parameterverdien, fyller arrayen med tilfeldige tall i
området 0 – arraylengden, og så returnerer arrayen.

b) Skriv en metode print som har en heltallsarray som parameter og som skriver ut arrayens
innhold i konsollvinduet.

c) Skriv en metode sjekk som teller opp og returnerer hvor mange ganger et heltall forekommer i
en heltallsarray. Arrayen og heltallet er parametere til metoden.

d) Skriv et program som bruker metoden i a) til å opprette en heltallsarray med ønsket lengde.
Bruker oppgir denne lengden. Programmet skal så bruke metoden i b) til å vise innholdet i
arrayen, og deretter be bruker om et heltall og så kalle på metoden i c) som sjekker hvor mange
ganger dette heltallet forekommer i arrayen. Programmet skal ikke gå videre og kalle på metoden
i c) før bruker oppgir et tall i området 0 til arrayens lengde.

Se eksempel under.
Oppgi arrayens lengde: 10
Arrayen inneholder:
 9 5 1 10 8 9 7 9 5 9
Oppgi et tall (0 - 10): -5
Oppgi et tall (0 - 10): 12
Oppgi et tall (0 - 10): 5
Tallet 5 forekommer 2 gang(er).side 2 av 2

e) Skriv en metode felles som har to like lange heltallsarrayer som parametere og som har antall
tall de to arrayene har felles som returverdi. Arrayene er usorterte, og ingen tall forekommer
flere ganger i samme array.

Utvid programmet i d) slik at det bruker metoden felles på riktig måte.
Se eksempel under.
Arrayene inneholder:
 1 3 5 7 9 11 13
 1 2 3 4 5 6 7
Array 1 og array 2 har 4 tall felles.

f) I en array kan vi gjøre en operasjon som kalles 'å rotere' arrayen. Det betyr å flytte innholdet i
hvert element i arrayen én plass mot den ene eller andre enden, og det ytterste elementets verdi
flyttes til den andre enden av arrayen. I eksemplet under ser du en array før og etter en rotasjon
én plass mot 'høyre'.
Skriv en metode roterH som bl.a. har en heltallsarray som parameter Metoden skal rotere
arrayen et visst antall plasser. Forflytningen skal skje mot 'høyre' (mot elementet med høyest
indeks). Det siste tallet i arrayen flyttes til starten av arrayen (til elementet med indeks 0). Antall
plasser som arrayen skal roteres, er også parameter til metoden.

g) Skriv en metode roterV som fungerer som metoden over, men som roterer mot venstre.

h) Utvid programmet i d) slik at metodene i f) og g) blir brukt på riktig måte. Programmet skal vise
innholdet i arrayen før og etter roteringen.
Se eksempel under (arrayen roteres 2 ganger).

 */
