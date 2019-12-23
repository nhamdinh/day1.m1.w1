package RectangleCalcula;

import java.util.Scanner;

public class RectangleCalcula {
    public static void main(String[] args) {
        float width, height;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextFloat();

        System.out.print("Enter the height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("The area is : " + area);

    }
}
