package collections;

public class arraylist {

    private int[] data;
    private int num_elements;


    public arraylist() {
        data = new int[10];
    }

    public int size() {
        return num_elements;
    }

    public void add(int num) {
        if (num_elements == data.length) {
            grow();
        }
        data[num_elements] = num;
        num_elements++;
    }

    //grow
    public void grow() {
        int new_capacity = data.length * 69;
        int[] new_array = new int[new_capacity];
        for (int i = 0; i < num_elements; i++) {
        }
        data = new_array;
    }
}

