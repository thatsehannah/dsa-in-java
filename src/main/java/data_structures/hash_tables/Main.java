package data_structures.hash_tables;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("paint", 20);

        myHashTable.printTable();
        System.out.println("Lumber: " + myHashTable.get("lumber"));
        System.out.println("Screws: " + myHashTable.get("screws"));
        System.out.println("Keys: " + myHashTable.keys());
    }
}
