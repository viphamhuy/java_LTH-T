package classPtbac2;
import java.util.Scanner;

class Ptbac2 {
    double a, b, c, delta;

    public Ptbac2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        this.a = sc.nextDouble();
        System.out.println("Nhap b:");
        this.b = sc.nextDouble();
        System.out.println("Nhap c:");
        this.c = sc.nextDouble();
    }

    public Ptbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double gettDiscriminant() {
         return this.delta = b * b - 4 * a * c;
    }

    public void getEquation() {
        double x1,x2;
        if (this.a == 0) {
            if (this.b == 0) {
                if (this.c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                }
            }
            else {
                System.out.println("Phuong trinh co 1 nghiem");
                x1 = -c/b;
                System.out.println(" x = " + x1);
            }
        }
        else {
            if(this.delta<0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if(this.delta==0){
                System.out.println("Phuong trinh co nghiem kep: ");
                 x1=-b/(2*a);
                System.out.println("x = " + x1);
            }
            if(delta>0){
                System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                x1=(-b+this.delta*this.delta)/(2*a);
                System.out.println("x1 = "+ x1);
                x2=(-b-this.delta*this.delta)/(2*a);
                System.out.println("x2 = " + x2);
            }
        }
    }
}

public class classPTbac2 {
    public static void main(String[] args) {
        Ptbac2 ptbac2 = new Ptbac2();
        System.out.println(ptbac2.gettDiscriminant());
        ptbac2.getEquation();
    }
}
