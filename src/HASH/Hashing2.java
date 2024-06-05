package HASH;
import java.util.*;

public class Hashing2 {
    public static void main(String args[]){
       //country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();


        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);
        // if key exist then the value gey updated and if the key won't exist then the new pair got inserted.


        //Search
        if(map.containsKey("Indonesia")){
            System.out.println("key is present in the map ");
        }else {
            System.out.println("key is not present in the map ");
        }

//        System.out.println(map.get("china")); // key exist
//        System.out.println(map.get("Indonesia"));  // key doesn't exist



//        int arr[] = {12, 15, 18};
//        for(int i =0 ; i<3; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        for(int val : arr) {
//            System.out.print(val + " ");
//        }
//        System.out.println();

        //for(int val : arr)

//        for(Map.Entry<String,Integer> e : map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        Set<String> keys = map.keySet();
//        for(String key : keys ){
//            System.out.println(key + " "+ map.get(key));
//        }


        map.remove("China");
        System.out.println(map);




    }
}
