package pdf_filewriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Writer {

	public static void main(String[] args) throws DocumentException, FileNotFoundException 
	{
		
     
    	  Document doc=new Document();
    	  PdfWriter writer=PdfWriter.getInstance(doc,new FileOutputStream("C:\\Resume\\sample.pdf"));
    	  
    	  doc.open();
    	  doc.add(new Paragraph("hahahahahaahha"));
    	  
    	  doc.newPage();
    	  doc.add(new Paragraph("hahahahahaahha"));
    	  
    	  doc.close();
    	  writer.close();
    	  System.out.println("PDf created");
      }
     
	}

	


