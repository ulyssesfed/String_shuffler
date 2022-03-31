package com.company;

public class Main {
public static String s;

    public static void main(String[] args) {
        s = "Hello World"; // string to be shuffled
        int indices[] = {1,2,4,0,3,6,7,5,9,8,10}; // the indices of the characters in the string
        shuffle(s, indices);  //function call to shuffle the string
    }

    public static void shuffle(String s, int[] indices) {
        for (int i = 0; i < indices.length; i++) {
            System.out.print(s.charAt(indices[i])); // prints the characters in the shuffled order
        }
    }
}
