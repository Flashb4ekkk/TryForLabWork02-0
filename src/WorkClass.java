// <Levkiv Roman>
// Лабораторна робота № 2.
// Лінійні програми.
// Варіант 11
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class WorkClass {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        double a =  skan.nextDouble(); // вхідний параметр
        double z1; // результат обчислення 1-го виразу
        double z2; // результат обчислення 2-го виразу

        z1 = Math.cos(2*a) / (1 + Math.sin(2*a));
        System.out.println("result of z1 = " + Math.round(z1*100000.0)/100000.0);

        z2 = (1 - Math.tan(a)) / (1 + Math.tan(a));
        System.out.println("result of z2 = " + Math.round(z2*100000.0)/100000.0);

        boolean value;
        if(z1 == z2){
            value = true;
        } else{
            value = false;
        }
        //System.out.println("these two examples are equivalent = " + value);
    }
}
