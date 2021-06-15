package Jira;

public class MainJira {
    public static void main(String[] args) {


        Engineer ashot = new Engineer("Ashot","QA");
        Task task = new Task("login","high","doing");
        System.out.println(task.toString());
        Task task1 =new Task("Login","High","done");
        Assign assign = new Assign(ashot,task1);
        System.out.println(assign.toString());

    }
}
