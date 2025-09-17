import java.util.*;

public class Gradebook {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        // TODO: Prevent duplicate IDs (case-sensitive). If duplicate, throw IllegalArgumentException.
        throw new UnsupportedOperationException("TODO");
    }

    public Student findById(String id){
        // TODO: Return student with matching id or null if not found
        throw new UnsupportedOperationException("TODO");
    }

    public double classAverage(){
        // TODO: Average of student averages (0 if empty)
        throw new UnsupportedOperationException("TODO");
    }

    public ArrayList<Student> topK(int k){
        // TODO: Return top-k by average (descending). If k > size, return all.
        throw new UnsupportedOperationException("TODO");
    }
}
