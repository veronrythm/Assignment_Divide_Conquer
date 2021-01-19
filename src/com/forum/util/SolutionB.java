package com.forum.util;

import com.forum.units.User;

public class SolutionB {
    public static int findMaxValue(User[] user, int key){
        int left = 1, right = 1;
        int val = user[1].getUserId();

        try {
            while (user[right].getUserId() < key) {
                left = right;
                right = 2 * right;
                //System.out.println("Value of Right is : " + right);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("Value of Right in the catch block: "+right);
            right = right/2;
            //System.out.println("Value of Right after division: "+right);
            try {
                while (user[right] != null) {
                    //       System.out.println("Value of Right: " + right);
                    right = right + 1;
                }
            } catch (ArrayIndexOutOfBoundsException e1 ) {
                return right-1;
            }
            //  System.out.println("After the while loop is completed "+right);
        }

        //System.out.println("Value of Right is: "+right);
        return right;


    }

    public static int searchInfiniteArray(User[] user, int first, int last, int key) {
        System.out.println("In the function");

        while(first<=last) {
            int mid = first + (last-first)/2;

            if(user[mid].getUserId() == key)
                return mid;
            else if(user[mid].getUserId() < key) {
                first = mid + 1;
            }
            else if(user[mid].getUserId()>key) {
                last = mid -1;
            }
        }
        return -1;


    }
}
