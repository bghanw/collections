package collections;
import java.util.*;
public class App {

    public static void main(String[] args) {

        //Create Array
        String[] things = {"eggs", "lasers", "hats", "pie"};

        //Create List
        List<String> list1 = new ArrayList<String>();

        // add array items to list
        for (String x: things) {
            list1.add(x);
        }


        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
            //System.out.println(String.format("%s ", list1.get(i)));
        }

        System.out.println(" ");


        // Create Array and list (2)
        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        // add array items to list2
        for (String y: moreThings) {
            list2.add(y);
        }

       for (int j = 0; j < list2.size(); j++){
            System.out.printf("%s ", list2.get(j));
        }

       editList(list1,list2);
        System.out.println();

        for (int k = 0; k < list1.size(); k++){

            System.out.printf("%s ", list1.get(k));
        }

    }

    public static void editList(Collection<String>l1, Collection<String> l2){

        Iterator<String> it = l1.iterator();
        while (it.hasNext()) {
            if (l2.contains(it.next()))
                it.remove();
        }

    }
}
