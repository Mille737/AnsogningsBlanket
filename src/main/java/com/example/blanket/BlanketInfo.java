package com.example.blanket;

import javax.validation.constraints.*;

public class BlanketInfo {


    @NotNull
    private String navn;

    @NotNull
    private String cpr;

    @NotNull
    private String adresse;

    @NotNull
    private String statsborgerskab;

    @NotNull
    private String postnr;

    @NotNull
    private String by;

    @NotNull
    private String telefon;

    @NotNull
    @Email
    private String email;


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getStatsborgerskab() {
        return statsborgerskab;
    }

    public void setStatsborgerskab(String statsborgerskab) {
        this.statsborgerskab = statsborgerskab;
    }

    public String getPostnr() {
        return postnr;
    }

    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
