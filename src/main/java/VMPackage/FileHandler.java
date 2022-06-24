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

    FileHandler(String fileName) {
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

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            for (int i = 0; i < 15; i++) {
                fileList.add("0");
            }
        }
//        if (fileList == null) {
////            return new ArrayList<String>(); //null ya3ni
//            for (int i = 0; i < 15; i++) {
//                fileList.add("0");
//            }
//        }
        return (fileList);
    }
}
