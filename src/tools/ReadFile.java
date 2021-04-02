package tools;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    static double[] mass = { 1.01, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4.00,
        6.94, 9.01,0,0,0,0,0,0,0,0,0,0, 10.81, 12.01, 14.01, 16.00, 19.00, 20.18,
        22.99,24.31,0,0,0,0,0,0,0,0,0,0,26.98, 28.09 ,30.97, 32.07 ,35.45 ,39.95,
        39.10,40.08, 44.96, 47.88, 50.94, 52.00, 54.94, 55.85, 58.93, 58.69, 63.55, 65.39, 69.72, 72.59, 74.92, 78.96, 79.90, 83.80,
        85.47, 87.62, 88.91, 91.22, 92.91, 95.94, 98.00, 101.07, 102.91, 106.42, 107.87, 112.41, 114.82, 118.71, 121.75, 127.60, 126.91, 131.29,
        132.91, 137.33,0, 178.49, 180.95, 183.85, 186.21, 190.23, 192.22, 195.08, 196.97, 200.59, 204.38, 207.20, 208.98, 209.00, 210.00, 222.00,
        223.00, 226.00,0, 267.00, 268.00, 271.00, 272.00, 277.00, 276.00, 281.00, 280.00, 277.00, 284.00, 289.00, 288.00, 293.00, 294.00, 294.00,
        0,0, 138.91, 140.12, 140.91, 144.24, 145.00, 150.36, 151.96, 157.25, 158.93, 162.50, 164.93, 167.26, 168.93, 173.04, 174.97, 0,
        0,0, 227.00, 232.04, 231.04, 238.03, 237.00, 244.00, 243.00, 247.00, 247.00, 251.00, 252.00, 257.00, 258.00, 259.00, 262, 0
    };
  public static void main(String[] args) {
    try {
      String test = "2\u2076";
      //System.out.println(test);
      //System.out.println("2" + '\u2076');
      //https://en.wikipedia.org/wiki/Unicode_subscripts_and_superscripts
      File myObj = new File("src/filename.txt");
      Scanner myReader = new Scanner(myObj);
      int count = 0;
      int index = 0;
      
        while (myReader.hasNextLine()) {
            if (mass[index] != 0.0) {

                String data = myReader.nextLine();
                if (count >=4){
                    System.out.println("\""+data+"\",");
                    count = 0;
                }
                    
                else
                    System.out.print("\""+data+"\",");
                count++;
            
            }
            else {
                System.out.print("\"null\",");
                count++;
            }
            index++;
        }
      


      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}