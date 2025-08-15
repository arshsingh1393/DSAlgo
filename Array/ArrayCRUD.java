class B {
    public void hello() {
        Integer a = 10;
        System.out.println(a.toString());// toString fucntion is only in the object class
    }
}

class Array {
    // C- Creation of array
    int arr[];
    int size = 0;

    public Array(int capacity) {
        arr = new int[capacity];
    }

    public void insert(int a) {
        if (size == arr.length) {
            System.out.println("Cannot insert Elemnt");
            return;
        }
        arr[size++] = a;

    }

    public int delete(int index) {
        if (index > size) {
            System.out.println("Cannot delete Element");
            return -1;
        }
        int ele = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];

        }
        size--;
        return ele;
    }

    public void printarray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class ArrayCRUD {
    public static void main(String[] args) {
        Array a = new Array(5);

        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.printarray();
        System.out.println();
        System.out.println(a.size);
        a.delete(2);
        a.printarray();
        System.out.println();
        System.out.println(a.size);
        // System.out.println(a.get(3));

    }

}
