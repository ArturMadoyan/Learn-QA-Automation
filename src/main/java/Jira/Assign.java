package Jira;

public class Assign {
    private Engineer assignTo;
    private Task task;

    public Assign(Engineer assignTo, Task task) {
        this.assignTo = assignTo;
        this.task = task;
    }

    public Engineer getAssignTo() {
        return assignTo;
    }

    public Task getTask() {
        return task;
    }

    @Override
    public String toString() {
        return String.format("%s,%s",assignTo,task);
    }
}
