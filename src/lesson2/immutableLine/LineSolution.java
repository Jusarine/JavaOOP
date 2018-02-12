package lesson2.immutableLine;

import lesson2.immutablePoint.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 06.07.2016.
 */
public class LineSolution {

    public static double lineLength(Line line){

        return Math.sqrt(Math.pow(line.getEnd().getX() - line.getStart().getX(), 2) + Math.pow(line.getEnd().getY() - line.getStart().getY(), 2));
    }

    public static double allLineLength(List<Line> lineList){
        double sum = 0;

        for (Line line : lineList) {
            sum += lineLength(line);
        }
        return sum;
    }

    public static List<Line> createList(){

        List<Line> lineList = new ArrayList<>();

        lineList.add(new Line(new Point(2, 15), new Point(4, 10)));
        lineList.add(new Line(new Point(1, 13), new Point(7, 24)));
        lineList.add(new Line(new Point(5, 18), new Point(12, 25)));

        return lineList;
    }

    public static double maxLength(List<Line> lineList){
        double max = lineLength(lineList.get(0));

        for (Line line : lineList) {
            if (lineLength(line) > max) {
                max = lineLength(line);
            }
        }
        return max;
    }
}
