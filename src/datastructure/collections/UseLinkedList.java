package datastructure.collections;
import java.util.LinkedList;

public class UseLinkedList {
    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);


        iterateUsingForLoop(linkedList);
    }


    public static void iterateUsingForLoop(LinkedList<Integer> linkedList) {
        System.out.println("Iterating the LinkedList using a simple for loop : ");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");


            i = 0;

            while(i<linkedList.size()) {
                System.out.print(linkedList.get(i) + " ");
                i++;
            }

            //System.out.println();

            //System.out.print("Iterating the LinkedList using while loop : ");
        }

    }
}
