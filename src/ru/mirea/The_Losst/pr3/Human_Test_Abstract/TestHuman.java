package ru.mirea.The_Losst.pr3.Human_Test_Abstract;

public class TestHuman {
    public static void main(String[] args) {
        Human sveta = new Human();
        sveta.setAll(167.5,"Света",'Ж',true,18);
        System.out.println("Света : " + sveta);
        sveta.makeOlder(5);
        System.out.println("Света : " + sveta);
        sveta.makeYonger(7);
        System.out.println("Света : " + sveta);
        sveta.makeItGrow(15);
        System.out.println("Света : " + sveta);
        sveta.dead();
        System.out.println("Света : " + sveta);
        sveta.live();
        System.out.println("Света : " + sveta);
    }
}
