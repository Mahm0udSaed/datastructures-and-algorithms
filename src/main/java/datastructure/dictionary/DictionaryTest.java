package datastructure.dictionary;

public class DictionaryTest {
    public static void main(String[] args){
        Dictionary dictionary=new Dictionary(3);
        dictionary.set(new KeyValuePair("one",1));
        dictionary.set(new KeyValuePair("two",2));
        dictionary.set(new KeyValuePair("three",3));
        System.out.println(dictionary.get("three"));
        dictionary.remove("three");
        dictionary.print();
    }
}
