package day04;

public class DataBlock {
    private String name;
    private String subject;
    private String GradeAndClass;
    private int lessons;

    public DataBlock(String name, String subject, String GradeAndClass, int lessons) {
        this.name = name;
        this.subject = subject;
        this.GradeAndClass = GradeAndClass;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }


    public String getGradeAndClass() {
        return GradeAndClass;
    }

    public int getLessons() {
        return lessons;
    }
}
