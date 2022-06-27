import java.util.Arrays;
public class MyStack implements MyStackInterface {

    public int[] stack = new int[0];

    @Override

    // Creates Stack push() method with arrays. Accepts the parameter 'item'
    // that refers to the element to be pushed into the array.
    public void push(int item){
        int[] newArray = new int[stack.length+1];
        newArray[stack.length] = item;

        for(int i=0; i<stack.length; i++){
            newArray[i] = stack[i];
        }
        stack= newArray;
    }
    @Override
    // Stack pop() method with arrays. Pop the top element of the stack (the
    // last integer of the list) and removes it from the same.
    public Integer pop() {
        if (stack.length > 0) {
            int numberRemoved = stack[stack.length - 1];
            int[] newArray = new int[stack.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = stack[i];
            }
            stack = newArray;
            return numberRemoved;
        } else {
            return null; // Case where the stack is already empty
        }
    }

    // Stack peek() method with arrays. Returns the integer at the top
    // of the stack (the last of the list) or null if the stack is empty
    public Integer peek(){
        if(stack.length > 0){
            return stack[stack.length-1];
        } else{
            return null;
        }
    }
}
