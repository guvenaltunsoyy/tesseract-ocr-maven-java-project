/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guvenaltunsoy
 */
public class Fis {
    String fis_no;
    String isletme_adi;
    String tarih;
    String toplam_fiyat;

    public String getToplam_fiyat() {
        return toplam_fiyat;
    }

    public void setToplam_fiyat(String toplam_fiyat) {
        this.toplam_fiyat = toplam_fiyat;
    }

    public String getFis_no() {
        return fis_no;
    }

    public void setFis_no(String fis_no) {
        this.fis_no = fis_no;
    }

    public String getIsletme_adi() {
        return isletme_adi;
    }

    public void setIsletme_adi(String isletme_adi) {
        this.isletme_adi = isletme_adi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public Fis(String fis_no, String isletme_adi, String tarih, String toplam_fiyat) {
        this.fis_no = fis_no;
        this.isletme_adi = isletme_adi;
        this.tarih = tarih;
        this.toplam_fiyat = toplam_fiyat;
    }
    public Fis(){}
    
}
