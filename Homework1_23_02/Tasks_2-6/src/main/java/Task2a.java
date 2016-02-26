

/**
 * Created by Lammi on 24.02.2016.
 */
public class Task2a {
    public static boolean isTrue(int number){

        char [] array = String.valueOf(number).toCharArray();

        if (array.length != 4) {

            System.out.println("Number must consist of four figures");
            return false;
        }

        if (array[0]+array[1] == array[2]+array[3]) return true;

        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isTrue(15));
        System.out.println(isTrue(9988));
        System.out.println(isTrue(9696));
    }
}
