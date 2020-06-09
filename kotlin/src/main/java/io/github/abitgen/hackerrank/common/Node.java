package io.github.abitgen.hackerrank.common;

public class Node {
    public Node left, right;
    public final int data;

    public Node(int newData) {
        left = right = null;
        data = newData;
    }
}
