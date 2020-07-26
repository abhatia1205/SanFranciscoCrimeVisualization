import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Pattern;

public class ParseData {

    public static void main(String args[]) throws IOException {

        //file input for parsing
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mainm\\Documents\\GitHub\\2020hackathon\\train.csv"));
        //setting file location and creating printer
        PrintWriter pr1 = new PrintWriter(new FileWriter("C:\\Users\\mainm\\Documents\\GitHub\\2020hackathon\\data.csv"));

        int x = 878050;

        //while loop for iteration, stops when file has nothing left
        for (int i = 0; i < x; i++) {

            //splits line into String array by column
            String[] columns = br.readLine().split(",");

            //coordinate statement composed of last two line values
            String longi = columns[columns.length-2];
            String lat = columns[columns.length-1];
            String[] details = new String[7];

            //for some god forsaken reason, the csv contains values formatted as such: "blank, blank" which the .split(",") line still splits into separate values
            //because of this, I have to use the below while loop to create the details array; every time I have a value start with a space, I append it to the previous one
            //those values are never actually used (because they depict the aftermath of the event or specific circumstances that I don't care about), so I neglected to reattach the commas
            //although, for the sake of this project, this step is technically unnecessary (because of the ordering of data), I plan on using this data in other ways, so I made this anyway.
            int j = 0;
            int k = 0;

            while (j < 7) {
                if (columns[k].charAt(0) == ' ') {
                    details[j-1] = details[j-1]+columns[k].replaceAll(Pattern.quote("."), "*").replaceAll("\"", "");
                } else {
                    details[j] = columns[k].replaceAll(Pattern.quote("."), "*").replaceAll("\"", "").replaceAll("/", "AND");
                    j++;
                }
                k++;
            }

            String month = details[0].substring(5,7);
            String type = details[1];
            pr1.println(month+","+type+","+lat+","+longi);

        }
        pr1.close();

    }

}