/*
A Java Class to get data from the file
 */
package VMPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class FileHandler {
    static String fileName;
     
    FileHandler(String fileName){
        this.fileName = fileName;
    }

//    Method to read file
    public static ArrayList<String> readFile(String filename) {
        ArrayList<String> fileList = new ArrayList<String>();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNext()) {
                fileList.add(myReader.next());
            }
            myReader.close();

//            if (filename == "DrinksPrice.txt") {
//                double drinkPrice1 = Double.parseDouble(fileList.get(1));
//                double drinkPrice2 = Double.parseDouble(fileList.get(3));
//                double drinkPrice3 = Double.parseDouble(fileList.get(5));
//                double drinkPrice4 = Double.parseDouble(fileList.get(7));
//                double drinkPrice5 = Double.parseDouble(fileList.get(9));
//                double drinkPrice6 = Double.parseDouble(fileList.get(11));
//            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        if (fileList == null) {
            return new ArrayList<String>(); //null ya3ni
        } else {
            return (fileList);
        }
    }
    
    
    public static ArrayList<String> modifyFile(String filename) {
        ArrayList<String> fileList = new ArrayList<String>();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNext()) {
                fileList.add(myReader.next());
            }
            myReader.close();

//            if (filename == "DrinksPrice.txt") {
//                double drinkPrice1 = Double.parseDouble(fileList.get(1));
//                double drinkPrice2 = Double.parseDouble(fileList.get(3));
//                double drinkPrice3 = Double.parseDouble(fileList.get(5));
//                double drinkPrice4 = Double.parseDouble(fileList.get(7));
//                double drinkPrice5 = Double.parseDouble(fileList.get(9));
//                double drinkPrice6 = Double.parseDouble(fileList.get(11));
//            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        if (fileList == null) {
            return new ArrayList<String>(); //null ya3ni
        } else {
            return (fileList);
        }
    }

    

    
    
}
