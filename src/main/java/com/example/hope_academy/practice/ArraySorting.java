package com.example.hope_academy.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySorting {
    public static void main(String[] args) {
        int arr[]= {34,45,56,78,98};
        String a[]= {"zia", "anas", "aways"};
      //  String a[0]= "zia";
            //   a[1]= "anas";
              // a[2]= "aways";
        List<String> l = new ArrayList<>();
        l.add("Zia");
        l.add("Shafi");
        l.add("Anas");
        System.out.print(l);
        Collections.sort(l);
        for(int i=0;i<=2;i++){
            System.out.print(a[i]+",");

        }

    }
}
