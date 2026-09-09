import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in","India");
//        mapping.put("in","India2");
        mapping.put("en","Emgland");
        mapping.put("us","United States");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br" , "brazil");
        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);

        table.remove("en");
        System.out.println(table);
        table.putIfAbsent("is","India3");
        System.out.println(table);
        System.out.println(table.get("br"));
        System.out.println(table.getOrDefault("usa","NONE"));
        System.out.println(table.containsKey("im"));
        System.out.println(table.containsValue("United States of America"));
        System.out.println(table);

        table.replace("in","indonesia");
        System.out.println(table);

        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueset = table.values();
        System.out.println(valueset);

        Set<Map.Entry<String,String>> entrySet = table.entrySet();
        System.out.println("Printing Enties : " + entrySet);
//        System.out.println(table.size());
    }
}
