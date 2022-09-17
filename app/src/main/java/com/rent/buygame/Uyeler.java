package com.rent.buygame;
 class Uyeler {
  String kullaniciAdi = "";
  String sifre = "";

  public String getKullaniciAdi() {
   return kullaniciAdi;
  }

  public void setKullaniciAdi(String kullaniciAdi) {
   this.kullaniciAdi = kullaniciAdi;
  }

  public String getSifre() {
   return sifre;
  }

  public void setSifre(String sifre) {
   this.sifre = sifre;
  }

  public Uyeler(String kullaniciAdi, String sifre) {
   this.kullaniciAdi = kullaniciAdi;
   this.sifre = sifre;
  }
 }
