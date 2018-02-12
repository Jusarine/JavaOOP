package lesson3.text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 11.07.2016.
 */
public class TextRunner {

    public static void main(String[] args) {

        Text t = new Text("Thousand Foot Krutch");
        t.printHeader();

        List<Word> sentence1 = createSentence1();
        List<Word> sentence2 = createSentence2();

        t.addSentence(sentence1);
        t.addSentence(sentence2);

        t.printText(sentence1, sentence2);
    }

    public static List<Word> createSentence1() {
        List<Word> sentence1 = new ArrayList<>();
        Sentence.addWord(sentence1, "TFK");
        Sentence.addWord(sentence1, "is");
        Sentence.addWord(sentence1, "a");
        Sentence.addWord(sentence1, "Canadian");
        Sentence.addWord(sentence1, "rock");
        Sentence.addWord(sentence1, "band");
        Sentence.addWord(sentence1, "formed");
        Sentence.addWord(sentence1, "in");
        Sentence.addWord(sentence1, "1995");

        return sentence1;
    }

    public static List<Word> createSentence2() {
        List<Word> sentence2 = new ArrayList<>();
        Sentence.addWord(sentence2, "They");
        Sentence.addWord(sentence2, "have");
        Sentence.addWord(sentence2, "released");
        Sentence.addWord(sentence2, "eight");
        Sentence.addWord(sentence2, "albums");

        return sentence2;
    }
}
