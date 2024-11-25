import java.util.Arrays;

public class ForEachStatement {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,5,6,12,4,435};
        for(int number: numbers){
            System.out.println(number);
        }
        System.out.println(Arrays.toString(numbers));
        StringBuilder formatedArray = new StringBuilder("[");
        for(int number: numbers){
            formatedArray.append(number).append(", ");
        }
        formatedArray = new StringBuilder(formatedArray.substring(0, formatedArray.length() - 2)).append("]");
        System.out.println(formatedArray);
    }
}
