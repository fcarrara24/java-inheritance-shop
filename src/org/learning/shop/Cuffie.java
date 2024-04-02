package org.learning.shop;

import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

    public Cuffie(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    //setters

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    //getters

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    //to string

    @Override
    public String toString(boolean tessera) {
        return "Cuffie{" +
                "colore='" + colore + '\'' +
                ", wireless=" + wireless +
                super.toString(tessera);
    }

    @Override
    public BigDecimal getSconto(boolean tessera){
        if (tessera && !this.wireless){
            return this.getPrezzoIva().multiply(new BigDecimal(0.93)).setScale(2, RoundingMode.HALF_UP);
        } else {
            return super.getSconto(tessera).setScale(2, RoundingMode.HALF_UP);
        }
    }
}
