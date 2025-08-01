//A program to check weather the person is eligible to vote or not
// If the person is eligible is displays as "Congratulations you are Eligible to vote!"
// Otherwise it will displays as "Oh no, You are not Eligible to Vote!" 

import java.util.*;
public class sample
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age here -> ");
        int age = scan.nextInt();
        if(age>=18)
        {
            System.out.println("Congratulations you are Eligible to Vote!");
        }
        else
        {
            System.out.println("Oh no, you are not Eligible to vote!");
        }
    }
}