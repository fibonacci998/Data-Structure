/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuans
 */
public class Node {

    private Node leftNode;
    private Node rightNode;
    private int infor;
    private int left;
    private int right;

    public Node() {
    }

    public Node(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int getInfor() {
        return infor;
    }

    public void setInfor(int infor) {
        this.infor = infor;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }
    
}
