package com.example.myarrayadapterlistview;

public class MyItem {
    private String name;
    private String beschreibung;
    private int icon;
    private boolean isKunde;

    public MyItem(String name, String beschreibung, int icon, boolean isKunde) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.icon = icon;
        this.isKunde = isKunde;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getIcon() {
        return icon;
    }

    public boolean isKunde() {
        return isKunde;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setKunde(boolean kunde) {
        isKunde = kunde;
    }
}
