package lesson2.immutableLine;

import lesson2.immutablePoint.Point;

/**
 * Created by Tania on 05.07.2016.
 */

/*
1. ������� ������ ������ �����.
2. ��������� ��������� ������ ���� �����.
3. ����� ����� ������� �����.
 */
public class Line {

    public final Point start;
    public final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {

        return start;
    }

    public Point getEnd() {
        return end;
    }
}
