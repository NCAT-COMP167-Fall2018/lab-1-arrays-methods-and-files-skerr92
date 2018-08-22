/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author sethkerr
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] names = new String[80];
        int [] scores = new int[80];
        
        readFile(args[0], names, scores);
       
    }
    /**
     * 
     * @param filename accepts the file name to read names & scores
     * @param names accepts an array to read names into
     * @param scores accepts integer scores to read scores into
     */
    private static void readFile(String filename, String [] names, int [] scores) {
        try {
           Scanner input = new Scanner(new File(filename));
           int currentIndex = 0;
           while(input.hasNext()) {
               String [] line = input.nextLine().split(" ");
               names[currentIndex] = line[0];
               scores[currentIndex] = Integer.parseInt(line[1]);
               
               currentIndex++;
               
           }
           
        }
        catch(FileNotFoundException ex) {
            System.err.println("Could not find file: " + filename + " in readFile");
            
        }
    }
    
    private static void secondMethod(String filename, int [] names, int [] scores) {
        try {
           Scanner input = new Scanner(new File(filename));
        }
        catch(FileNotFoundException ex) {
            System.err.println("Could not find file: " + filename + " in readFile");
            
        }
    }
    
    private static void thirdMethod(String filename, int [] names, int [] scores) {
        try {
           Scanner input = new Scanner(new File(filename));
        }
        catch(FileNotFoundException ex) {
            System.err.println("Could not find file: " + filename + " in readFile");
            
        }
    }
    
    private static void fourthMethod(String filename, int [] names, int [] scores) {
        try {
           Scanner input = new Scanner(new File(filename));
        }
        catch(FileNotFoundException ex) {
            System.err.println("Could not find file: " + filename + " in readFile");
            
        }
    }
    
    private static void fifthMethod(String filename, int [] names, int [] scores) {
        try {
           Scanner input = new Scanner(new File(filename));
        }
        catch(FileNotFoundException ex) {
            System.err.println("Could not find file: " + filename + " in readFile");
            
        }
    }
    
}
