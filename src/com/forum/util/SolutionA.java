package com.forum.util;

import com.forum.units.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionA {
    public static String inputFromUser() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        return input;
    }

    public static int searchArray(User[] user, int first, int last, int min) {
        int left = first;
        int right = last;
        int mid = left + (right - left) / 2;
        ;
        //System.out.println("##############");
        //System.out.println("Left is "+left+" Right is "+right);
        //System.out.println("Min value is "+min);

        while (left <= right) {
            //System.out.println("Mid is "+mid);
            mid = left + (right - left) / 2;
            if (user[mid].getUserId() == mid && mid < min) {
                //System.out.println("In the first if condition");
                //System.out.println("Mid is "+mid);
                min = mid;
                int temp = searchArray(user, left, mid - 1, min);
                if (temp != -1) min = temp;
                return min;
            } else if (user[mid].getUserId() < mid) {
                //System.out.println("In the 2nd else condition");
                //System.out.println("Mid is "+mid);
                int temp = searchArray(user, mid + 1, right, min);
                if (temp != -1) min = temp;
                return min;
            } else if (user[mid].getUserId() > mid) {
                //System.out.println("In the 3rd else condition");
                int temp = searchArray(user, left, mid - 1, min);
                if (temp != -1) min = temp;
                return min;
            }
        }

        return -1;


    }



}