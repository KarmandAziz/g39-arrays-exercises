package org.example;

import java.util.Arrays;

public class RemoveDupes {


    public static String removeStringDup(String str[], int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            int k;
            for (k = 0; k < i; k++) {
                if(str[i].equals(str[k])){
                    break;
                }
            }
            if(k == i){
                str[index++] = str[i];
            }
        }
        return Arrays.toString(Arrays.copyOf(str, index));
    }    //Removes duplicate from String Array

    public static String removeIntDup(int[] str, int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            int k;
            for (k = 0; k < i; k++) {
                if(str[i] == (str[k])){
                    break;
                }
            }
            if(k == i){
                str[index++] = str[i];
            }
        }
        return Arrays.toString(Arrays.copyOf(str, index));
    }         //Removes duplicate from int Array
}
