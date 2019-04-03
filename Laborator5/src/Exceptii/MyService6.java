package Exceptii;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyService6 {
    public void readFile (String filePath) throws FileNotFoundException {
        try(BufferedReader bf = new BufferedReader(new FileReader(filePath))){
            String line = bf.readLine();
            while (line != null){
                System.out.println(bf.readLine());
                line = bf.readLine(); }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
