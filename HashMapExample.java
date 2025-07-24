import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

    
        System.out.println(map.get(2)); 

    
        System.out.println(map.containsKey(1));

    
        map.remove(3);

        
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
