package com.servlet;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
public class PdfConvert {

	public static void main(String[] args) {

		try {
			String sourceDir = "/home/somnath/A_coreJava/Java.pdf";
			String destinationDir = "/home/somnath/A_coreJava/";
			File sourceFile = new File(sourceDir);
			File destinationFile = new File(destinationDir);
			if (!destinationFile.exists()) {
				destinationFile.mkdir();
				System.out.println("Folder Created -> " + destinationFile.getAbsolutePath());
			}
			if (sourceFile.exists()) {
				PDDocument document = PDDocument.load(sourceDir);
				@SuppressWarnings("unchecked")
				List<PDPage> list = document.getDocumentCatalog().getAllPages();

				String fileName = sourceFile.getName().replace(".pdf", "");
				int pageNumber = 1;
				for (PDPage page : list) {
					BufferedImage image = page.convertToImage();
					File outputfile = new File(destinationDir + fileName + "_" + pageNumber + ".png");
					ImageIO.write(image, "png", outputfile);
					pageNumber++;
				}
				document.close();
				System.out.println("Image saved at -> " + destinationFile.getAbsolutePath());
			} else {
				System.err.println(sourceFile.getName() + " File does not exist");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}