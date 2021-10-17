package org.example;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[] {"Karmand Aziz", "Erik Andersson"};


    public static String find(final String fullName) {
         for(String k : names){
             if(k.equalsIgnoreCase(fullName)){
                 return k;
             }
         }
         return null;
}


    public static boolean add(final String fullName){
        if(find(fullName) != null) {  //if name exists return false
            return false;
        }
        String[] temp = Arrays.copyOf(names, names.length +1);
        temp[temp.length-1] = fullName;
        names = temp;                                   //If name doesn't exist returns true
        return true;
    }


    public static int getSize(){
        return names.length;
    }

    public static void setNames (String[] names){
        NameRepository.names = names;
    }

    public static void clear(){
        names = new String[0];
    }

    public static String[] findAll(){
        return Arrays.copyOf(names, names.length);
    }


}
