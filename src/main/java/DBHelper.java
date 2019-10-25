
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.asynchttpclient.Request;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guven
 */
public class DBHelper {

    private static Request request;

    public ArrayList<Fis> tumFisler() throws Exception {
        String url = "http://192.168.1.101:8000/fisler"; // ev ip --> 192.168.1.101
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        JSONObject myResponse = new JSONObject(response.toString());
        JSONObject result = myResponse.getJSONObject("result");
        System.err.println(result.getString("responseCode"));
        ArrayList<Fis> fisler = new ArrayList<Fis>();
        Fis fis;
        String code = result.getString("responseCode");
        if (code.equals("200")) {
            JSONArray rows = result.getJSONArray("rows");
            for (int i = 0; i < rows.length(); i++) {
                fis = new Fis();
                fis.setFis_no(rows.getJSONObject(i).getString("fis_no"));
                fis.setIsletme_adi(rows.getJSONObject(i).getString("isletme_adi"));
                fis.setTarih(rows.getJSONObject(i).getString("tarih"));
                fisler.add(fis);
            }
            for (Fis item : fisler) {
                System.err.println("Fiş No --> " + item.getFis_no());
                System.err.println("Işletme Adi --> " + item.getIsletme_adi());
                System.err.println("Tarih --> " + item.getTarih());
            }
        } else if (code.equals("404")) {
            System.err.println("fis bulunumadi");
            return null;
        }
        return fisler;
    }

    public ArrayList<Fis> fisBul(String isletme_adi) throws IOException {
        Fis fis;
        String url = "http://192.168.1.101:8000/fis?isletme_adi=";
        url += isletme_adi;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        JSONObject myResponse = new JSONObject(response.toString());
        JSONObject result = myResponse.getJSONObject("result");
        System.err.println(result.getString("responseCode"));
        ArrayList<Fis> fisler = new ArrayList<Fis>();
        String code = result.getString("responseCode");
        if (code.equals("200")) {
            JSONArray rows = result.getJSONArray("rows");
            for (int i = 0; i < rows.length(); i++) {
                fis = new Fis();
                fis.setFis_no(rows.getJSONObject(i).getString("fis_no"));
                fis.setIsletme_adi(rows.getJSONObject(i).getString("isletme_adi"));
                fis.setTarih(rows.getJSONObject(i).getString("tarih"));
                fis.setToplam_fiyat(rows.getJSONObject(i).getString("toplam_fiyat"));
                fis.setToplam_kdv(rows.getJSONObject(i).getString("toplam_kdv"));
                fisler.add(fis);
            }
            /*   for (Fis item : fisler) {
                System.err.println("Fiş No --> " + item.getFis_no());
                System.err.println("Işletme Adi --> " + item.getIsletme_adi());
                System.err.println("Tarih --> " + item.getTarih());
            }*/
        } else if (code.equals("404")) {
            System.err.println("fis bulunumadi");
            return null;
        }
        return fisler;
    }

    public void fisOlustur(Fis fis) {
        String url = "http://192.168.1.101:8000/fisOlustur";
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpPost requestt = new HttpPost(url);
            ObjectMapper mapper = new ObjectMapper();
            try {
                String json = mapper.writeValueAsString(fis);
                StringEntity params = new StringEntity(json, "UTF-8");
                requestt.addHeader("content-type", "application/json");
                requestt.setEntity(params);
                HttpResponse result = httpClient.execute(requestt);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void urunOlustur(Urun urun) {
        String url = "http://192.168.1.101:8000/urunOlustur";
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
            HttpPost requestt = new HttpPost(url);
            ObjectMapper mapper = new ObjectMapper();
            try {
                String json = mapper.writeValueAsString(urun);
                StringEntity params = new StringEntity(json, "UTF-8");
                requestt.addHeader("content-type", "application/json");
                requestt.setEntity(params);
                HttpResponse result = httpClient.execute(requestt);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Urun> urunBul(String urun_no) throws IOException {
        Urun urun;
        String url = "http://192.168.1.101:8000/urun?urun_no=";
        url += urun_no;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        JSONObject myResponse = new JSONObject(response.toString());
        JSONObject result = myResponse.getJSONObject("result");
        System.err.println(result.getString("responseCode"));
        ArrayList<Urun> urunler = new ArrayList<Urun>();
        String code = result.getString("responseCode");
        if (code.equals("200")) {
            JSONArray rows = result.getJSONArray("rows");
            for (int i = 0; i < rows.length(); i++) {
                urun = new Urun();
                urun.setUrun_adi(rows.getJSONObject(i).getString("urun_adi"));
                urun.setUrun_no(rows.getJSONObject(i).getString("urun_no"));
                urun.setAdet(rows.getJSONObject(i).getString("adet"));
                urun.setKdv(rows.getJSONObject(i).getString("kdv"));
                urun.setFiyat(rows.getJSONObject(i).getString("fiyat"));
                urunler.add(urun);
            }
            for (Urun item : urunler) {
                System.err.println("urun No --> " + item.getUrun_no());
                System.err.println("urun Adi --> " + item.getUrun_adi());
                System.err.println("adet --> " + item.getAdet());
            }
        } else if (code.equals("404")) {
            System.err.println("urun bulunamadi.");
            return null;
        }
        return urunler;
    }

    public static void main(String[] args) throws Exception {
        DBHelper client = new DBHelper();
        //client.tumFisler();
        //client.fisBul("Denemee");
        //client.fisolustur(new Fis("7123", "guven nALTUNSOY", "23.10.2019", "1000"));
        //client.fisOlustur(new Fis("00", "ggguven İŞLET", "23.10.2019", "10100"));
        //client.urunOlustur(new Urun("1","deneme urun","2","%18","77.7"));
        //client.urunBul("123");

    }
}
