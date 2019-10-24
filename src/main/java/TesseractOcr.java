import java.io.IOException;
import java.text.ParseException;
import net.sourceforge.tess4j.TesseractException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guven
 */
public class TesseractOcr {
    HomePage homePage;

    public void ReadImage(String imageUrl) throws TesseractException, IOException {
        System.out.println("Gelen URL --> " + imageUrl);
      /*  File imageFile = new File(imageUrl); //"C:\\Users\\guven\\Desktop\\fis.jpg"
        Tesseract instance = new Tesseract(); //
        instance.setDatapath("C:\\Users\\guven\\Desktop\\Tess4J\\tessdata");
        instance.setLanguage("tur");
        String result = instance.doOCR(imageFile);
        System.out.println(result);*/
        homePage = new HomePage();
    }

    public static void main(String[] args) throws TesseractException, ParseException {
    }
}
