package org.example;
import java.util.Scanner;
import java.io.IOException;
import java.lang.String;
class Node {
    int item, height;
    Node left, right;
    Node(int d) {
        item = d;
        height = 1;
    }
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", height=" + height +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
class AVLTree {
    Node root;
    public int tree_Number1;
    public int tree_Number2;
    public int tree_Number3;
    public int tree_Number4;
    public int tree_Number5;
    public int tree_Number6;
    public int tree_Number7;
    public int tree_Number8;
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }
    int getBalanceFactor(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }
    Node insertNode(Node node, int item) {
        if (node == null)
            return (new Node(item));
        if (item < node.item)
            node.left = insertNode(node.left, item);
        else if (item > node.item)
            node.right = insertNode(node.right, item);
        else
            return node;
        node.height = 1 + max(height(node.left), height(node.right));
        int balanceFactor = getBalanceFactor(node);
        if (balanceFactor > 1) {
            if (item < node.left.item) {
                return rightRotate(node);
            } else if (item > node.left.item) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (balanceFactor < -1) {
            if (item > node.right.item) {
                return leftRotate(node);
            } else if (item < node.right.item) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    Node nodeWithMimumValue(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }
    Node deleteNode(Node root, int item) {
        if (root == null)
            return root;
        if (item < root.item)
            root.left = deleteNode(root.left, item);
        else if (item > root.item)
            root.right = deleteNode(root.right, item);
        else {
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                Node temp = nodeWithMimumValue(root.right);
                root.item = temp.item;
                root.right = deleteNode(root.right, temp.item);
            }
        }
        if (root == null)
            return root;
        root.height = max(height(root.left), height(root.right)) + 1;
        int balanceFactor = getBalanceFactor(root);
        if (balanceFactor > 1) {
            if (getBalanceFactor(root.left) >= 0) {
                return rightRotate(root);
            } else {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }
        if (balanceFactor < -1) {
            if (getBalanceFactor(root.right) <= 0) {
                return leftRotate(root);
            } else {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.item + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void printTree(Node currPtr, String indent, boolean last) {
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }
            System.out.println(currPtr.item);
            printTree(currPtr.left, indent, false);
            printTree(currPtr.right, indent, true);

        }
    }
    public static void main(String[] args) throws IOException {
        AVLTree tree = new AVLTree();
        Scanner TreeScanner = new Scanner(System.in);
        System.out.println("Enter your First Number:  ");
        int tree_Number1 = TreeScanner.nextInt();
        System.out.println("Enter your next Number:  ");
        int tree_Number2 = TreeScanner.nextInt();
        System.out.println("Enter your next Number:  ");
        int tree_Number3 = TreeScanner.nextInt();
        System.out.println("Enter your next Number:  ");
        int tree_Number4 = TreeScanner.nextInt();
        System.out.println("Enter your next Number:  ");
        int tree_Number5 = TreeScanner.nextInt();
        System.out.println("Enter your next Number:  ");
        int tree_Number6 = TreeScanner.nextInt();
        System.out.println("Enter your next Number:  ");
        int tree_Number7 = TreeScanner.nextInt();
        System.out.println("Enter your next Number:  ");
        int tree_Number8 = TreeScanner.nextInt();
        System.out.println("");
        System.out.println("User Numbers: " + tree_Number1 + ", " + tree_Number2 + ", " + tree_Number3 + ", " + tree_Number4 + ", " + tree_Number5 + ", " + tree_Number6 + ", " + tree_Number7 + ", " + tree_Number8);
        System.out.println("");
        System.out.println("Tree Below: ");
        System.out.println("");
        tree.root = tree.insertNode(tree.root, tree_Number1);
        tree.root = tree.insertNode(tree.root, tree_Number2);
        tree.root = tree.insertNode(tree.root, tree_Number3);
        tree.root = tree.insertNode(tree.root, tree_Number4);
        tree.root = tree.insertNode(tree.root, tree_Number5);
        tree.root = tree.insertNode(tree.root, tree_Number6);
        tree.root = tree.insertNode(tree.root, tree_Number7);
        tree.root = tree.insertNode(tree.root, tree_Number8);
        tree.printTree(tree.root, "", true);
        tree.root = tree.deleteNode(tree.root, tree_Number6);
        System.out.println("After Delete: ");
        tree.printTree(tree.root, "", true);
        TreeScanner.close();
    }
}