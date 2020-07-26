import java.util.*;
import java.io.*;
public class SummonHTMLs {
    public static void main(String args[]) throws IOException {

        //arrays for all the files I want to print
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] types = {"LARCENYANDTHEFT","VEHICLETHEFT","VANDALISM","ROBBERY","ASSAULT","WEAPONLAWS","BURGLARY",
                "SUSPICIOUSOCC","DRUGANDNARCOTIC","STOLENPROPERTY","MISSINGPERSON","KIDNAPPING","SEXOFFENSESFORCIBLE",
                "PROSTITUTION","ARSON"};

        for (int i = 0; i < months.length; i++) {

            for (int j = 0; j < types.length; j++) {

                //reading file with BufferedReader
                //this line (BufferedReadder) makes the code very inefficient; every new print is forced to read the orig file again
                //the added time is insignificant to the point where I'd rather just do this than come up with another solution
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mainm\\Documents\\GitHub\\2020hackathon\\HackCupertino\\public\\maps\\template.html"));

                //generating file title
                String title = months[i]+types[j]+".html";

                //personal checker
                System.out.println(title);

                //printing file with PrintWriter
                PrintWriter pr = new PrintWriter(new FileWriter("C:\\Users\\mainm\\Documents\\GitHub\\2020hackathon\\HackCupertino\\public\\maps\\"+title));

                for (int k = 0; k < 192; k++) {
                    String a = br.readLine();
                    if (k == 142) {
                        pr.println("                $.each(month["+i+"]."+types[j]+", function(key, val) {");
                    } else if (k == 171) {
                        pr.println("    document.getElementById(\"monthdisplay\").innerHTML = \"Selected Month: \" + \""+months[i]+"\" + \" | \";");
                    } else if (k == 172) {
                        pr.println("    document.getElementById(\"typedisplay\").innerHTML = \"Selected Type: \" + \""+types[j]+"\";");
                    } else {
                        pr.println(a);
                    }
                }

                pr.close();

            }

        }

    }
}
