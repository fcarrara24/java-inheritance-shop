package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    private int codice;

    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;



    public Prodotto(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo.setScale(2, RoundingMode.HALF_UP);
        this.iva = iva;
    }

    //getters
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public BigDecimal getPrezzoIva(){
        //coefficiente = prezzo ((iva/100) +1)
        BigDecimal coefficiente = this.iva.divide(new BigDecimal(100)).add(new BigDecimal(1));
        return this.prezzo.multiply(coefficiente).setScale(2, RoundingMode.HALF_UP);
    }

    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }





    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzo=" + prezzo + '\'' +
                ", iva=" + iva + '\'' +
                ", prezzoIva="+ getPrezzoIva() + '\'' +
                '}';
    }

}
