package ru.mirea.The_Losst.pr5.Number_2;

public class From_1_To_n
{
    private static int i = 1;
    public static void cursed(int x)
    {
        System.out.println(i);
        i += 1;
        if (i <= x)
        {
            cursed(x);
        }

    }

    public static void main(String[] args)
    {
        cursed(10);
    }
}


