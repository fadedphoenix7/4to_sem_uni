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
public class ListaLiagadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node node = new Node(1);
       LinkedList list = new LinkedList(node);
       list.addNodeEnd(2);
       list.addNodeEnd(3);
       list.addNodeStart(1);
       list.addNodeStart(6);
       System.out.println(list.toString());
       
       
    }
    
}
