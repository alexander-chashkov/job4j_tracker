package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

/**
 * @author alex_chashkov
 * @created 15/06/2022 - 17:50
 * @project job4j
 */
public class PointTest {

    @Test
    public void testDistance3d111to257then7dot874() {
        Point point = new Point(1, 1, 1);
        Point pointTo = new Point(2, 6, 7);
        double dist = point.distance3d(pointTo);
        double expected = 7.874;
        assertThat(dist, closeTo(expected, 0.001));
    }

    @Test
    public void testDistance3d111To256then6dot480() {
        Point point = new Point(1, 1, 1);
        Point pointTo = new Point(2, 5, 6);
        double dist = point.distance3d(pointTo);
        double expected = 6.480;
        assertThat(dist, closeTo(expected, 0.001));
    }

    @Test
    public void testDistance3d000to1000then10() {
        Point point = new Point(0, 0, 0);
        Point pointTo = new Point(10, 0, 0);
        double dist = point.distance3d(pointTo);
        double expected = 10.000;
        assertThat(dist, closeTo(expected, 0.001));
    }
}