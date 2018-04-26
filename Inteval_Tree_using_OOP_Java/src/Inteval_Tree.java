
import java.util.ArrayDeque;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuans
 */
public class Inteval_Tree {

    private Node root;
    public Inteval_Tree() {
        root=new Node();
    }

    public Inteval_Tree(int left, int right) {
        root=new Node(left,right);
        Queue queue=new ArrayDeque();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node=(Node) queue.poll();
            int leftPos=node.getLeft();
            int rightPos=node.getRight();
            if (leftPos==rightPos){
                node.setLeftNode(null);
                node.setRightNode(null);
                continue;
            }   
            if (leftPos<rightPos){
                int midPos=(leftPos+rightPos)/2;
                Node leftNode=new Node(leftPos, midPos);
                Node rightNode=new Node(midPos+1,rightPos);
                node.setLeftNode(leftNode);
                node.setRightNode(rightNode);
                queue.add(leftNode);
                queue.add(rightNode);
            }
        }
    }
    
    public void updateInterval(Node node, int value,int pos){
        if (node==null) return;
        if (node.getLeft()>pos || node.getRight()<pos) return;
        if (node.getLeftNode()==null && node.getRightNode()==null){
            node.setInfor(value);
            return;
        }
        updateInterval(node.getLeftNode(), value, pos);
        updateInterval(node.getRightNode(), value, pos);
        Integer valueLeftNode=node.getLeftNode().getInfor();
        Integer valueRightNode=node.getRightNode().getInfor();
        if (valueLeftNode!=null) {
            node.setInfor(valueLeftNode);
        }
        if (valueRightNode!=null) {
            node.setInfor(Math.max(valueLeftNode, valueRightNode));
        }
    }
    
    public Integer findMaxInteval(Node node,int left,int right){
        if (node==null) return null;
        int max=node.getInfor();
        if (node.getLeft()<=left &&right<=node.getRight()){
            return max;
        }
        int getLeft=findMaxInteval(node.getLeftNode(), left, right);
        int getRight=findMaxInteval(node.getRightNode(), left, right);
        return max;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
}
