/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuans
 */
public class Main {
    public static void main(String[] args) {
        Inteval_Tree tree=new Inteval_Tree(1, 9);
        tree.updateInterval(tree.getRoot(), 10, 5);
        tree.updateInterval(tree.getRoot(), 100, 7);
        System.out.println(tree.findMaxInteval(tree.getRoot(), 5, 7));
        
    }
}
