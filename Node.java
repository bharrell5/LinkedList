/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brett
 */
public class Node {
   public String word;
   public int count;
   public Node next;
   
   public Node(String w)
   {
      // Make sure you convert the word to lower case and initialize count
      word = w;
      count = 1;
      next = null;
   }
    
   public String toString()
   {
       return String.format("%-11s    %3d", word, count);
   }
    
}
