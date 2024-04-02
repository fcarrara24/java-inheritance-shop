package org.learning.shop;

import java.awt.*;
import java.math.BigDecimal;

public class Cuffie extends Televisori{
    private Color colore;
    private boolean wireless;

    public Cuffie(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, BigDecimal altezza, BigDecimal lunghezza, boolean smart, int colore, boolean wireless) {
        super(codice, nome, marca, prezzo, iva, altezza, lunghezza, smart);
        this.colore = new Color(colore);
        this.wireless = wireless;
    }

    //setters

    public Color getColore() {
        return colore;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    //getters

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
