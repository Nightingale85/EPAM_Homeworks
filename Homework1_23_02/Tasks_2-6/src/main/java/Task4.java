/**
 * Created by Lammi on 24.02.2016.
 */
public class Task4 {

    public static int maxSumArray(int[]array){
        int iterationLength;
        int arrLength = array.length;

        if (arrLength % 2 == 0)
             iterationLength = arrLength/2;
        else iterationLength = arrLength/2 + 1;

        int maxNumber = 0;
        for (int i = 0; i < iterationLength; i++ ){

            int iterationSum = array[i]+array[arrLength-i-1];

            if (iterationSum > maxNumber) maxNumber = iterationSum;
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(maxSumArray(new int[]{1, 6, 9, 8, 6, 4}));
    }
}
