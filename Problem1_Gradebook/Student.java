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
        if (mark < 0 || mark > 100) throw new IllegalArgumentException("Invalid mark!");
        else marks.put(subject, mark);
        // throw new UnsupportedOperationException("TODO");
    }

    // TODO: average() -> double
    // - Return average marks across all subjects (0 if no subjects)
    public double average(){
        if (marks.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double mark : marks.values()) {
            sum += mark;
        }
        return sum / marks.size();
        // throw new UnsupportedOperationException("TODO");
    }

    // TODO: highestSubject() -> String (subject name)
    // - Return subject with highest mark (null if none)
    public String highestSubject(){
        if (marks.isEmpty()) return null;
        String topSubject = null;
        int topMark = -1;
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() > topMark) {
                topMark = entry.getValue();
                topSubject = entry.getKey();
            }
        }
        return topSubject;
        // throw new UnsupportedOperationException("null");
    }

    // TODO: lowestSubject() -> String (subject name)
    // - Return subject with lowest mark (null if none)
    public String lowestSubject(){
        if (marks.isEmpty()) return null;
        String lowSubject = null;
        int lowMark = 101;
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() < lowMark) {
                lowMark = entry.getValue();
                lowSubject = entry.getKey();
            }
        }
        return lowSubject;
        // throw new UnsupportedOperationException("TODO");
    }

    public String getId(){ return id; }
    public String getName(){ return name; }
    public Map<String,Integer> getMarksView(){ return Collections.unmodifiableMap(marks); }
}
