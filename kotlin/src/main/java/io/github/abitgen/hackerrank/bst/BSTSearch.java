package io.github.abitgen.hackerrank.bst;

import io.github.abitgen.hackerrank.common.Node;

public class BSTSearch {

    private static int isPresent(Node root, int val) {
        if(root!=null) {

            if ( val < root.data)
                return isPresent(root.left, val);
            else if (root.data == val)
                return 1;
            else
                return isPresent(root.right, val);
        }else return 0;
    }

    public static void main(String[] args) {

        Node root = new Node(14);
        root.left = new Node(10);
        root.right = new Node(16);

        root.left.left = new Node(9);
        root.left.right = new Node(12);

        root.right.left = new Node(15);
        root.right.right = new Node(17);

        System.out.println(isPresent(root, 9));
        System.out.println(isPresent(root, 7));

    }
}
