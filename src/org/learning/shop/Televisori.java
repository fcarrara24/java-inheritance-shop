package org.learning.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
    private BigDecimal altezza;
    private BigDecimal lunghezza;
    private boolean smart;

    public Televisori(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, BigDecimal altezza, BigDecimal lunghezza, boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        this.smart = smart;
    }

    //getters


    public BigDecimal getAltezza() {
        return altezza;
    }

    public void setAltezza(BigDecimal altezza) {
        this.altezza = altezza;
    }

    public BigDecimal getLunghezza() {
        return lunghezza;
    }


    //setters
    public void setLunghezza(BigDecimal lunghezza) {
        this.lunghezza = lunghezza;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
