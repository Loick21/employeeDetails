package com.testJE.employeeDetails;

import static org.junit.Assert.assertEquals;

import com.testJE.employeeDetails.Entity.Tree;
import com.testJE.employeeDetails.core.FileReader;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */

public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void baseTest() {
        List<String> data = FileReader.readInput("input.txt");
        String result = FileReader.readOutput("output.txt");
        int N = Integer.parseInt(data.get(0));
        data.remove(0);
        Tree tree = new Tree();
        tree.buildTree(N, data);
        assertEquals(result, tree.getLevel());
    }

    @Test
    public void testOne() {
        List<String> data = FileReader.readInput("input1.txt");
        String result = FileReader.readOutput("output1.txt");
        int N = Integer.parseInt(data.get(0));
        data.remove(0);
        Tree tree = new Tree();
        tree.buildTree(N, data);
        assertEquals(result, tree.getLevel());
    }

    @Test
    public void testTwo() {
        List<String> data = FileReader.readInput("input2.txt");
        String result = FileReader.readOutput("output2.txt");
        int N = Integer.parseInt(data.get(0));
        data.remove(0);
        Tree tree = new Tree();
        tree.buildTree(N, data);
        assertEquals(result, tree.getLevel());
    }

    @Test
    public void testThree() {
        List<String> data = FileReader.readInput("input3.txt");
        String result = FileReader.readOutput("output3.txt");
        int N = Integer.parseInt(data.get(0));
        data.remove(0);
        Tree tree = new Tree();
        tree.buildTree(N, data);
        assertEquals(result, tree.getLevel());
    }

    @Test
    public void testFour() {
        List<String> data = FileReader.readInput("input4.txt");
        String result = FileReader.readOutput("output4.txt");
        int N = Integer.parseInt(data.get(0));
        data.remove(0);
        Tree tree = new Tree();
        tree.buildTree(N, data);
        assertEquals(result, tree.getLevel());
    }

    @Test
    public void testFive() {
        List<String> data = FileReader.readInput("input5.txt");
        String result = FileReader.readOutput("output5.txt");
        int N = Integer.parseInt(data.get(0));
        data.remove(0);
        Tree tree = new Tree();
        tree.buildTree(N, data);
        assertEquals(result, tree.getLevel());
    }

    @Test
    public void testSix() {
        List<String> data = FileReader.readInput("input6.txt");
        String result = FileReader.readOutput("output6.txt");
        int N = Integer.parseInt(data.get(0));
        data.remove(0);
        Tree tree = new Tree();
        tree.buildTree(N, data);
        assertEquals(result, tree.getLevel());
    }

}
