import java.util.Scanner;
import java.io.*;

public class Lab1 {
    public static double ComputerArea(Point3d a, Point3d b, Point3d c) {
        double AB = Point3d.distanceTo(a, b);
		double BC = Point3d.distanceTo(b, c);
		double AC = Point3d.distanceTo(a, c);
		double p = (AB + BC + AC) / 2;   
        return Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));
    }
    public static void main(String[] args) {
            Point3d first  = new Point3d();
            Point3d second = new Point3d();
            Point3d three  = new Point3d();
            System.out.print("\n Ввод координат точки: A \n");
            Point3d.input(first);
            System.out.print("\n Ввод координат точки: B \n");
            Point3d.input(second);
            System.out.print("\n Ввод координат точки: C \n");
            Point3d.input(three);
            System.out.print("\n Первая точка: \n");
            Point3d.output(first);
            System.out.print("\n Вторая точка: \n");
            Point3d.output(second);
            System.out.print("\n Третья точка: \n");
            Point3d.output(three);
            if(Point3d.method(first, second) || Point3d.method(first, three) || Point3d.method(second, three))
                System.out.print("\n Вы ввели одинаковые точки! \n");
            else
                System.out.print("\n Площадь треугольника: " + ComputerArea(first, second, three) + "\n\n");
    }
}