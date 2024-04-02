package org.learning.shop;

import java.math.BigDecimal;

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

}
