package OOP.Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo,float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);

        // if diff == 0 : means both have same marks
        // if diff < 0 : means o is bigger else o is smaller


        return diff;
    }
}
