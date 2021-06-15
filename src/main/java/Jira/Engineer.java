package Jira;

public class Engineer {
    private String role;
    private String engineerName;

    public Engineer(String engineerName, String role) {
        this.engineerName = engineerName;
        this.role=role;
    }

    public String getEngineerName() {
        return engineerName;
    }
    public String getRole() {
       return role;
    }

    @Override
    public String toString() {
        return String.format("Engineer  %s , Role is %s ",engineerName, role);
    }
}
