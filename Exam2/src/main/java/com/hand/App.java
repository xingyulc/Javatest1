package com.hand;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println( "Hello World!" );
        List<Personnel> personnels = getPersonnels();


       for(Personnel personnel : personnels){
           System.out.println(personnel.getName()+"的工资："+singleton.calculate(personnel.getSalary()));
       }
    }

    private static List<Personnel> getPersonnels() {

        List<Personnel> result = new ArrayList<Personnel>();

        result.add(new Personnel("userA", 5000));
        result.add(new Personnel("userB", 10000));
        result.add(new Personnel("userC", 15000));
        result.add(new Personnel("userD", 60000));

        return result;

    }
}
