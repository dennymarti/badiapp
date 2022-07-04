package ch.bbcag.badiapp.model;

import java.util.ArrayList;
import java.util.List;

public class Badi {

    private int id;
    private String name;
    private String ort;
    private String kanton;

    private List<Becken> beckenListe = new ArrayList<>();

    public Badi(int id, String name, String ort, String kanton) {
        this.id = id;
        this.name = name;
        this.ort = ort;
        this.kanton = kanton;
    }

    public Badi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getKanton() {
        return kanton;
    }

    public void setKanton(String kanton) {
        this.kanton = kanton;
    }

    public void addBecken(Becken becken) {
        beckenListe.add(becken);
    }

    public void removeBecken(Becken becken) {
        beckenListe.remove(becken);
    }

    @Override
    public String toString() {
        return name + " " + ort + " " + "(" + kanton + ")";
    }

    public List<Becken> getBeckenListe() {
        return beckenListe;
    }
}
