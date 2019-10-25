package ListADT_V2;

public class List extends AbstractList {

    /*public List(){
        super();
    }*/

    public void add(int item) {
        list[size++] = item;
    }

    public int indexOf(int item) {
        for (int index = 0; index < size; index++)
            if (list[index] == item)
                return index;
        return -1;
    }
}
