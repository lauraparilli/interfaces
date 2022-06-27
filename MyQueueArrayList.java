import java.util.ArrayList;
public class MyQueueArrayList implements MyQueueInterface{
    public ArrayList<Employee> arrayListQueue = new ArrayList<Employee>();

    @Override
    public void add(Employee item){
        arrayListQueue.add(item);
    }

    public Employee peek(){
        if(arrayListQueue.size() > 0){
            return arrayListQueue.get(0);
        }else {
            return null;
        }
    }
    public Employee poll(){
        if (arrayListQueue.size() >0){
            Employee employeeRemoved = arrayListQueue.get(0);
            arrayListQueue.remove(0);
            return employeeRemoved;
        }
        return null;
        }
}
