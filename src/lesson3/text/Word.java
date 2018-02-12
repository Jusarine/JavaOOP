package lesson3.text;

public class Word {

    private String letters;

    public String getLetters() {
        return letters;
    }

    public Word () {

    }

    public Word(String letters) {
        this.letters = letters;
    }

    @Override
    public String toString() {
        return letters;
    }
}
