import java.util.*;

public class Student {
    private String id;
    private String name;
    private HashMap<String, Integer> marks = new HashMap<>(); // subject -> marks

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    // TODO: addSubjectMark(String subject, int mark)
    // - Overwrite if subject already exists
    // - Validate: 0 <= mark <= 100, else throw IllegalArgumentException
    public void addSubjectMark(String subject, int mark){
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: average() -> double
    // - Return average marks across all subjects (0 if no subjects)
    public double average(){
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: highestSubject() -> String (subject name)
    // - Return subject with highest mark (null if none)
    public String highestSubject(){
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: lowestSubject() -> String (subject name)
    // - Return subject with lowest mark (null if none)
    public String lowestSubject(){
        throw new UnsupportedOperationException("TODO");
    }

    public String getId(){ return id; }
    public String getName(){ return name; }
    public Map<String,Integer> getMarksView(){ return Collections.unmodifiableMap(marks); }
}
