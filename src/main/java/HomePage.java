
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guven
 */
public class HomePage extends javax.swing.JFrame {

    public DBHelper dbhelper;

    /**
     * Creates new form HomePage
     */
    public HomePage() throws IOException {
        initComponents();
        dbhelper = new DBHelper();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnChooseImage = new javax.swing.JButton();
        lblTarih = new javax.swing.JLabel();
        lblFisno = new javax.swing.JLabel();
        lblToplamfiyat = new javax.swing.JLabel();
        lblUrunler = new javax.swing.JLabel();
        lblSirketIsmi = new javax.swing.JLabel();
        lblTarih1 = new javax.swing.JLabel();
        lblKdv1 = new javax.swing.JLabel();
        lblFisno1 = new javax.swing.JLabel();
        lblToplamfiyat1 = new javax.swing.JLabel();
        lblSirketIsmi1 = new javax.swing.JLabel();
        lblUrunler1 = new javax.swing.JLabel();
        lblKdv = new javax.swing.JLabel();
        txtIsletmeAdi = new javax.swing.JTextField();
        txtTarih = new javax.swing.JTextField();
        btnArama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));

        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 300));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jButton1.setPreferredSize(new java.awt.Dimension(300, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(398, 398, 398))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 1000));

        btnChooseImage.setText("Choose Image..");
        btnChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImageActionPerformed(evt);
            }
        });

        lblTarih.setText("Tarih : ");

        lblFisno.setText("Fiş No :");

        lblToplamfiyat.setText("Toplam Fiyat :");

        lblUrunler.setText("Ürünler :");

        lblSirketIsmi.setText("Şirket İsmi :");

        lblTarih1.setText("Tarih ");

        lblKdv1.setText("KDV ");

        lblFisno1.setText("Fiş No ");

        lblToplamfiyat1.setText("Toplam Fiyat ");

        lblSirketIsmi1.setText("Şirket İsmi ");

        lblUrunler1.setText("Ürünler");

        lblKdv.setText("KDV :");

        txtIsletmeAdi.setToolTipText("İşletme Adı");
        txtIsletmeAdi.setPreferredSize(new java.awt.Dimension(100, 30));

        txtTarih.setToolTipText("Tarih");
        txtTarih.setPreferredSize(new java.awt.Dimension(100, 30));

        btnArama.setText("Arama");
        btnArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChooseImage)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblSirketIsmi)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSirketIsmi1)
                                    .addComponent(lblTarih1)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTarih)
                                    .addComponent(lblFisno)
                                    .addComponent(lblKdv))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFisno1)
                                    .addComponent(lblKdv1))))
                        .addGap(244, 244, 244)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnArama))
                            .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIsletmeAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 268, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblToplamfiyat)
                    .addComponent(lblUrunler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUrunler1)
                    .addComponent(lblToplamfiyat1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnChooseImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSirketIsmi)
                    .addComponent(lblSirketIsmi1)
                    .addComponent(txtIsletmeAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarih)
                    .addComponent(lblTarih1)
                    .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFisno)
                    .addComponent(lblFisno1)
                    .addComponent(btnArama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKdv)
                    .addComponent(lblKdv1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToplamfiyat)
                    .addComponent(lblToplamfiyat1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrunler)
                    .addComponent(lblUrunler1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImageActionPerformed
        //ChooseImage();
        /*JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Choose a directory to save your file: ");
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int returnValue = jfc.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println(jfc.getSelectedFile().toString());
            try {
                BufferedImage wPic = ImageIO.read(jfc.getSelectedFile());
                ImageIcon icon = new ImageIcon(wPic);
                jLabel2.setIcon(icon);
                jLabel2.setBounds(jLabel2.getX(), jLabel2.getY(), 200, 300);
                System.out.println("add wIcon");
                File imageFile = new File(jfc.getSelectedFile().toString()); //"C:\\Users\\guven\\Desktop\\fis.jpg"
                Tesseract instance = new Tesseract(); //
                instance.setDatapath("C:\\Users\\guven\\Desktop\\Tess4J\\tessdata");
                instance.setLanguage("tur");
                String result = instance.doOCR(imageFile);
                //System.out.println(result);
                String[] bolunmus=result.split("\n");
                for (String satir : bolunmus) {
                    System.out.println(satir);
                }
            }catch (TesseractException e) {
                System.err.println(e.getMessage());
            }catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }*/
        int j, i = 0;
        int fisbuldu = 1;
        int fisaradi = 0;
        int kdvno = 0;
        int ui = 0;
        int fi = 0;
        int KG = 0;
        int k;
        int fiyatara = 0;
        int urunara = 2;
        String fis_no = "1111";
        String isletme_ismi = "";
        String tarih = "";
        String[] Urunler = new String[20];
        String[] Kdv = new String[20];
        String[] Fiyat = new String[20];
        String[] Kgtoplam = new String[3];
        Fis fis = new Fis();
        Urun urun;
        ArrayList<Urun> urunler = new ArrayList();
        //
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Choose a directory to save your file: ");
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int returnValue = jfc.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println(jfc.getSelectedFile());
            try {
                BufferedImage wPic = ImageIO.read(jfc.getSelectedFile());
                //jLabel2.setIcon(new ImageIcon(wPic));
                jButton1.setIcon(new ImageIcon(wPic));
                jButton1.setSize(100, 100);
                jLabel2.setSize(50, 50);
                jPanel2.setSize(50, 50);
                File imageFile = new File(jfc.getSelectedFile().toString()); //"C:\\Users\\guven\\Desktop\\fis.jpg"
                Tesseract instance = new Tesseract(); //
                instance.setDatapath("C:\\Users\\guven\\Desktop\\Tess4J\\tessdata");
                instance.setLanguage("tur");
                String result = instance.doOCR(imageFile);
                //System.out.println(result);

                String[] bolunmus = result.split("\n");
                for (String tempParsedStr : bolunmus) {
                    if (i == 0) {
                        isletme_ismi = tempParsedStr;
                    }
                    i++;
                }
                String[] mm = new String[i];
                i = 0;
                for (String tempParsedStr : bolunmus) {
                    mm[i] = tempParsedStr;
                    i++;
                }
                System.out.println("\n\n");
                System.out.println("\n\n");
                for (j = 0; j < i; j++) {
                    String[] boldu = mm[j].split(" ");
                    for (String tempParsedStr : boldu) {
                        //System.out.println(tempParsedStr);

                        // TARİH BULMA
                        if (tempParsedStr.matches("^(0?[1-9]|[12][0-9]|3[01])[\\.\\-](0?[1-9]|1[012])[\\.\\-]\\d{4}$")) {
                            tarih = tempParsedStr;
                        } else if (tempParsedStr.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")) {
                            tarih = tempParsedStr;
                        }
                        //FİŞ NO BULMA
                        if (fisbuldu == 0) {
                            fisbuldu++;
                        }
                        if (fisaradi == 0) {
                            if (tempParsedStr.matches("FişNo:")) {
                                fisbuldu = 0;
                                fisaradi = 1;
                            } else if (tempParsedStr.matches("Fiş No:")) {
                                fisbuldu = 0;
                                fisaradi = 1;
                            } else if (tempParsedStr.matches("FişNo")) {
                                fisbuldu = 0;
                                fisaradi = 1;
                            } else if (tempParsedStr.matches("FîşNo:")) {
                                fisbuldu = 0;
                                fisaradi = 1;
                            } else if (tempParsedStr.matches("NO:")) {
                                fisbuldu = 0;
                                fisaradi = 1;
                            }
                        }
                        if (fisbuldu == 1) {
                            fis_no = tempParsedStr;
                            fisbuldu++;
                        }
                        if (urunara == 0) {
                            urunara = 1;
                        }
                        if (tempParsedStr.matches("^[0-9]{2}:[0-9]{2}:[0-9]{2}$")) {
                            urunara = 0;
                        }
                        if (urunara == 1) {
                            if (tempParsedStr.matches("[A-Z]*")) {
                                if (Urunler[ui] == null) {
                                    if (tempParsedStr.matches("ADET") != true) {
                                        if (tempParsedStr.matches("X") != true) {
                                            if (tempParsedStr.matches("TL") != true) {
                                                Urunler[ui] = tempParsedStr;
                                            }
                                        }
                                    }
                                } else {
                                    if (tempParsedStr.matches("X") != true) {
                                        if (tempParsedStr.matches("TL") != true) {
                                            Urunler[ui] += " ";
                                            Urunler[ui] += tempParsedStr;
                                        }
                                    }
                                }
                            }
                        }
                        //KDV BULMA
                        if (tempParsedStr.matches("%.")) {
                            Kdv[kdvno] = tempParsedStr;
                            kdvno++;
                        }
                        if (tempParsedStr.matches("%..")) {
                            Kdv[kdvno] = tempParsedStr;
                            kdvno++;
                        }

                        if (fiyatara == 0) {
                            if (tempParsedStr.matches("^(\\*)\\d{1,3}[,._]\\d{1,3}")) {
                                Fiyat[fi] = tempParsedStr;
                                fi++;
                                ui++;
                            }
                        }
                        if (urunara == 2) {
                            if (tempParsedStr.matches("^(\\*)\\d{1,3}[,._]\\d{1,3}")) {
                                Kgtoplam[KG] = tempParsedStr;
                                KG++;
                            }
                        }

                        if (tempParsedStr.matches("TOPKDV") || tempParsedStr.matches("TUPKDV") || tempParsedStr.matches("TOPKDY")) {
                            fiyatara = 1;
                            urunara = 2;
                        }

                    }
                }
                // BULUNANLAR
                System.out.println("\n\n");
                System.out.println(isletme_ismi);
                System.out.println(tarih);
                System.out.println(fis_no);
                String gecici = "";
                fis.setIsletme_adi(isletme_ismi);
                fis.setTarih(tarih);
                fis.setFis_no(fis_no);
                for (i = 0; i < kdvno; i++) {
                    System.out.println(Kdv[i]);
                }
                for (i = 0; i < ui; i++) {
                    gecici = Fiyat[i].substring(1, Fiyat[i].length());
                    //System.out.println(gecici);
                    Fiyat[i] = gecici;
                    Fiyat[i] = Fiyat[i].replace('_', ',');
                    Fiyat[i] = Fiyat[i].replace('.', ',');
                    System.out.println(Urunler[i] + " " + Kdv[i] + " " + Fiyat[i]);
                    urun = new Urun();
                    urun.setUrun_no(fis_no);
                    urun.setUrun_adi(Urunler[i]);
                    urun.setKdv(Kdv[i]);
                    urun.setFiyat(Fiyat[i]);
                    dbhelper.urunOlustur(urun);
                    urunler.add(urun);
                    //System.out.println(Urunler[i] +" "+ Fiyat[i]);
                }
                for (i = 0; i < KG; i++) {
                    gecici = Kgtoplam[i].substring(1, Kgtoplam[i].length());
                    Kgtoplam[i] = gecici;
                }
                System.out.println("KDV TOPLAM:" + Kgtoplam[0]);
                System.out.println("GENEL TOPLAM:" + Kgtoplam[1]);
                fis.setToplam_fiyat(Kgtoplam[1]);
                fis.setToplam_kdv(Kgtoplam[0]);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        lblSirketIsmi1.setText(isletme_ismi);
        lblTarih1.setText(tarih);
        lblToplamfiyat1.setText(Kgtoplam[1]);
        lblKdv1.setText(Kgtoplam[0]);
        lblUrunler1.setText("<html>");
        System.err.println("Fiş : " + fis.getIsletme_adi());
        for (Urun item : urunler) {
            System.out.println(item.getUrun_adi());
            lblUrunler1.setText(lblUrunler1.getText() + item.getUrun_adi() + "<br/>");
        }
        lblUrunler1.setText(lblUrunler1.getText() + "<br/>");
        dbhelper.fisOlustur(fis);
        try {
            ArrayList<Fis> tumFisler = dbhelper.tumFisler();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Fiş No");
            model.addColumn("İşletme Adı");
            model.addColumn("Tarih");
            model.addColumn("Toplam Kdv");
            model.addColumn("Toplam Fiyat");
            JTable newTable = new JTable(model);
            model = (DefaultTableModel) newTable.getModel();
            model.addRow(new Object[]{fis.getFis_no(), fis.getIsletme_adi(), fis.getTarih(), fis.getToplam_kdv(), fis.getToplam_fiyat()});
            JFrame f = new JFrame();
            f.setSize(1000, 500);
            f.add(new JScrollPane(newTable));
            f.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnChooseImageActionPerformed

    private void btnAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAramaActionPerformed
        String txtIsletmeAdi = this.txtIsletmeAdi.getText();
        String txtTarih = this.txtTarih.getText();
        ArrayList<Urun> urunler = new ArrayList<>();
        ArrayList<Fis> fisler = new ArrayList<>();
        String fis_no = "";
        if (txtIsletmeAdi != null) {
            try {
                fisler = dbhelper.fisBul(txtIsletmeAdi);
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Fiş No");
                model.addColumn("İşletme Adı");
                model.addColumn("Tarih");
                model.addColumn("Toplam Kdv");
                model.addColumn("Toplam Fiyat");
                JTable newTable = new JTable(model);
                model = (DefaultTableModel) newTable.getModel();
                for (Fis fis : fisler) {
                    fis_no = fis.getFis_no();
                    model.addRow(new Object[]{fis.getFis_no(), fis.getIsletme_adi(), fis.getTarih(), fis.getToplam_kdv(), fis.getToplam_fiyat()});
                }
                JFrame ff = new JFrame();
                ff.setSize(1000, 500);
                ff.add(new JScrollPane(newTable));
                ff.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                urunler = dbhelper.urunBul(fis_no);
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Urun No");
                model.addColumn("Urun Adı");
                model.addColumn("Adet");
                model.addColumn("Kdv");
                model.addColumn("Fiyat");
                JTable newTable = new JTable(model);
                model = (DefaultTableModel) newTable.getModel();
                for (Urun fis : urunler) {
                    model.addRow(new Object[]{fis.getUrun_no(), fis.getUrun_adi(), fis.getAdet(), fis.getKdv(), fis.getFiyat()});
                }
                JFrame f = new JFrame();
                f.setSize(1000, 500);
                f.add(new JScrollPane(newTable));
                f.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnAramaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomePage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArama;
    private javax.swing.JButton btnChooseImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFisno;
    private javax.swing.JLabel lblFisno1;
    private javax.swing.JLabel lblKdv;
    private javax.swing.JLabel lblKdv1;
    private javax.swing.JLabel lblSirketIsmi;
    private javax.swing.JLabel lblSirketIsmi1;
    private javax.swing.JLabel lblTarih;
    private javax.swing.JLabel lblTarih1;
    private javax.swing.JLabel lblToplamfiyat;
    private javax.swing.JLabel lblToplamfiyat1;
    private javax.swing.JLabel lblUrunler;
    private javax.swing.JLabel lblUrunler1;
    private javax.swing.JTextField txtIsletmeAdi;
    private javax.swing.JTextField txtTarih;
    // End of variables declaration//GEN-END:variables
}
