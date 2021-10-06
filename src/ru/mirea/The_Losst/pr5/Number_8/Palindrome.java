package ru.mirea.The_Losst.pr5.Number_8;

public class Palindrome
{
    public static int size_of_input = 0;
    public static void  check_this_one(String input)
    {
        System.out.println("Normal " + input);
        System.out.println("Reverse " + reverse_it(input));
        if (input.equalsIgnoreCase(reverse_it(input)))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    private static String reverse_it(String input)
    {
        return new StringBuilder(input).reverse().toString();
    }


    public static void main(String[] args)
    {
        check_this_one("Aboba");
    }
}
