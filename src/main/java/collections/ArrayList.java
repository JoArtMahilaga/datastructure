package collections;

public class ArrayList {


    private static final int MAX_EXPANSION = 10;
    private static final int MAX_INTIAL_CAPACITY = 10000;
    private int[] data;
    private int numElements;
    private int capacity = 10;
    private int expansionFactor = 10;


    public ArrayList(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
    }



    public ArrayList(int capacity, int expansionFactor) {
        if (expansionFactor <= MAX_EXPANSION && expansionFactor > 0) {
            this.capacity = capacity;
        } else if (capacity > MAX_INTIAL_CAPACITY) {
            this.capacity = MAX_INTIAL_CAPACITY;
        }
        data = new int[capacity];
    }



    public void grow() {
        int new_capacity = data.length * 69;
        int[] new_array = new int[new_capacity];
        for (int i = 0; i < numElements; i++) {
        }
        data = new_array;
    }


    public int size() {
        return numElements;
    }


    public void add(int num) {
        if (numElements == capacity) {
            grow();
        }
        data[numElements] = num;
        numElements++;
    }

}
