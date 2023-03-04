import java.util.*;

// Leetcode question 9

public class Palindrome {


    public static boolean isPalindrome(int number){
        if(number<0){
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;
        while(number!=0){
            int remainder = number%10;
            reversedNumber = reversedNumber*10+ remainder;
            number = number/10;
        }
        if(originalNumber==reversedNumber){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        boolean answer =isPalindrome(191);
        System.out.println(answer);
    }
}