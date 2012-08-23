package br.faccamp.csv;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class CSVWriter {

	public void writeOnCSV(String valor) throws IOException{
        FileWriter fileWriter = new FileWriter("result.csv", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(valor);
        printWriter.print(",");
        printWriter.flush();
        printWriter.close();
        
//		BufferedWriter out = new BufferedWriter(new FileWriter("result.csv"));
//		out.append(valor);
//		out.append(',');
//		out.flush();
//		out.close();
	}
	
}
