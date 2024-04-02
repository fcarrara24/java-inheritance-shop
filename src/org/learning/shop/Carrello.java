package org.learning.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {


    /**
     * creazione di una lista generics per il costruttore
     * @return
     */
    public List<String> setProdottoParams(){
        Scanner prodScan = new Scanner(System.in);
        List<String> outList = new ArrayList<>();

        System.out.print("inserire il codice: ");
        outList.add(prodScan.nextLine());

        System.out.print("inserire il nome: ");
        outList.add(prodScan.nextLine());

        System.out.print("inserire la marca: ");
        outList.add(prodScan.nextLine());

        System.out.print("inserire il prezzo: ");
        outList.add(prodScan.nextLine());

        System.out.print("inserire l'iva: ");
        outList.add(prodScan.nextLine());


        prodScan.close();
        return outList;
    }

    public Cuffie aggiungiCuffie(){
        Scanner scan = new Scanner(System.in);
        List<String> parametri = this.setProdottoParams();
        System.out.print("inserire il colore in formato numerico ");
        int colore = Integer.parseInt(scan.nextLine());
        System.out.print("inserire se il dispositivo è wireless o meno (boolean): ");
        boolean wireless = Boolean.parseBoolean(scan.nextLine());

        return new Cuffie(Integer.parseInt(parametri.get(0)), parametri.get(1), parametri.get(2), new BigDecimal(parametri.get(3)), new BigDecimal(parametri.get(4)), colore, wireless);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // uso un array list per un allocazione dinamica della memoria dell'array, senza bisogno di specificare sin da subito al
        // lunghezza dello stesso
        List<Prodotto> prodotti = new ArrayList<Prodotto>();
        int output = 99;


        while (output != 0){
            System.out.println("Seleziona il tipo di aggiunta: " + "\n" +
                    "0: termina l'esecizione" + "\n" +
                    "1: aggiungi un Televisore" + "\n" +
                    "2: aggiungi uno smartphone" + "\n" +
                    "3: aggiungi delle cuffie");
            output = Integer.parseInt(sc.nextLine());

            switch (output){
                case 1:

            }
        }

        sc.close();
    }
}
