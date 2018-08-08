/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jjsullivan
 */
public class List {
    private Node first;
    
    public void List()
    {
        first = null;
    }
    
    public boolean isEmpty()
    {
        if(first == null)
            return true;
        else
            return false;
    }
    
    public void updateList(String word)
    {
        //Check for empty or new first node
        if(isEmpty() || first.word.compareTo(word) > 0)
        {
            insertFirst(word);
            return;
        }
        
        //Check if word exists in list
        Node current = first;
        while(current != null && current.word.compareTo(word) < 0)
        {
            current = current.next;
        }
        
        //if word is found
        if(current != null && current.word.compareTo(word) == 0)
        {
            current.count++;
            return;
        }
        
        insertMiddle(word);
    }
    
    public void insertFirst(String word)
    {
        //Create a new Node
        Node newNode = new Node(word);
        newNode.next = first;
        first = newNode;
    }
    
    public void insertMiddle(String word)
    {
        Node newNode = new Node(word);
        Node previous = first;
        Node current = first.next;
        
        while(current != null && current.word.compareTo(word) < 0)
        {
            current = current.next;
            previous = previous.next;
        }
        
        previous.next = newNode;
        newNode.next = current;
        
    }
    
    public void displayList()
    {
        System.out.println("List (first --> last)");
        System.out.println("  Word         Count ");
        System.out.println("=====================");
        Node current = first;
        while(current != null)
        {
            System.out.println(current.toString());
            current = current.next;
        }
        System.out.println();
    }
    
}
