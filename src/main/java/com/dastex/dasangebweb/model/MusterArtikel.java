/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dastex.dasangebweb.model;

/**
 *
 * @author aladhari
 */
public class MusterArtikel {
      
    private String musterFarbe,musterGrosse,musterMenge,musterNummer,musterPris,musterBeschreibung,wz="";
    private boolean zuruck;

    public MusterArtikel(String musterFarbe, String musterGrosse, String musterMenge, String musterNummer, String musterPris,String beschreibung, boolean zuruck,String wz) {
        this.musterFarbe = musterFarbe;
        this.musterGrosse = musterGrosse;
        this.musterMenge = musterMenge;
        this.musterNummer = musterNummer;
        this.musterPris = musterPris;
        this.musterBeschreibung = beschreibung;
        this.zuruck = zuruck;
        this.wz=wz;
        
    }

    public MusterArtikel() {
    }

    public String getMusterFarbe() {
        return musterFarbe;
    }

    public String getMusterBeschreibung() {
        return musterBeschreibung;
    }

    public void setMusterBeschreibung(String musterBeschreibung) {
        this.musterBeschreibung = musterBeschreibung;
    }

    public void setMusterFarbe(String musterFarbe) {
        this.musterFarbe = musterFarbe;
    }

    public String getMusterGrosse() {
        return musterGrosse;
    }

    public void setMusterGrosse(String musterGrosse) {
        this.musterGrosse = musterGrosse;
    }

    public String getMusterMenge() {
        return musterMenge;
    }

    public void setMusterMenge(String musterMenge) {
        this.musterMenge = musterMenge;
    }

    public String getMusterNummer() {
        return musterNummer;
    }

    public void setMusterNummer(String musterNummer) {
        this.musterNummer = musterNummer;
    }

    public String getMusterPris() {
        return musterPris;
    }

    public void setMusterPris(String musterPris) {
        this.musterPris = musterPris;
    }

    public boolean isZuruck() {
        return zuruck;
    }

    public void setZuruck(boolean zuruck) {
        this.zuruck = zuruck;
    }

    public String getWz() {
        return wz;
    }

    public void setWz(String wz) {
        this.wz = wz;
    }
}
