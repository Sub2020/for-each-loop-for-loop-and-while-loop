package datastructure.collections;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class ArrayList {



    public static void main(String[] args) {
        java.util.ArrayList<String> languages = new java.util.ArrayList<>();
        languages.add("German");
        languages.add("Nepali");
        languages.add("English");
        languages.add("Korean");
        languages.add("Spanish");
        languages.add("Hindi");
        System.out.println("Original ArrayList: " + languages);
        languages.remove("Hindi");
        System.out.println("Modified Arraylist: " + languages);



    }
}