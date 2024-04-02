package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisore extends Prodotto{
    private BigDecimal altezza;
    private BigDecimal lunghezza;
    private boolean smart;

    public Televisore(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, BigDecimal altezza, BigDecimal lunghezza, boolean smart) {
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
    //toString

    @Override
    public String toString(boolean tessera) {
        return "Televisore{" +
                "altezza=" + altezza +
                ", lunghezza=" + lunghezza +
                ", smart=" + smart +
                super.toString(tessera);
    }

    @Override
    public BigDecimal getSconto(boolean tessera){
        if (tessera && !this.isSmart()){
            return this.getPrezzoIva().multiply(new BigDecimal(0.90)).setScale(2, RoundingMode.HALF_UP);
        } else {
            return super.getSconto(tessera);
        }
    }
}
