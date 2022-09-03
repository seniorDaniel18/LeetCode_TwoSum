import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9};

        int[] result = method(14, array);

        System.out.println(Arrays.toString(result));

    }

    public static int[] method (int num, int[] array){

        for (int i = 0; i < array.length; i ++){
            for (int j = i + 1; j < array.length; j ++){
                if (array[i] + array[j] == num){
                    return new int[] {i, j};
                }

            }
        } return new int[] {};
    }
}