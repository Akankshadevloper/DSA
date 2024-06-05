package HASH;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args){
       //Creating
       HashSet<Integer> set = new HashSet<>();
       //ArrayList<Integer> list = new ArrayList<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);


        //size
        System.out.println("size of the set is: " + set.size());


        //print all elements
        System.out.println(set);

        //Iterator
        Iterator<Integer> it = set.iterator();
        //hasNext, next
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // Search - contains
//        if(set.contains(1)){
//            System.out.println("set contains 1 ");
//        }
//        if(!set.contains(6)){
//            System.out.println("does not contains");
//        }
//
//        //Delete
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("we deleted one ");
//        }

    }
}
