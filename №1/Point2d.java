import java.util.Scanner;

public class Point2d {
    private int x;
    private int y;
    Point2d(int x, int y) { 
        this.x = x;
        this.y = y;
    }
    Point2d() {
        this.x = 0;
        this.y = 0;
    }
    void SetX(int x) {   
        this.x = x;
    }
    void SetY(int y) { 
        this.y = y;
    }
    int GetX() { 
        return x;
    }
    int GetY() {
        return y;
    }
	public static void main(String[] args) { 
        Point2d first = new Point2d();   
        System.out.print("x = " + first.GetX() + '\n');
        System.out.print("y = " + first.GetY() + '\n');
    }
}





