package com.translator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("What word do you want to be translated? ");
	    String word = scanner.next();
	    String temp = word.toLowerCase();
	    String[] words = temp.split("");
	    char first = temp.charAt(0);
	    if (first == 'a'|| first == 'e'|| first == 'i'|| first == 'o'|| first=='u'){
	        System.out.println(temp + "yay");
	    } else {
	        String rest = temp.substring(1);
	        System.out.println(rest + words[0] + "ay");
	    }
    }
}
