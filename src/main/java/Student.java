import java.util.ArrayList;

public class Student {

    private ArrayList<Integer> grades;
    private String studentName;
    private long ID;

    public Student() {
        this.grades = new ArrayList<>();
    }


    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public String getName() {
        return studentName;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void addGrades(int grade) {
        grades.add(grade);
    }

    public boolean isEmpty() {
        return grades.size() == 0;
    }

    public int getGradeAverage() {
        int count = 0;
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
            count++;
        }
        return sum / count;
    }
}
