package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ScriereInFisier {

    public void creazaFisier(String numeFisier){
        String cale = "src/output/fisiere/" + numeFisier +".txt";
        String continut = "Acesta este continutul fisierului.\nCu o noua linie.";

        //try with resources
        try (FileWriter fileWriter = new FileWriter(cale)){
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(continut);
            bufferedWriter.close(); // daca nu se inchide conexiunea nu se
          //  fileWriter.close(); nu este necesar cu try with resources
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
