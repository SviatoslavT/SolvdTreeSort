package com.company;

public class Main {

    public static void main(String[] args) {
        Main tree = new Main();
        int arr[] = {6, 4, 7, 2, 11};
        tree.treeing(arr);
        tree.inorderRec(tree.root);
    }
    class Node
    {
        int value;
        Node left, right;

        public Node(int item)
        {
            value = item;
            left = right = null;
        }
    }

    Node root;

    Node insertValue(Node root, int value)
    {
        if (root == null)
        {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertValue(root.left, value);
        else if (value > root.value)
            root.right = insertValue(root.right, value);

        return root;
    }

    void insert(int value)
    {
        root = insertValue(root, value);
    }

    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    void treeing(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            insert(arr[i]);
        }

    }

}
