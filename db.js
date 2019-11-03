var pg = require("pg");
pg.defaults.ssl = true;

var DbHelper = function (connectionURL) {
    var client = new pg.Client(connectionURL);
    client.connect();
  
    this.getFisler = async function () {
      var result = await client.query("SELECT * FROM fisler")
      if (result.rows.length > 0) {
        result["responseCode"] = "200";
        console.log("Fis bulundu.");
        return result;
      }
      return {
          "responseCode" : "404"
      }
    }
    this.getFis = async function (isletme_adi) {
      var result = await client.query("SELECT * FROM fisler WHERE isletme_adi LIKE '%"+ isletme_adi +"%'")
      if (result.rows.length > 0) {
        result["responseCode"] = "200";
        console.log("Fis bulundu.");
        return result;
      }
      return {
          "responseCode" : "404"
      }
    }
    this.fisOlustur = async function (body) {
      console.log(body); 
      await client.query("INSERT INTO fisler (fis_no, isletme_adi, tarih, toplam_fiyat, toplam_kdv) VALUES  ($1,$2,$3,$4,$5)", [body.fis_no,body.isletme_adi,body.tarih, body.toplam_fiyat, body.toplam_kdv], function (err, result) {
        if (err) {
          console.log(err);
          return false;
        } else {
          console.log("Fis olusturuldu.");
          return true;
        }
      })
    }
    this.urunOlustur = async function (body) {
      console.log(body); 
      await client.query("INSERT INTO urunler (urun_no, urun_adi, adet, kdv, fiyat) VALUES  ($1,$2,$3,$4,$5)", [body.urun_no,body.urun_adi,body.adet, body.kdv,body.fiyat], function (err, result) {
        if (err) {
          console.log(err);
          return false;
        } else {
          console.log("Urun olusturuldu.");
          return result;
        }
      })
    }
    this.getUrun = async function (urun_no) {
      console.log(urun_no);
      var result = await client.query("SELECT * FROM urunler WHERE urun_no='"+ urun_no +"'")
      if (result.rows.length > 0) {
        result["responseCode"] = "200";
        console.log("urun bulundu.");
        return result;
      }
      return {
          "responseCode" : "404"
      }
    }
    /*this.getUser = async function(req){
      var run = new Runner();
      var results = await client.query('select * from db_runners where username = $1',[req.username])
      if (results.rows.length > 0) {
        console.log("User return");
        run = results.rows[0];
        run.image = run.image.toString();
        run.errorCode = 200;
        return run;
      }else{
        run.errorCode = 400;
        console.log('User not found');
        return run;
      }
    }
}*/
}
  module.exports = { DbHelper };