public class ObjectReferenceLab {

    public static void main(String[] args) {

        ScoreBox s1 = new ScoreBox(50);
        ScoreBox s2 = s1;
        ScoreBox s3 = new ScoreBox(100);

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        addBonus(s2, 10);
        System.out.println(s1.getScore());

        replaceLocally(s1);
        System.out.println(s1.getScore());

        ScoreBox s4 = createScoreBox(200);
        System.out.println(s4.getScore());

        System.out.println(s1==s4);
    }

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(99);
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }
}

class ScoreBox {

    private int score;

    ScoreBox(int score) {
        if (score>=0) {
            this.score = score;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score>=0) {
            this.score = score;
        }
    }
}