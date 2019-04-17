package main;

import services.CitireDinFisier;
import services.ScriereInFisier;

public class Main {

    public static void main(String[] args){
//        Exceptii exceptii = new Exceptii();
//        ExceptionClassExample exceptionClassExample = new ExceptionClassExample();
//        exceptionClassExample.setMesaj("a");
//
//        ExceptionHasAClass exceptionHasAClass = new ExceptionHasAClass();
//
//        //NumberFormatException
//        exceptionHasAClass.setExceptionClassExample(exceptionClassExample);
//        exceptii.treatExceptions(exceptionHasAClass);
//
//        //NullPointerException
//        exceptionHasAClass.setExceptionClassExample(null);
//        exceptii.treatExceptions(exceptionHasAClass);

        ScriereInFisier scriereInFisier = new ScriereInFisier();
        CitireDinFisier citireDinFisier = new CitireDinFisier();
      //  scriereInFisier.scriereInFisierNIO("fisierNouNIO");
       // scriereInFisier.citireDinFisierNIO("fisierNouNIO");
      //  scriereInFisier.scriereInFisierIO("fisierNouIO");
      //  citireDinFisier.citireDinFisierIO("fisierNouIO");

       // scriereInFisier.randomAccessFileExample("fisierNouIO");

        scriereInFisier.scriereObiectInFisier("object.bin");
        citireDinFisier.citireObiectBin("object.bin");
    }
}
