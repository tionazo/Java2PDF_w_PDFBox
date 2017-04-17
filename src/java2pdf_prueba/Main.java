package java2pdf_prueba;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDJpeg;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;
//import org.apache.pdfbox.pdmodel.graphics.xobject.PDJpeg;
//import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;

/**
 *
 * @author luisgs
 */
public class Main {

    public static void main(String[] args) {

        try {

            System.out.println("Create Simple PDF file with Text");
            String fileName = "PdfWithtext.pdf"; // name of our file
            String imageName = "assets/Logo.jpg";

            PDDocument doc = new PDDocument();
            PDPage page = new PDPage(PDPage.PAGE_SIZE_A4);
            
            // tamaño del A4 en px
            System.out.println(PDPage.PAGE_SIZE_A4.getWidth());     //595.27563
            System.out.println(PDPage.PAGE_SIZE_A4.getHeight());    //841.8898
            

            doc.addPage(page);

            PDXObjectImage image = new PDJpeg(doc, new FileInputStream(imageName));

            PDPageContentStream content = new PDPageContentStream(doc, page);

            content.drawImage(image, 50, 740);
            
            content.drawLine(50, 730, 545, 730);
            
            content.beginText();
            content.setFont(PDType1Font.ZAPF_DINGBATS, 10);
            content.moveTextPositionByAmount(590, 980);
            content.drawString("x");
            content.endText();
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA_BOLD, 16);
            content.moveTextPositionByAmount(160, 810);
            content.drawString("Hotel Franciso Sánchez".toUpperCase());
            content.endText();
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
            content.moveTextPositionByAmount(160, 795);
            content.drawString("Pza. Mayor S/N");
            content.endText();
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
            content.moveTextPositionByAmount(160, 780);
            content.drawString("37001 - Salamanca");
            content.endText();
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
            content.moveTextPositionByAmount(160, 765);
            content.drawString("Tfno: 923 000 000");
            content.endText();
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
            content.moveTextPositionByAmount(160, 750);
            content.drawString("email: info@hotelfernandosanchez.com");
            content.endText();
            
            
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 26);
            content.moveTextPositionByAmount(360, 700);
            content.drawString("Listado Clientes");
            content.endText();
            
            
            ArrayList<Cliente> clientes = new ArrayList<>();
            clientes.add(new Cliente("Fulanito", "De Tal", "Gran Vía, 2", "1234 5256 45 7896452430", "923 111 111", "fulanitodetal@gmail.com", 35));
            clientes.add(new Cliente("María", "De Cual", "Avda. Portugal, 32", "1234 5256 45 7896452430", "923 111 111", "fulanitadecual@gmail.com", 32));
            clientes.add(new Cliente("Menganito", "García", "C/ Zamora, 52", "1234 5256 45 7896452430", "923 111 111", "menganitog@gmail.com", 45));
            clientes.add(new Cliente("Joselito", "Sánchez", "Pseo.Carmelitas, 13", "1234 5256 45 7896452430", "923 111 111", "pericopalotes@gmail.com", 27));
            
            
            int fila = 630;
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 9);
            content.moveTextPositionByAmount(100, fila);
            content.drawString("NOMBRE");
            content.endText();

            content.beginText();
            content.moveTextPositionByAmount(200, fila);
            content.drawString("TELÉFONO");
            content.endText();
            
            content.beginText();
            content.moveTextPositionByAmount(300, fila);
            content.drawString("EMAIL");
            content.endText();
            
            fila -= 20;
            content.drawLine(75, fila, 75, fila);

            
            for (Cliente cliente : clientes) {
                fila -= 20;
                content.beginText();
                content.setFont(PDType1Font.HELVETICA, 9);
                content.moveTextPositionByAmount(100, fila);
                content.drawString(cliente.getApellidos() + ", " + cliente.getNombre());
                content.endText();

                content.beginText();
                content.setFont(PDType1Font.HELVETICA, 9);
                content.moveTextPositionByAmount(200, fila);
                content.drawString(cliente.getTelefono());
                content.endText();

                content.beginText();
                content.setFont(PDType1Font.HELVETICA, 9);
                content.moveTextPositionByAmount(300, fila);
                content.drawString(cliente.getEmail());
                content.endText();
            }

//            content.beginText();
//            content.setFont(PDType1Font.HELVETICA, 16);
//            content.moveTextPositionByAmount(80, 500);
//            content.drawString("Name : ");
//            content.endText();
//
//            content.beginText();
//            content.setFont(PDType1Font.HELVETICA, 16);
//            content.moveTextPositionByAmount(80, 450);
//            content.drawString("Father Name : ");
//            content.endText();
//
//            content.beginText();
//            content.moveTextPositionByAmount(80, 400);
//            content.drawString("DOB : ");
//            content.endText();

            content.close();
            doc.save(fileName);
            doc.close();

            System.out.println("your file created in : " + System.getProperty("user.dir"));

        } catch (IOException | COSVisitorException e) {

            System.out.println(e.getMessage());

        }

    }
    
    public static void cabecera(){
        
    }

}
