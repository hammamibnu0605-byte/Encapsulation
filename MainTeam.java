package encapsulation;  

import java.util.List;   

public class MainTeam {
    public static void main(String[] args) {
        Student s1 = new Student("Hammam", 100);
        Student s2 = new Student("Hannan", 90);

        Team t = new Team();
        t.addMember(s1);
        t.addMember(s2);

        t.printTeam();

        List<Student> external = t.getMembers(); // sekarang sudah dikenali
        external.clear();

        System.out.println("Setelah clear list eksternal:");
        t.printTeam();
    }
}
