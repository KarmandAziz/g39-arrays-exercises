package org.example;


import java.util.*;

import static org.example.RemoveDups.*;

/**
 * Exercises for Arrays week 2.
 *
 */
public class App {
    public static void main(String[] args) {


        int[] dupArray = new int []{1, 1, 2, 2, 4, 3, 4, 5, 5, 6, 7, 8, 8 ,9};
        Arrays.sort(dupArray);
        int n = dupArray.length;

        System.out.println(removeIntDup(dupArray, n));





    }   //  <-------------------------------------- end of main method


                   // ***  Methods below  *** \\

    public static String indexOf(String task, String[] array) {
        for (String string : array) {
            if (string.equalsIgnoreCase(task)) {
                return string;
            }
        }
        return null;
    }

    static double average(int a[], int n) {

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];

        }
        return (double) result / n;
    } //reusable method for counting the average


    public static String[] addToStringArray(final String[] learnJava, String string) {
        String[] newArray = new String[learnJava.length + 1];
        for (int i = 0; i < learnJava.length; i++) {
            newArray[i] = learnJava[i];
        }
        newArray[newArray.length - 1] = string;
        return newArray;

    }

    public static String arrayToString(String[] strings) {
        String message = "[";
        for (int i = 0; i < strings.length; i++) {
            message = message + strings[i];
            if (i != strings.length - 1) {
                message = message + ", ";
            }
        }
        message += "]";
        return message;

    }

    public static String findTask(String task, String[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, task);
        if (index < 0) {
            return null;
        }
        return array[index];
    }



                  // *** Examples below *** \\
    public static void writeTaskExample() {
                      Scanner scanner = new Scanner(System.in);
                      String[] learnJava = {};

                      boolean running = true;
                      while (running) {
                          System.out.println("Write a task ");
                          String task = scanner.nextLine();
                          learnJava = addToStringArray(learnJava, task);
                          System.out.println(arrayToString(learnJava)); //sout ''method(program)''
                          System.out.println("Do you want to continue? y / n");
                          switch (scanner.nextLine()) {
                              case "n":
                                  running = false;
                                  break;
                          }
                      }
                  }

                      // ***  Exercises below  *** \\

    public static void arrayExercise1() {
        int[] numbers = new int[]{1, 34, 55, 67};

        System.out.println(Arrays.toString(numbers));

        //or for specific values " 1, 34, 55, 67 = [0], [1], [2], [3] "
        System.out.println(numbers[0]);


    }   // store elements in array "int" and print

    public static void arrayExercise2() {
        //Array containing different ages
        int[] age = {15, 16, 17, 18, 19, 20};

        int indexFound = Arrays.binarySearch(age, 19);
        int indexNotFound = Arrays.binarySearch(age, 43);

        System.out.println(indexFound);
        System.out.println(indexNotFound);

    }

    public static void arrayExercise3() {
        String[] alphabet = {"B", "C", "A", "D"};

        Arrays.sort(alphabet);     // Sorts in alphabetic order
        for (String alphabets : alphabet) {
            System.out.println(alphabets);
        }

    }

    public static void arrayExercise4() {

        int[] age = {13, 16, 18, 20};
        int[] age2 = Arrays.copyOf(age, 3); //Copy age until 3'd number (index 2)
        // can be used to shrink
        for (int number : age2) System.out.println(number);

    }

    public static void arrayExercise5() {

        String[][] country = new String[2][2];

        country[0][0] = "Sweden";
        country[0][1] = "Stockholm";
        country[1][0] = "France";
        country[1][1] = "Paris";

        System.out.println(country[0][0] + " " + country[0][1]);
        System.out.println(country[1][0] + " " + country[1][1]);


    }

    public static void arrayExercise6() {

        int[] numbers = {43, 5, 23, 16, 2, 14};   // (num1 + num2 + num3) / 6);
        int n = numbers.length;

        System.out.println("The average is:" + average(numbers, n));
    }

    public static void arrayExercise6a() {
        //without using function
        int[] p = new int[]{43, 5, 23, 16, 2, 14};
        double add = p[0] + p[1] + p[2] + p[3] + p[4] + p[5];
        double result = add / 6;

        System.out.print(result);
    }

    public static void arrayExercise7() {

        // Iterates through the array and prints the odd numbers

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(" " + numbers[i]);
            }
        }
    }

    public static void arrayExercise8() {

        int[] dupArray = {20, 20, 40, 20, 30, 30, 40, 50, 50, 60, 60, 50};
        Arrays.sort(dupArray);  //sorts the array


        int noDup = 0;
        for (int i = 0; i < dupArray.length - 1; i++) {    // iterate trough array
            if (dupArray[i] != dupArray[i + 1]) {         // identify duplicates
                dupArray[noDup] = dupArray[i];            // separate none duplicates
                noDup++;
            }
        }
        dupArray[noDup] = dupArray[dupArray.length - 1];  // replace dupArray with contents of noDup
        for (int i = 0; i <= noDup; i++) {              // iterate through the new Array values and print
            System.out.print(" " + dupArray[i]);
        }

    }

    public static void arrayExercise8a() {
        String[] dupArray = {"20", "20", "40", "20", "30", "30", "40", "50", "50", "60", "60", "50"};
        Arrays.sort(dupArray);
                                      //Basically same concept as exercise 8 but for a string Array
        int string = 0;
        for (int i = 0; i < dupArray.length - 1; i++) {
            if (!dupArray[i].equals(dupArray[i + 1])) {
                dupArray[string] = dupArray[i];
                string++;
            }
        }
        dupArray[string] = dupArray[dupArray.length - 1];
        for (int i = 0; i <= string; i++) {
            System.out.print(" " + dupArray[i]);


        }
    }

    public static void arrayExercise8b() {
        String[] dupArray = {"20", "20", "40", "20", "30", "30", "40", "50", "50", "60", "60", "50"};

        int n = dupArray.length;
        System.out.println(removeStringDup(dupArray, n));
    }

    public static void arrayExercise9() {


    }
}
























