package ListADT_V2;

public class OrderedList extends AbstractList {

    public void add(int item){
        if (size != list.length) {
            sort();
            int index = 0;
            for (; index < size; index++)
                if (list[index] > item)
                    break;
            if (index == size){
                list[index] = item;
                size++;
                return;
            }
            else{
                int temp = list[index];
                list[index] = item;
                index++;
                size++;
                while (index < size) {
                    int value = list[index];
                    list[index] = temp;
                    temp = value;
                    index++;
                }
            }
        }
    }

    private void sort(){
            for (int index = 0; index < size; index++)
                for (int next_index = index + 1; next_index < size; next_index++)
                    if (list[index] >= list[next_index]){
                        int temp = list[index];
                        list[index] = list[next_index];
                        list[next_index] = temp;
                    }
    }

    public int indexOf(int item){
        if (size % 2 == 0 && size != 0){
            if (item <= list[(size/2)-1]) {
                for (int index = 0; index < size / 2; index++) {
                    if (item == list[index])
                        return index;
                }
            }
            else if(item >= list[size/2]){
                for (int index = size/2; index < size ; index++) {
                    if (item == list[index])
                        return index;
                }
            }
            else{
                return -1;
            }
        }
        else if(size % 2 == 1){
            if (item <= list[size/2]) {
                for (int index = 0; index <= size / 2; index++) {
                    if (item == list[index])
                        return index;
                }
            }
            else if(item >= list[(size/2)+1]){
                for (int index = size/2 + 1; index < size ; index++) {
                    if (item == list[index])
                        return index;
                }
            }
            else{
                return -1;
            }
        }
        return -1; // if size is 0 then we should return -1.
    }

    public static void main(String args[]){
        OrderedList o = new OrderedList();
        o.add(20);
        o.add(10);
        o.add(40);
        o.add(30);
        o.add(1);
        o.add(50);
        System.out.println(o);
        System.out.println(o.size());
        System.out.println(o.contains(50));
    }
}
