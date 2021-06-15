package Jira;

import java.util.Date;

public class Task  {
   Date date = new Date();

    private String tasks;
    private String priorityLevel;
    private String status;



    public Task(String tasks, String priorityLevel, String status ) {
        this.tasks = tasks;
        this.priorityLevel = priorityLevel;
        this.status = status;

        System.out.println(date);


    }


    public String getTasks() {
        return tasks;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("Task is %s, Priority level is %s, Status is %s",tasks,priorityLevel,status);
    }
}
