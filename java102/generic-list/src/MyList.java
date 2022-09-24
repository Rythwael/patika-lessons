import java.util.Arrays;

public class MyList<T> {
    private T[] list;
    int listSize=0;

    public MyList() {
        this.list = (T[]) new Object[10];
    }
    public MyList(int capacity){
        this.list = (T[]) new Object[10];
    }

    public int getCapacity(){
        return list.length;
    }
    public int size(){
        return listSize;
    }

    public void add(T value){
        if (listSize==getCapacity()){
            T[] tempList = (T[]) new Object[getCapacity()*2];
            for (int i=0;i<listSize;i++) {
                tempList[i] = list[i];
            }
            list = (T[]) new Object[tempList.length];
            for (int i=0;i<listSize;i++) {
                list[i]= tempList[i];
            }
        }
        list[listSize]=value;
        listSize++;
    }

    public T get(int index){
        if (index<0 || index>=getCapacity()){
            return null;
        }
        return list[index];
    }

    public void remove(int index){
        if (index<0 || index>=size()){
            System.out.println("null");
        }else {
            for (int i=index;i<size()-2;i++){
                list[i]=list[i+1];
            }
            list[size()-1]=null;
            listSize--;
        }
    }

    public void set(int index,T data){
        if (index<0 || index>=size()){
            System.out.println("null");
        }else {
            list[index] = data;
        }
    }

    public String toString(){
        T[] strArray = Arrays.copyOfRange(list,0,listSize);
        return Arrays.toString(strArray);
    }

    public int indexOf(T data){
        for (int i=0;i<=listSize;i++){
            if (list[i]==data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i=listSize-1;i>=0;i--){
            if (list[i]==data){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return listSize==0;
    }

    public T[] toArray(){
        T[] tempArray = Arrays.copyOfRange(list,0,listSize);
        return tempArray;
    }

    public void clear(){
        for (int i=0;i<listSize;i++){
            list[i]=null;
        }
        listSize=0;
    }


}
