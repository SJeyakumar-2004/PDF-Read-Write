package pfdread;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PdfRead
{

	public static void main(String[] args) throws IOException
	{
	//	File fil=new File("C:\\Resume\\jk.pdf");
		PDDocument document = PDDocument.load(new File("C:\\Resume\\jk.pdf"));
		if(!document.isEncrypted())
		{
		//	PDFTextStripperByArea str=new PDFTextStripperByArea();
		//	str.setSortByPosition(true);
			
			
			PDFTextStripper stripper=new PDFTextStripper();
			
			String text=stripper.getText(document);
			
			
	/*		String line[]=text.split("\\r");
			for(String lines:line)
			{
				System.out.println(lines);
			}     */
			System.out.println(text);
		}
		document.close();

	}

}
