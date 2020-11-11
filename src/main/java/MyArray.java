/**
 *
 */
public class MyArray {
    private
    int length = 0;
    static int def = 10;
    int[] NewArray;

    public
    /**
     * Метод, позволяющий узнать размер массива.
     * @return length - размер массива.
     */
    int getLength() {
        return length;
    }
    /**
     * Инициализация массива с заданным размером по умолчанию.
     */
    MyArray() {
        NewArray = new int[def];
        length = def;
    }
    /**
     * Инициализация массива, размер задается пользователем.
     * @param size - новый размер массива.
     */
    MyArray(int size) {
        length = size;
        NewArray = new int[length];
    }
    /**
     * Инициализация массива, размер и значение переменных задаются пользователем.
     * @param size - размер массива.
     * @param data - значение переменных.
     */
    MyArray(int size, int data) {
        length = size;
        NewArray = new int[length];
        for (int i=0; i<length; i++) {
            NewArray[i] = data;
        }
    }
    /**
     * Дабоваление элемента в конец массива.
     * @param data - новый элемент.
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
     * Добавление нового элемента на определенную позицию в массиве.
     * @param index - позиция элемента в массиве.
     * @param data - значение нового элемента.
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
     * Удаление элемента из массива.
     * @param index - индекс удаляемого элемента.
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
     * Извлечение элемента из массива по индексу.
     * @param index - индекс извлекаемого элемента.
     * @return res, где res = -1, если индекс - отрицательное число или больше размера массива.
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
     * Вывод массива.
     */
    void printArr() {
        for (int i=0; i < getLength(); i++)
            System.out.println(NewArray[i]);
    }
}
