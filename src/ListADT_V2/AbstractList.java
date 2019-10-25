package ListADT_V2;

public abstract class AbstractList implements ListInterface{

    int list[], size;

    public AbstractList(){
        list = new int[50];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < size) {
            for (; index < (size - 1); index++)
                list[index] = list[index + 1];
            list[index] = 0;
            size--;
        }
    }

    public int get(int index) {
        if (index > (size - 1) || index < 0)
            return -1;
        return list[index];
    }

    public boolean contains(int item) {
        for (int index = 0; index < size; index++)
            if (list[index] == item)
                return true;
        return false;
    }

    public String toString() {
        String lst = "";
        for (int index = 0; index < size - 1; index++)
            lst += list[index]+",";
        return "["+lst+list[size - 1]+"]";
    }
}