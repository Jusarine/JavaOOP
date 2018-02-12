package lesson3.text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 11.07.2016.
 */

/*
Создать  объект  класса Текст,  используя  классы  Предложение,  Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Text {

    private List<Sentence> text = new ArrayList<>();
    private String header;

    public Text(String header) {
        this.header = header;
    }

    public Text () {
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void printHeader() {

        System.out.println(getHeader().toUpperCase());
    }

    public void addSentence(List<Word> sentence) {

       text.add(new Sentence(sentence));
    }

    public void printText(List<Word> s1, List<Word> s2) {

        Sentence.printSentence(s1);
        Sentence.printSentence(s2);
    }

    @Override
    public String toString() {
        return "Text=" + text;
    }
}

