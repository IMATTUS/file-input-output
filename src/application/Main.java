package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		String path="solditems.csv";
		List<Product> prodList = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line !=null) {
				String[] columns = line.split(",");
				prodList.add(new Product(columns[0].toString(),
						Double.parseDouble( columns[1].toString( ) ),Integer.parseInt(columns[2].toString() ) ));
				line = br.readLine();
				
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		File outFolder = new File("out");
		if(outFolder.exists() == false) {
			outFolder.mkdir();
		}
		
		if (outFolder != null) {
			String outPath = "out\\sumarry.csv";
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
				
				for (Product product : prodList) {
					System.out.println(product.toString());
					bw.write(product.toString());
					bw.newLine();
				}
				

			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
