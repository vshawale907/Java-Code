import java.util.*;

public class hashmapoperations {

    public static void main(String args[]) {

        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - o(1);
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        // System.out.println(hm);

        // int population = hm.get("150");
        // System.out.println(population);

        // System.out.println(hm.containsKey("China"));

        // remove 
        System.out.println(hm.remove("US", 50));
        System.out.println(hm);


        // Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());

        

    }

}
