import java.util.Arrays;

public class MyQueue implements MyQueueInterface{

    public Employee[] queue;

    public MyQueue() {
        this.queue = new Employee[0];
    }

    @Override
    public void add(Employee item) {
        Employee[] newArray = new Employee[queue.length + 1];
        newArray[queue.length] = item;
        for(int i = 0; i < queue.length; i++) {
            newArray[i] = queue[i];
        }
        queue = newArray;
    }

    @Override
    public Employee peek() {
        if(queue.length > 0) {
            return queue[0];
        }
        return null;
    }

    @Override
    public Employee poll() {
        if(queue.length > 0) {
            Employee valueToReturn = queue[0];
            queue = Arrays.copyOfRange(queue, 1, queue.length);
            return valueToReturn;
        }
        return null;
    }
}
