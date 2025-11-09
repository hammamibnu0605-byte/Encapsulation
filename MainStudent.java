package encapsulation;  

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Fikri", 90);
        s1.printInfo();

        s1.addScore(5);    // tambah skor
        s1.printInfo();

        try {
            s1.reduceScore(200); // invalid
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
