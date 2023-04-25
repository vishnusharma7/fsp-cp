
import java.util.*;

class rdisharralist {
    public static void main(String[] args) {

        int[] array1 = { -1, 3, 4 };
        int max = 0;

        ArrayList<Integer> array2 = new ArrayList<Integer>();

        for (int i = 0; i < array1.length; i++) {
            array2.add(array1[i]);
        }

        Collections.sort(array2);

        int max1 = array2.get(array2.size() - 1);

        for (int i = 0; i < array2.size(); i++) {
            if (array2.get(i) < 0 && (Math.abs(array2.get(i)) >= max1)) {
                array2.remove(i);
                i = -1;
            }
        }

        for (int i = 1; i <= array2.size(); i++) {
            max = max + (i * array2.get(i - 1));
        }

        System.out.println(max);
    }
}
