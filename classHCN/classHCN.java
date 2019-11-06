package classHCN;
import java.util.Scanner;
class Rectangle{
    double width,height;
    public Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String disPlay(){
        return "Hinh chu nhat{"+" width ="+width+" , height ="+height+" }";
    }
}
public class classHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Width: ");
        double width = sc.nextDouble();
        System.out.println("Input Height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.disPlay());
    }
}
