package com.rent.buygame;

public class Games {
    String name = "";
    String ureticiFirma="";
    String genre="";
    int year = 0;
    int fiyat = 0;
    int drawable;


    public Games(String name,String ureticiFirma,String genre,int year,int fiyat,int drawable){
        this.name=name;
        this.ureticiFirma=ureticiFirma;
        this.genre=genre;
        this.year=year;
        this.fiyat=fiyat;
        this.drawable=drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public void setUreticiFirma(String ureticiFirma) {
        this.ureticiFirma = ureticiFirma;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
