package ru.mirea.The_Losst.pr5.Number_10;

public class Reverse
{
    private static String output = " ";
    private static int buff;
    public static void reverse_It(int input)
    {
        if (input > 0)
        {
            buff = input % 10;
            input /= 10;
            output += buff;
            reverse_It(input);
        }
        else {
            System.out.println(output);
        }

    }


    public static void main(String[] args)
    {
        reverse_It(982374782);
    }
}
