/**
 * A class with the implementation of the functionality of an array.
 */
public class MyArray {
    private
    int length = 0;
    static int def = 10;
    int[] NewArray;

    public
    /**
     * Returns an array size.
     * @return length - size.
     */
    int getLength() {
        return length;
    }
    /**
     * Constructs an empty array with an initial capacity (def = 10).
     */
    MyArray() {
        NewArray = new int[def];
        length = def;
    }
    /**
     * Constructs an empty array with the specified initial size.
     * @param size - specified initial size.
     */
    MyArray(int size) {
        length = size;
        NewArray = new int[length];
    }
    /**
     * Constructs a container with size elements. Each element is a copy of data.
     * @param size - array's length.
     * @param data - element's value.
     */
    MyArray(int size, int data) {
        length = size;
        NewArray = new int[length];
        for (int i=0; i<length; i++) {
            NewArray[i] = data;
        }
    }
    /**
     * Appends the specified element to the end of this array.
     * @param data - new element's value.
     */
    void addEl(int data) {
        int newSize = getLength() + 1;
        int[] SecArray = new int[newSize];
        if (getLength() >= 0)
            System.arraycopy(NewArray, 0, SecArray, 0, getLength());

        SecArray[getLength()] = data;
        length = newSize;
        NewArray = SecArray;
    }
    /**
     * Inserts the specified element at the specified position in this array.
     * @param index - position.
     * @param data - value of the new element.
     */
    void indexAdd(int index, int data) {
        boolean flag = false;
        int newSize = getLength() + 1;
        int[] SecArray = new int[newSize];
        if ((getLength() > 1 && getLength() >= index) || (getLength() == 1 && index == 0)) {
            for (int i = 0; i < newSize; i++) {
                if (i == index) {
                    SecArray[i] = data;
                    flag = true;
                } else if (flag) {
                    SecArray[i] = NewArray[i - 1];
                } else {
                    SecArray[i] = NewArray[i];
                }

            }
        }
        else
            System.out.println("Error");

        length = newSize;
        NewArray = SecArray;
    }
    /**
     * Removes the element at the specified position in this array.
     * @param index - position of the element.
     */
    void deleteEl(int index) {
        boolean flag = false;
        int newSize = getLength() - 1;
        int[] SecArray = new int[newSize];
        if (getLength() >= 1 && getLength() > index) {
            for (int i = 0; i < newSize; i++) {
                if (i == index || flag) {
                    SecArray[i] = NewArray[i+1];
                    flag = true;
                }
                else {
                    SecArray[i] = NewArray[i];
                }
            }
        }
        else
            System.out.println("Error");
        length = newSize;
        NewArray = SecArray;
    }
    /**
     * Returns the element at the specified position in this array.
     * @param index - position of the element.
     * @return res, where res = -1, if position is less than 0 or more than array's size.
     */
    int getEl(int index) {
        int res = -1;
        if (index < 0 || index >= getLength())
            return res;
        for (int i =0; i < getLength(); i++)
            if (i == index) {
                res = NewArray[i];
                return res;
            }
        return res;
    }
    /**
     * Displays an array.
     */
    void printArr() {
        for (int i=0; i < getLength(); i++)
            System.out.println(NewArray[i]);
    }
}
