package com.testJE.employeeDetails.Entity;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Loick 21
 * Build an application which can show
 * the number of employees at each level of a company.
 * <p>
 * We use an N-Ary Tree to build our hierachy data Structure
 * <p>
 * And to compute the number of employees at each level,
 * we use the BFS algorithm
 **/

public class Tree {

    /**
     * tree is the dictionary of employees.<br/><br/>
     * We can access an employee's node, with his key.
     *
     * @see HashMap
     * @see Node
     */
    public HashMap<String, Node> tree;

    /**
     * MAX_LEVEL is the maximun length of the tree's level.
     *
     * @value 10
     */
    private final int MAX_LEVEL = 10;

    /**
     * Constructor of the Class tree <br/>
     * <p>
     * We initialize our dictionnary of Node
     *
     * @see
     */
    public Tree() {
        tree = new HashMap<>();
    }

    /**
     * This method build an N-Ary Tree.<br/>
     *
     * @param N   represent the number of employee in the company
     *            <br/>1 < N < 1000
     * @param tab represent a list of String. Each String has two employees A and B separed by a coma
     *            <br/> eg: { "5 3", "4 5 }
     */
    public void buildTree(int N, List<String> tab) {

        for (int i = 0; i < N - 1; i++) {

            String employeeRow[] = tab.get(i).split(" ");
            String A = employeeRow[0];
            String B = employeeRow[1];
            if (tree.containsKey(B)) {
                Node emplA = new Node(A);
                if (!tree.containsKey(A)) tree.put(A, emplA);
                tree.get(B).addChild(emplA);
            } else {
                Node emplB = new Node(B);
                Node emplA = new Node(A);
                emplB.addChild(emplA);
                if (!tree.containsKey(A)) tree.put(A, emplA);
                tree.put(B, emplB);
            }
        }

    }


    /**
     * We use the BFS (Breadth first search) algorithm, to compute the number of employees at each level.
     *
     * @return a string of length 10. Each digit of the
     * string is the number of employee in the hierachy of the company
     * <p>
     * <br/>
     * <br/>
     * @see #MAX_LEVEL
     * @see Queue
     * @see StringBuilder
     */
    public String getLevel() {

        StringBuilder level = new StringBuilder();

        Node root = tree.get("0");

        Queue<String> queue = new LinkedList<>();

        queue.offer(root.getKey());

        while (!queue.isEmpty()) {
            int len = queue.size();
            level.append(len + " ");
            for (int i = 0; i < len; i++) {
                String key = queue.poll();
                for (Node child : tree.get(key).getChildren()) {
                    queue.offer(child.getKey());
                }
            }
        }

        while (level.toString().trim().split(" ").length < MAX_LEVEL) {
            level.append(0 + " ");
        }

        return level.toString().trim();
    }


    /**
     * this method display an N-Ary Tree.
     * <p>
     * <br/>
     * Use the BFS to iterate through the tree.
     */
    public void showTree() {
        Node root = tree.get("0");
        Queue<String> queue = new LinkedList<>();
        queue.offer(root.getKey());
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                String key = queue.poll();
                System.out.print(key + " ");
                for (Node child : tree.get(key).getChildren()) {
                    queue.offer(child.getKey());
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }


}
