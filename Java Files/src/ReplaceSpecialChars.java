import java.util.*;
import java.io.*;
import java.lang.*;
public class ReplaceSpecialChars {
    public static void main(String args[]) throws IOException {

        //bufferedreader for input
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mainm\\Documents\\GitHub\\2020hackathon\\Java Files\\src\\code.txt"));
        //printer for output
        PrintWriter pr = new PrintWriter(new FileWriter("C:\\Users\\mainm\\Documents\\GitHub\\2020hackathon\\Java Files\\src\\formattedcode.txt"));

        //super basic for-loop process, just takes each line as as string, removes the spaces, and outputs the new string
        String line = br.readLine();
        String a = "\"";
        String newline = line.replaceAll(a, "\\"+"\"");
        pr.println(newline);
        pr.close();

    }
}
