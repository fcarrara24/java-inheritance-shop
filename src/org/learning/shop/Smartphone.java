package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Prodotto{
    private String codiceIMEI;
    private BigDecimal quantitaMemoria;
    public Smartphone(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceIMEI, BigDecimal quantitaMemoria){
        super( codice,  nome,  marca,  prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.quantitaMemoria = quantitaMemoria;
    }

    //getters

    public String getCodiceIMEI() {
        return codiceIMEI;
    }

    public BigDecimal getQuantitaMemoria() {
        return quantitaMemoria;
    }

    //setters


    public void setCodiceIMEI(String codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public void setQuantitaMemoria(BigDecimal quantitaMemoria) {
        this.quantitaMemoria = quantitaMemoria;
    }

    // to string


    @Override
    public String toString(boolean tessera) {
        return "Smartphone{" +
                "codiceIMEI='" + codiceIMEI + '\'' +
                ", quantitaMemoria=" + quantitaMemoria +
                super.toString(tessera);
    }

    @Override
    public BigDecimal getSconto(boolean tessera){
        if (tessera && this.quantitaMemoria.compareTo(new BigDecimal(128)) == -1){
            return this.getPrezzoIva().multiply(new BigDecimal(0.95)).setScale(2, RoundingMode.HALF_UP);
        } else {
            return super.getSconto(tessera);
        }
    }
}
