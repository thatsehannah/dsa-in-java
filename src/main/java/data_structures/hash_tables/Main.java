package data_structures.hash_tables;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
//        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();
        System.out.println("Lumber: " + myHashTable.get("lumber"));
        System.out.println("Bolts: " + myHashTable.get("bolts"));
    }
}
