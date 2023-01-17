import java.util.ArrayList;

public class Student {

    long id;
    String name;
    ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
}
