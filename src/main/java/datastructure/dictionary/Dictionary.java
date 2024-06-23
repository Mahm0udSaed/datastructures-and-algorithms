package datastructure.dictionary;

import java.util.Arrays;

public class Dictionary <K,V>{
    private KeyValuePair[] entries;
    private int initialSize;
    private int entriesCount;

    public Dictionary(int initialSize) {
        this.initialSize=initialSize;
        this.entries=new KeyValuePair [initialSize];
    }

    /**Resize or not**
     * if entries count < entries.length-1, return
     *else copy old entries into a new array with new size =initial size+ entries.length
     *change the entries array to reference the new array
     * **/
    private void resizeOrNot(){
        if (entriesCount<entries.length-1){
            return;
        }
        KeyValuePair[] newEntries= Arrays.copyOf(entries,initialSize+entries.length);
        this.entries=newEntries;
    }
    /**set**
     * search by key
     * if exists / update the value then exit
     * else
     * call resize or not / add new value / increase entriesCount by one
     * */
    public void set(KeyValuePair<K,V> keyValuePair){
        for (int x=0;x<entries.length;x++){
            if (entries[x]!=null&&entries[x].getKey()==keyValuePair.getKey()){
                entries[x].value=keyValuePair.getValue();
                return;
            }
        }
        resizeOrNot();
        entries[entriesCount]=keyValuePair;
        entriesCount++;
    }
    /**remove**
     * search by key
     * if exists / copy the last entry into the current entry / make last entry null
     * decrease entries count
     * else return not exist
     * */
    public boolean remove(K key){
        for (int x=0;x<entries.length;x++){
            if (entries[x]!=null&&entries[x].getKey()==key){
                entries[x]=entries[entriesCount-1];
                entries[entriesCount-1]=null;
                entriesCount--;
                return true;
            }
        }
        return false;
    }
    public V get(K key){
        for (int x=0;x<entries.length;x++){
            if (entries[x]!=null&&entries[x].getKey()==key){
                return (V) entries[x].value;
            }
        }
        return null;
    }
    public void print(){
        for (KeyValuePair entry:entries){
            if (entry!=null) {
                System.out.println(entry.getKey());
            }
        }
    }
}
