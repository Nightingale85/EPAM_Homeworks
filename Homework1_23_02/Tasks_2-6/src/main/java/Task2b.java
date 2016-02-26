/**
 * Created by Lammi on 24.02.2016.
 */
public class Task2b {

    public static double squareRectangle(double sideOne, double sideTwo){

        return sideOne * sideTwo;
    }

    public static double perimeterRectangle(double sideOne, double sideTwo){

        return 2*sideOne + 2*sideTwo;
    }

    public static void main(String[] args) {

        System.out.println(squareRectangle(2, 3));
        System.out.println(perimeterRectangle(2, 3));
    }
}
