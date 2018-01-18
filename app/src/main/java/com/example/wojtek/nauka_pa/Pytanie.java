package com.example.wojtek.nauka_pa;

/**
 * Created by Wojtek on 06.01.2018.
 */

public class Pytanie {
    private int nr;
    private String Pytanie;
    private String Odp_A;
    private String Odp_B;
    private String Odp_C;
    private String Odp_D;
    private String Poprawna;
    private String Poprawna2;
    private String Poprawna3;
    private int liczba_poprawnych;

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getPytanie() {
        return Pytanie;
    }

    public void setPytanie(String pytanie) {
        Pytanie = pytanie;
    }

    public String getOdp_A() {
        return Odp_A;
    }

    public void setOdp_A(String odp_A) {
        Odp_A = odp_A;
    }

    public String getOdp_B() {
        return Odp_B;
    }

    public void setOdp_B(String odp_B) {
        Odp_B = odp_B;
    }

    public String getOdp_C() {
        return Odp_C;
    }

    public void setOdp_C(String odp_C) {
        Odp_C = odp_C;
    }

    public String getOdp_D() {
        return Odp_D;
    }

    public void setOdp_D(String odp_D) {
        Odp_D = odp_D;
    }

    public String getPoprawna() {
        return Poprawna;
    }

    public void setPoprawna(String poprawna) {
        Poprawna = poprawna;
    }


    public String getPoprawna2() {
        return Poprawna2;
    }

    public void setPoprawna2(String poprawna2) {
        Poprawna2 = poprawna2;
    }

    public String getPoprawna3() {
        return Poprawna3;
    }

    public void setPoprawna3(String poprawna3) {
        Poprawna3 = poprawna3;
    }

    public int getLiczba_poprawnych() {
        return liczba_poprawnych;
    }

    public void setLiczba_poprawnych(int liczba_poprawnych) {
        this.liczba_poprawnych = liczba_poprawnych;
    }

}

