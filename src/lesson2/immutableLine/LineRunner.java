package lesson2.immutableLine;

import java.util.List;

/**
 * Created by Tania on 05.07.2016.
 */
public class LineRunner {
    public static void main(String[] args) {

        List<Line> lineList = LineSolution.createList();
        LineSolution.allLineLength(lineList);
        LineSolution.maxLength(lineList);
    }
}
