import java.lang.Math;

/**
 * Created by Lammi on 24.02.2016.
 */
public class Task3 {

    public static void function(double aPoint, double bPoint, double step){

        System.out.println("argum - result");

        double result = 0;
        while (aPoint <= bPoint){

            System.out.print(aPoint + "   -  ");
            System.out.println(result = Math.tan(2 * aPoint - 3 ));
            aPoint = aPoint + step;
        }
    }
    public static void main(String[] args) {

    function(0 , 6 , 1);

    }
}
