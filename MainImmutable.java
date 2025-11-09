package encapsulation; 
public class MainImmutable {
    public static void main(String[] args) {
        ImmutableStudent s1 = new ImmutableStudent("Azfa", 80);
        System.out.println(s1);

        ImmutableStudent s2 = s1.withAddedScore(10); // buat objek baru
        System.out.println(s2);

        System.out.println("Apakah objek sama? " + (s1 == s2)); // false
    }
}
