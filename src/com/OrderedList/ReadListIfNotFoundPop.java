package com.OrderedList;

import java.util.*;

import java.util.Scanner;

public class ReadListIfNotFoundPop {
    public static void main(String[] args) {

        System.out.println("Enter number which you want to add : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();


        // Adds data to the list
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(0);
        // Displaying original list
        System.out.println("Original list: ");
        list.iterator();

        // Sorting list
        Collections.sort(list);

        // Displaying sorted list
        System.out.println("Sorted list: ");

        System.out.println("sorted list : " + list);

        if (list.contains(number) == true) {
            System.out.println("Already Contain");
            list.remove(number);
        } else {
            int temp = 0;
            for (int i = 0; i < list.indexOf(number); i++)
                temp = i;
            list.add(list.set(temp, number));
            System.out.println("Added Element " + number + "  list is " + list.stream().sorted());
        }

    }
    }



