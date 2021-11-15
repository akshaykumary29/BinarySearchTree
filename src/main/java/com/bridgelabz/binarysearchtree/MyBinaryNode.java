package com.bridgelabz.binarysearchtree;

/**
 * Each node has ;eft and right nodes.
 *
 * @param <K>
 */
public class MyBinaryNode<K extends Comparable<K>> {

    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    // create a constructor
    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    /**
     * Prints the nodes using StringBuilder
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("{" + "Key = ").append(key).append('}');

        if (left != null) {
            myNodeString.append("->").append(left);
        }
        if (right != null) {
            myNodeString.append("->").append(right);
        }
        return myNodeString.toString();
    }
}
