import java.util.ArrayList;
public  class MyStackArrayList implements MyStackInterface {
    public ArrayList<Integer> arrayListStack = new ArrayList<>();

    @Override
    public void push(int item) {
        arrayListStack.add(item);
    }

    @Override
    public Integer pop() {
        boolean empty = arrayListStack.isEmpty();
        if (!empty) {
            int numberRemoved = arrayListStack.get(arrayListStack.size() - 1);
            arrayListStack.remove(arrayListStack.size() - 1);
            return numberRemoved;
        }
        return null;
    }

    @Override
    public Integer peek() {
        if (arrayListStack.size() > 0) {
            return arrayListStack.get(arrayListStack.size() - 1);
        } else {
            return null;
        }
    }
}