package data_structures.hash_tables;

import java.util.ArrayList;

public class HashTable {
    class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.print(i + ": ");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.print("{" + temp.key + " = " + temp.value + "} -> ");
                temp = temp.next;
            }
            System.out.print("{null}\n");
        }
    }

    // hash function that will be used to get the address of the key in the array
    // O(1)
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length; // chose the number 23 because it is a prime number, which provide more randomness
        }

        return hash;
    }

    // inserts a key-value pair into hash table
    // O(1)
    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    // gets the value of a specific key in hash table
    // O(1)
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];

        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }

            temp = temp.next;
        }

        return 0;
    }

    // prints all the keys in hash table
    public ArrayList<String> keys() {
        ArrayList<String> allKeys = new ArrayList<>();

        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }

        return allKeys;
    }
}
