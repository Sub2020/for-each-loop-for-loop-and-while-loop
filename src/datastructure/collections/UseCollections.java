package datastructure.collections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */

    public static void main(String[] args) {

        Integer[] firstArray = {1, 3, 2, 4, 8, 9, 0};
        Integer[] secondArray = {1, 3, 7, 5, 4, 0, 7, 5};

        HashSet<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(firstArray));

        set.addAll(Arrays.asList(secondArray));

        System.out.println(set);

        //convert to array
        Integer[] union = {};
        union = set.toArray(union);

        //System.out.println(Arrays.toString(union));

        System.out.println("Intersection of the two arrays ::");

        int myArray1[] = {0, 2, 4, 6, 8};
        int myArray2[] = {1, 3, 5, 7, 9};


        for(int i = 0; i<firstArray.length; i++ ) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.println(secondArray[j]);
                }
            }
        }
    }
}

