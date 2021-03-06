package circlearray;

import java.util.Scanner;

public class CircleArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Circle[] series = new Circle[100];
        for (int x = 0; x < 100; x++) {
            series[x] = new Circle(Integer.toString(x), "radius", x);           
        }
        
        int amount = 0;
        
        for (int y = 0; y < 100; y++) {
            if (5 <= series[y].getRadius()) {
                amount++;
            }  
        }
        
        System.out.println(series[1].getRadius());
        changer(series, "1", "radius", 10);
        System.out.println(series[1].getRadius());
                
                
    }
    
    public static void changer(Circle[] x, String a, String b, int c) {
        x[Integer.parseInt(a)] = new Circle(a, b, c);
    }
    
}
