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
    private static List<String> setProdottoParams(){
        Scanner prodScan = new Scanner(System.in);
        List<String> outList = new ArrayList<>();

        System.out.print("inserire il codice (numero): ");
        outList.add(prodScan.nextLine());

        System.out.print("inserire il nome: ");
        outList.add(prodScan.nextLine());

        System.out.print("inserire la marca: ");
        outList.add(prodScan.nextLine());

        System.out.print("inserire il prezzo (numero con decimali): ");
        outList.add(prodScan.nextLine());

        System.out.print("inserire l'iva (numero con decimali): ");
        outList.add(prodScan.nextLine());



        return outList;
    }

    private static Cuffie aggiungiCuffie(){
        List<String> parametri = setProdottoParams();

        Scanner scan = new Scanner(System.in);
        System.out.print("inserire il colore: ");
        String colore = scan.nextLine();
        System.out.print("inserire se il dispositivo è wireless o meno (boolean): ");
        boolean wireless = Boolean.parseBoolean(scan.nextLine());
        //closing scanner

        return new Cuffie(Integer.parseInt(parametri.get(0)), parametri.get(1), parametri.get(2), new BigDecimal(parametri.get(3)), new BigDecimal(parametri.get(4)), colore, wireless);
    }


    private static Televisore aggiungiTv(){
        List<String> parametri = setProdottoParams();

        Scanner scan = new Scanner(System.in);
        System.out.print("inserire l'altezza(numero con decimali): ");
        BigDecimal altezza = new BigDecimal(scan.nextLine());
        System.out.print("Inserire la lunghezza(numero con decimali): ");
        BigDecimal lunghezza = new BigDecimal(scan.nextLine());
        System.out.print("inserire se il televisore è smart (boolean): ");
        boolean smart = Boolean.parseBoolean(scan.nextLine());

        //closing scanner

        return new Televisore(Integer.parseInt(parametri.get(0)), parametri.get(1), parametri.get(2), new BigDecimal(parametri.get(3)), new BigDecimal(parametri.get(4)), altezza, lunghezza, smart);
    }

    private static Smartphone aggiungiSmartPhone(){
        List<String> parametri = setProdottoParams();

        Scanner scan = new Scanner(System.in);
        System.out.print("inserire il codice IMEI: ");
        String codiceImei = scan.nextLine();
        System.out.print("Inserire la quantitaMemoria (numero deciamle): ");
        BigDecimal quantitaMemoria = new BigDecimal(scan.nextLine());

        //closing scanner

        return new Smartphone(Integer.parseInt(parametri.get(0)), parametri.get(1), parametri.get(2), new BigDecimal(parametri.get(3)), new BigDecimal(parametri.get(4)), codiceImei, quantitaMemoria);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tessera;
        BigDecimal costoTotale = new BigDecimal(0);
        // uso un array list per un allocazione dinamica della memoria dell'array, senza bisogno di specificare sin da subito al
        // lunghezza dello stesso
        List<Prodotto> prodotti = new ArrayList<Prodotto>();
        int output = 99;


        while (output != 0){
            System.out.println("\n" +
                    "Seleziona il tipo di aggiunta: " + "\n" +
                    "0: termina l'esecizione" + "\n" +
                    "1: aggiungi un Televisore" + "\n" +
                    "2: aggiungi uno smartphone" + "\n" +
                    "3: aggiungi delle cuffie");
            output = Integer.parseInt(sc.nextLine());

            switch (output){
                case 1:
                    prodotti.add(aggiungiTv());
                    break;
                case 2:
                    prodotti.add(aggiungiSmartPhone());
                    break;
                case 3:
                    prodotti.add(aggiungiCuffie());
                    break;
            }
        }

        System.out.print("E' posssessore di tessera fedelta(boolean)? ");
        tessera = Boolean.parseBoolean(sc.nextLine());


        sc.close();
        System.out.println("\n\nEcco un a lista aggiornata con tutti gli acquisti effettuati");

        // stampa tutti gli elementi ricevuti
        for (Prodotto p : prodotti){
            System.out.println(p.toString(tessera));

        }


    }
}
