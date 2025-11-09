package encapsulation; 

public final class ImmutableStudent {
    private final String name;
    private final int score;

    public ImmutableStudent(String name, int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score harus antara 0 dan 100");
        }
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Menghasilkan objek baru dengan skor ditambah delta
    public ImmutableStudent withAddedScore(int delta) {
        int newScore = this.score + delta;
        if (newScore < 0 || newScore > 100) {
            throw new IllegalArgumentException("Skor baru harus antara 0 dan 100");
        }
        return new ImmutableStudent(this.name, newScore);
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }
}
