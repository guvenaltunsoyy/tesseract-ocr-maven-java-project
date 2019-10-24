/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guvenaltunsoy
 */
public class Urun {
    String urun_no;
    String urun_adi;
    String adet;
    String kdv;
    String fiyat;

    public String getUrun_no() {
        return urun_no;
    }

    public void setUrun_no(String urun_no) {
        this.urun_no = urun_no;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public String getAdet() {
        return adet;
    }

    public void setAdet(String adet) {
        this.adet = adet;
    }

    public String getKdv() {
        return kdv;
    }

    public void setKdv(String kdv) {
        this.kdv = kdv;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public Urun(String urun_no, String urun_adi, String adet, String kdv, String fiyat) {
        this.urun_no = urun_no;
        this.urun_adi = urun_adi;
        this.adet = adet;
        this.kdv = kdv;
        this.fiyat = fiyat;
    }
    public Urun(){}
    
}
