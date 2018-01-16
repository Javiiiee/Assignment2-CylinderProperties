import java.util.Scanner;

public class CylinderProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of the cylinder?");
        double radius = sc.nextDouble();
        System.out.println("Enter the lenght of the cylinder?");
        double lenght = sc.nextDouble();

        double area = (radius * radius * 3.141592653);
        double volume = (area * lenght);

        System.out.println("The area of your cylinder is "+area+"\n"+"the volume of your cylinder is "+volume);


    }
}