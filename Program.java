package HashMapExercise;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void printKeys(HashMap<String,String> hashmap){
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (Map.Entry<String, String> abbreviationMap : hashmap.entrySet()) {
            if (abbreviationMap.getKey().contains(text)) {
                System.out.println(abbreviationMap.getValue());
            }
        }
    }
    public static void printValues(HashMap<String, Book> hashmap){
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
    }


