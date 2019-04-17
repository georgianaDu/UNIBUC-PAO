package services;

import clase.Persoana;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ScriereInFisier {

    public void scriereInFisierIO(String numeFisier) {
        String cale = "src/output/fisiere/" + numeFisier + ".txt";
        String continut = "Acesta este continutul fisierului.\nCu o noua linie.";

        //try with resources
        try (FileWriter fileWriter = new FileWriter(cale)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(continut);
            bufferedWriter.close(); // daca nu se inchide conexiunea nu se
            //  fileWriter.close(); nu este necesar cu try with resources
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scriereInFisierNIO(String numeFisier) {
        Path path = Paths.get("src", "output", "fisiere", numeFisier + ".txt");

        String continut = "Acesta este continutul fisierului.\nCu o noua linie.";
        try {
            Files.write(path, continut.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void randomAccessFileExample(String numeFisier) {
        String cale = "src/output/fisiere/" + numeFisier + ".txt";

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(cale,"r");// moduri de access "r" - read, "w" - write, "rw" - read - write

            byte[] bytes = new byte[1000];
            randomAccessFile.seek(5);
            randomAccessFile.read(bytes);

            randomAccessFile.close();
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void scriereObiectInFisier(String numeFisier){
        Persoana persoana = new Persoana();
        persoana.setNume("Ana");
        persoana.setVarsta(23);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(numeFisier);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);


            objectOutputStream.writeObject(persoana);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
