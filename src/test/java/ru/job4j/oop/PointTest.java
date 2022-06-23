package ru.job4j.oop;

import junit.framework.TestCase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

/**
 * @author alex_chashkov
 * @created 15/06/2022 - 17:50
 * @project job4j
 */
public class PointTest extends TestCase {

    public void testDistance3d() {
        Point point = new Point(1, 1, 1);
        Point pointTo = new Point(2, 6, 7);
        double dist = point.distance3d(pointTo);
        double expected = 7.874;
        assertThat(dist, closeTo(expected, 0.001));
    }
}