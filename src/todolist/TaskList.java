package todolist;

import java.util.ArrayList;
import java.util.List;
public class TaskList {
    List<String> mylist;
    public TaskList() {
        mylist = new ArrayList<>();
    }
    public List<String> get_list(){
        return mylist;
    }
    public void add_task(String task){
        mylist.add(task);
    }
}
