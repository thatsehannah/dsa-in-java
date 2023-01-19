package data_structures.hash_tables;

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
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.print("{" + temp.key + "= " + temp.value + "} => ");
                temp = temp.next;
            }
        }
    }

    // hash function that will be used to get the address of the key in the array
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash += (asciiValue * 23) % dataMap.length; // chose the number 23 because it is a prime number, which provide more randomness
        }

        return hash;
    }
}
