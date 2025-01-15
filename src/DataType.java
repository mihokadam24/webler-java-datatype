import java.util.ArrayList;
import java.util.List;

public class DataType {

    public static void main(String[] args) {

        byte number1 = 100;
        short number2 = 10000;
        int number3 = 100000;
        long number4 = 1000000000000L;

        float number5 = 3.14f;
        double number6 = 3.14;

        char letter = 'a';
        boolean isValid = true;

        Byte number11 = number1; // auto-boxing wrapper osztály segítségével
        number11.byteValue();
        number11.toString();

        String name = "John";
        String name2 = "john";
        String name3 = "John"; // string pool-ban tárolódik
        String name4 = new String("John"); // heapben tárolódik

        boolean isSame1 = name == name2;
        System.out.println(isSame1);
        boolean isSame2 = name == name3;
        System.out.println(isSame2);
        boolean isSame3 = name == name4;
        System.out.println(isSame3);
        boolean isSame4 = name.equals(name2); // egyenlőség
        System.out.println(isSame4);
        boolean isSame5 = name.equalsIgnoreCase(name2); // kis-nagy betű figyelmen kívül hagyása
        System.out.println(isSame5);
        boolean isSame6 = name.equals(name4);
        System.out.println(isSame6);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.contains(1); // tartalmazza-e?
        numbers.remove(0);
        int size = numbers.size();
        System.out.println(size);

        int[] nums = {1, 2, 3, 4, 5};
        int length = nums.length;
        System.out.println(length);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.toArray();
        Integer[] nums2 = {1, 2, 3, 4, 5};
        
    }
}
