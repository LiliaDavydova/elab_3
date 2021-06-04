package com.epam.test.automation.java.practice3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    
        @Test
    public void testTask1PositiveTest1() {
        int[] array = {10, 5, 3, 4};
        int[] expectedArray = {4, 5, 3, 10};
        Assert.assertEquals(Main.task1(array), expectedArray, "Should return {4, 5, 3, 10}");
    }

    @Test
    public void testTask1PositiveTest2() {
        int[] array = {100, 2, 3, 4, 5};
        int[] expectedArray = {100, 4, 3, 2, 5};
        Assert.assertEquals(Main.task1(array), expectedArray, "Should return {100, 4, 3, 2, 5}");
    }

    @Test
    public void testTask1PositiveTest3() {
        int[] array = {100, 2, 3, 45, 33, 8, 4, 54};
        int[] expectedArray = {54, 4, 3, 45, 33, 8, 2, 100};
        Assert.assertEquals(Main.task1(array), expectedArray, "Should return {54, 4, 3, 45, 33, 8, 2, 100} ");
    }

    @Test
    public void testTask2PositiveTest1() {
        int[] array = {4, 100, 3, 4};
        Assert.assertEquals(Main.task2(array), 0, "Should return 0");
    }

    @Test
    public void testTask2PositiveTest2() {
        int[] array = {5, 50, 50, 4, 5};
        Assert.assertEquals(Main.task2(array), 1, "Should return 1");
    }

    @Test
    public void testTask2PositiveTest3() {
        int[] array = {5, 350, 350, 4, 350};
        Assert.assertEquals(Main.task2(array), 3, "Should return 3");
    }

    @Test
    public void testTask2PositiveTest4() {
        int[] array = {10, 10, 10, 10, 10};
        Assert.assertEquals(Main.task2(array), 4, "Should return 4");
    }

    @Test
    public void testTask3PositiveTest1() {
        int[][] array = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};
        int[][] expectedArray = {{2, 1, 1, 1}, {0, 7, 1, 1}, {0, 0, 3, 1}, {0, 0, 0, 5}};
        Assert.assertEquals(Main.task3(array), expectedArray, "Should return {{2, 1, 1, 1},  {0, 7, 1, 1},  {0, 0, 3, 1},  {0, 0, 0, 5}}");
    }
}