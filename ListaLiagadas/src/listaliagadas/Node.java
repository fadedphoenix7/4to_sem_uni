/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaliagadas;

/**
 *
 * @author a18016332
 */
public class Node {
    private int number;
    private Node linkedNode;
    
    public Node(int number){
        this.number = number;
        linkedNode = null;
    }
    
    public Node getNode(){
        return linkedNode;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setNode(Node node){
        linkedNode = node;
    }
    
    public String toString(){
        return "Nodo: Numero:" + number;
    }
    
}
