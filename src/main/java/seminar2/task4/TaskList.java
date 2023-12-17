package seminar2.task4;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void completeTask(Task task) {
        task.setCompleted(true);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}