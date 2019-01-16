/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting;

import java.util.*;
import java.io.*;

/**
 *
 * @author User
 */
public class Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String fileName = "counting.txt";
        String line = null, value;
        int lineNumber = 1;
        String[] values;
        values = new String[50];
        List<String> greater = new ArrayList<>();
        List<String> endsWith = new ArrayList<>();
        List<String> UpperCase = new ArrayList<>();
        
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("Size and Line:");
            System.out.println("-------------------------");
            while ((line = bufferedReader.readLine()) != null) {
                int length = line.length();
                values[lineNumber] = line;
                System.out.print("Line "+lineNumber);
                System.out.print(" = "+line);
                System.out.print(" is "+length);
                System.out.println(" characters");
                ++lineNumber;
                if (length > 8) {
                    greater.add(line);
                }
                if (line.endsWith("e")) {
                    endsWith.add(line);
                }
                UpperCase.add(line);
            }
            System.out.println("");
            System.out.println("More than 8 letters:");
            System.out.println("-------------------------");
            System.out.println(greater);
            System.out.println("");
            System.out.println("Ends with E");
            System.out.println("-------------------------");
            System.out.println(endsWith);
            System.out.println("");
            System.out.println("Upper Case");
            System.out.println("-------------------------");
            UpperCase.replaceAll(String::toUpperCase);
            System.out.println(UpperCase);
            bufferedReader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
