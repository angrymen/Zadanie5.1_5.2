import java.util.Arrays;

public class ArrayName {

    public static void main(String[] args) {

        // Imiona Zadanie 5.1

        String[] name = new String[] {"Ala", "Kasia", "Mariusz"};
        String array = Arrays.toString(name);

        System.out.println(array);


        // Liczby Zadanie 5.2

        int[] numbers = new int[] {5,10,15,20,25};
        int sum = numbers[0] + numbers[2] + numbers[4];

        System.out.println(sum);

    }

}
