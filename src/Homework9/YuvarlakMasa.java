package Homework9;

import java.time.Year;

public class YuvarlakMasa extends Mobilya implements Daire {

    private double yaricap;

    public YuvarlakMasa() {
    }

    public YuvarlakMasa(String aciklama, double yukseklik, boolean kapalimi, double yaricap) {
        super(aciklama, yukseklik, kapalimi);
        this.yaricap = yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if (!isKapalimi()){
            return Math.PI*yaricap*yaricap;
        }else{
            return 2* Math.PI*yaricap*yaricap + 2 * Math.PI *yaricap * getYukseklik();
        }
    }

    @Override
    public double hacimHesapla() {
        return Math.PI* yaricap*yaricap*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+"[" + yaricap + "x" +getYukseklik() +"]";
    }
}
