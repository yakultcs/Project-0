public class Student {
    private String firstName;
    private String lastName;
    private String fullName;
    private String broncoId;
    private double grade;

    public Student(String firstName, String lastName, String broncoId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.broncoId = broncoId;
        fullName = firstName + " " + lastName;
        grade = -1;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String getBroncoId(){
        return broncoId;
    }
    public double getGrade(){
        return grade;
    }

    public String toString(){
        return String.format("SSSStudent: %s %s, Bronco Id: %s, Grade: %.2f", firstName, lastName, broncoId, grade);
    }

    public void setGrade(double newGrade){
        grade = newGrade;
    }
}
