package com.strings.java;


public class StringExample {
    public static void main(String[] args) {

        // string object

        // string object are access duplicates

        String name = new String("vasu");
        String name1 = new String("vasu");
        System.out.println(name == name1);

        // string literals

        // string literals not accepted in duplicates

        String username = "  vasuboddupalli";
        String username1 = "vasu boddupalli";
        System.out.println(username == username1);

        System.out.println(username1.length());
        System.out.println(username.charAt(13));
        System.out.println(username.compareTo(name1));

        String password = "vasuboddupilli@123";

        boolean condition;
        condition = false;

        if (username.trim().equalsIgnoreCase("vasuboddupalli") && password.equals("vasuboddupilli@123")) {
            condition = true;
            System.out.println(condition);
        }

        // string is immutable because here didn't use any reference variable
        username1.toLowerCase();
        System.out.println(username1);

        // string is mutable because here we using a reference variable

        username1 = username1.toUpperCase();
        System.out.println(username1);

        // string split method

        String students = "bharath,422,9666462662,ece";
        // here we declare a string as an array

        String[] values = students.split(",");
        for (String student : values) {
            System.out.println(student);
        }

    }
}
