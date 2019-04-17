package services;

import clase.Persoana;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class CitireDinFisier {

    public void citireDinFisierNIO(String numeFisier) {
        Path path = Paths.get("src", "output", "fisiere", numeFisier + ".txt");

        System.out.println(path.getNameCount());
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());

        try {
            List<String> lines = Files.readAllLines(path);


            for (String s : lines) {
                String[] attribute = s.split(",");
                String str2 = s.replaceAll("\"","");

                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void citireDinFisierIO(String numeFisier) {

        String cale = "src/output/fisiere/" + numeFisier + ".bin";

        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(cale);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void citireObiectBin(String numeFisier){
        Persoana persoana = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(numeFisier);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            persoana = (Persoana)objectInputStream.readObject();

            System.out.println(persoana);

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
