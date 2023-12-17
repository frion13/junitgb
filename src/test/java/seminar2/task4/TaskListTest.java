package seminar2.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskListTest {

    @Test
    void addTask() {
        TaskList taskList = new TaskList();
        Task task = new Task("Повторить ООП");
        taskList.addTask(task);
        assertTrue(taskList.getTasks().contains(task));
    }

    @Test
    void removeTask() {
        TaskList taskList = new TaskList();
        Task task = new Task("Повторить ООП");
        taskList.addTask(task);
        taskList.removeTask(task);
        assertFalse(taskList.getTasks().contains(task));

    }

    @Test
    void completeTask() {
        TaskList taskList = new TaskList();
        Task task = new Task("Повторить ООП");
        taskList.addTask(task);
        taskList.completeTask(task);
        assertTrue(task.isCompleted());
    }
}