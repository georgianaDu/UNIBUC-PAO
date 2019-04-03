package services;

import clase.ExceptionHasAClass;
import exceptions.CustomException;

import java.io.FileWriter;

public class Exceptii {

    public void treatExceptions(ExceptionHasAClass exceptionHasAClass){
        try {
            Integer number = Integer.valueOf(exceptionHasAClass.getExceptionClassExample().getMesaj());
            System.out.println(number);

        } catch (NumberFormatException e){
            //throw new CustomException("S-a intrat in catch pentru NumberFormatException!");
            System.out.println("NumberFormatException: ");
        } catch (Exception ex){
            System.out.println("NullPointerException :" + ex.getMessage());
        } finally {
            System.out.println("Finally");
        }

    }
}
