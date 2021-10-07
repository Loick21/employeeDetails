package com.testJE.employeeDetails.Entity;

import java.util.ArrayList;
import java.util.List;

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


/**
 * This class is the representation of the employees.
 * Each employee is identified by his key and a List of his lowers hierarchy
 */
public class Node {

    /**
     * Employee key
     */
    private String key;
    /**
     * lower hierarchical list of an employee
     */
    private List<Node> children = new ArrayList<>();

    /**
     * default constructor
     */
    public Node() {
    }

    /**
     * Constructor of a Node
     *
     * @param key
     * @see #key
     */
    public Node(String key) {
        this.key = key;
    }

    /**
     * this method allow to add a Node to the lower hierarchical list
     *
     * @param node
     * @see Node
     */
    public void addChild(Node node) {
        this.children.add(node);
    }

    /**
     * @return the key of the employee
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the lower hierarchical list
     */
    public List<Node> getChildren() {
        return children;
    }

}
