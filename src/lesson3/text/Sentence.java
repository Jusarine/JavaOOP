package lesson3.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

     private Word word;
     private List<Word> sentence = new ArrayList<>();


    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Sentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public Sentence () {

    }

    public static void addWord(List<Word> sentence, String letters){
        sentence.add(new Word(letters));
    }

    public static void printSentence(List<Word> sentence) {
        String s = "";
        for (Word word : sentence) {
            s = s + " " + word.toString();
        }
        System.out.println(s + ".");
    }

    @Override
    public String toString() {
        return "Sentence=" + sentence;
    }
}

