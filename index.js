var express = require('express')
var db = require('./db')
var app = express()
var bodyParser = require('body-parser');
app.use(bodyParser.json({ limit: "10mb" }));
app.use(bodyParser.urlencoded({ limit: "10mb", extended: true, parameterLimit: 10000 }));
var dbHelper = new db.DbHelper("postgres://lgkxkmshddxzvj:ab3d66ebe3160b43edb312f0387660056e121f4840e5bfd8ee9c6b8289ceca29@ec2-54-75-245-196.eu-west-1.compute.amazonaws.com:5432/dc7r3mthu333un");
//postgres://ghnswrbvqsipfn:3303edab84a21b73e9c1d885a78d12d464a7e67b83f89b7474fe2a1a11368992@ec2-54-247-85-251.eu-west-1.compute.amazonaws.com:5432/dfhu902s798jjf

app.get('/fisler', function (req, res) {
  console.log(req.query);
  dbHelper.getFisler().then(result => {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify({ result }, null, 3));
  })
})
app.get('/fis', function (req, res) {
  dbHelper.getFis(req.query.isletme_adi).then(result => {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify({ result }, null, 3));
  })
})
app.post('/fisOlustur', async function(req, res){
  console.log(req.body);
  const result = await dbHelper.fisOlustur(req.body);
  res.setHeader('Content-Type', 'application/json');
  res.end(JSON.stringify({ result }, null, 3));
})
app.post('/urunOlustur', async function(req, res){
  console.log(req.body);
  const result = await dbHelper.urunOlustur(req.body);
  res.setHeader('Content-Type', 'application/json');
  res.end(JSON.stringify({ result }, null, 3));
})
app.get('/urun', function (req, res) {
  console.log(req.query.urun_no);
  dbHelper.getUrun(req.query.urun_no.toString()).then(result => {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify({ result }, null, 3));
  })
})

app.listen(8000)