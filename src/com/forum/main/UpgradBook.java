package com.forum.main;

import com.forum.units.User;
import com.forum.util.SolutionA;
import com.forum.util.SolutionB;

import java.io.IOException;

public class UpgradBook {

    public static void main(String[] args) throws IOException {
        System.out.println("How many users data you want to give ?");
        int countOfUsers = Integer.parseInt(SolutionA.inputFromUser());
        User users[] = new User[countOfUsers+1];
        //System.out.println("Count of users is "+users.length);

        for(int i=1;i<=countOfUsers;i++) {
            System.out.println("Input user id of user "+i);
            users[i] = new User();
            users[i].setUserId(Integer.parseInt(SolutionA.inputFromUser()));
            //users[i] = Integer.parseInt(SolutionA.inputFromUser());
        }

        int number = SolutionA.searchArray(users,1,countOfUsers,Integer.MAX_VALUE);
        if(number == Integer.MAX_VALUE)
            System.out.println("NOT_FOUND");
        else
            System.out.println("First positive integer where it is both a user’s ID and its index in the array of user ids-"+ number);

        System.out.println("Enter the value to search: ");
        int key = Integer.parseInt(SolutionA.inputFromUser());
        int maxValue = SolutionB.findMaxValue(users,key);
        System.out.println("Right Array value is : "+maxValue);

        number = SolutionB.searchInfiniteArray(users,1,maxValue,key);
        if(number == -1)
            System.out.println("NOT_FOUND");
        else
            System.out.println("Element found at index: "+ number);

        }

}
