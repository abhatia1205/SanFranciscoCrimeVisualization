import java.util.*;
import java.io.*;
import java.lang.*;
        public class RemoveSpaces {
            public static void main(String args[]) throws IOException {

                //bufferedreader for input
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mainm\\documents\\github\\2020hackathon\\mlresults.json"));
                //printer for output
                PrintWriter pr = new PrintWriter(new FileWriter("C:\\Users\\mainm\\documents\\github\\2020hackathon\\mlresultsnospaces.json"));

                //number of lines in the input file
                int linecount = 117962;

                //super basic for-loop process, just takes each line as as string, removes the spaces, and outputs the new string
                for (int i = 0; i < linecount; i++) {
                    String line = br.readLine();String nospaceline = line.replaceAll("\\s", "");

                    pr.println(nospaceline);
                }

        pr.close();

    }
}
