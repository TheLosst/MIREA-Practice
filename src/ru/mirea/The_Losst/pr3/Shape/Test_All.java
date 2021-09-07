package ru.mirea.The_Losst.pr3.Shape;

public class Test_All {
    static void Circle() {
        Circle krug = new Circle("Алый",true,15.3);
        System.out.println("Площадь круга: " + krug.getArea());
        System.out.println("Периметр круга: " + krug.getPerimeter());
        System.out.println(krug);
    }
    void Rectagle(){

    }


    public static void main(String[] args) {
        Circle();
    }
}
