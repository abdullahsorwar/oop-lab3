import java.util.*;

public class Gradebook {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        // TODO: Prevent duplicate IDs (case-sensitive). If duplicate, throw IllegalArgumentException.
        for (Student student : students) {
            if (student.getId().equals(s.getId())) {
                throw new IllegalArgumentException("Duplicate ID!");
            }
        }
        students.add(s);
        // throw new UnsupportedOperationException("TODO");
    }

    public Student findById(String id){
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
        // TODO: Return student with matching id or null if not found
        // throw new UnsupportedOperationException("TODO");
    }

    public double classAverage(){
        if (students.isEmpty()) return 0.0;
        double sum = 0.0;
        for (Student student : students) {
            sum += student.average();
        }
        return sum / students.size();
        // TODO: Average of student averages (0 if empty)
        // throw new UnsupportedOperationException("TODO");
    }

    public ArrayList<Student> topK(int k){
        ArrayList<Student> sorted = new ArrayList<>(students);
        sorted.sort((a, b) -> Double.compare(b.average(), a.average())); // descending
        if (k > sorted.size()) return sorted;
        return new ArrayList<>(sorted.subList(0, k));
        // TODO: Return top-k by average (descending). If k > size, return all.
        // throw new UnsupportedOperationException("TODO");
    }
}
