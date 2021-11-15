package com.bridgelabz.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {

    private MyBinaryNode<K> root;

    /**
     * Method containing steps of insertion
     *
     * @param current node where the element is to be added
     * @param key     element to be added
     * @return root of the tree
     */

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<K>(key);
        }

        int compareResult = key.compareTo(current.key);

        if (compareResult == 0)
            return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);

        return current;
    }

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }


    /**
     * Method to implement search operation
     *
     * @param current node of tree
     * @param key     element to be searched
     * @return
     */
    private boolean searchRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return false;
        }
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) {
            return true;
        }
        return compareResult < 0 ? searchRecursively(current.left, key) : searchRecursively(current.right, key);
    }

    /**
     * Method to search for a key in binary search tree
     *
     * @param key element to be searched
     * @return
     */
    public boolean searchTree(K key) {
        return searchRecursively(root, key);
    }


    /**
     * @param current
     * @return
     */
    private int getSizeRecursively(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
    }


    /**
     * Method to get the number of elements in the tree
     *
     * @return sizeof tree
     */
    public int getSize() {
        return this.getSizeRecursively(root);
    }

    public void printBinaryTree() {
        System.out.println("My Tree: " + root);
    }

    @Override
    public String toString() {
        return "MyBinaryTree{" +
                "root=" + root +
                '}';
    }
}
