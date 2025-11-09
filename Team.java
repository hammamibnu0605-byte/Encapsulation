package encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private List<Student> members = new ArrayList<>();

    // Tambahkan anggota
    public void addMember(Student s) {
        if (s == null) throw new IllegalArgumentException("Student tidak boleh null");
        members.add(s);
    }

    // Kembalikan salinan list (bukan referensi asli)
    public List<Student> getMembers() {
        return new ArrayList<>(members);
        // atau Collections.unmodifiableList(members); untuk versi read-only
    }

    public void printTeam() {
        System.out.println("Daftar anggota tim:");
        for (Student s : members) {
            System.out.println("- " + s.getName() + " (" + s.getScore() + ")");
        }
    }
}
