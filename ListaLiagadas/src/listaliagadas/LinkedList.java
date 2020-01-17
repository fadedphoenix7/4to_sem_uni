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
public class LinkedList {
    private Node firstNode;
    private Node lastNode;
    
    public LinkedList(Node node){
        firstNode = node;
        lastNode = node;
    }
    
    public void addNodeEnd(int number){
        Node newNode = new Node(number);
        lastNode.setNode(newNode);
        lastNode = newNode;
    }
    
    public void addNodeStart(int number){
        Node newNode = new Node(number);
        newNode.setNode(firstNode);
        firstNode = newNode;
    }
    
    public String toString(){
        Node nodo = firstNode;
        String text = "Head \n";
        while(nodo.getNode() != null){
            text = text + nodo.toString() + "\n";
            nodo = nodo.getNode();
        }
         text = text + nodo.toString() + "\n";
        return text;
        
    }
}
