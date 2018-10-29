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
        String line = null;
        int lineNumber = 1;
        
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while ((line = bufferedReader.readLine()) != null) {
                int length = line.length();
                System.out.print("Line "+lineNumber);
                System.out.print(" = "+line);
                System.out.print(" is "+length);
                System.out.println(" characters");
                ++lineNumber;
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
