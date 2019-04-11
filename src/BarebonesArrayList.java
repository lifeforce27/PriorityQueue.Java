//Author: Jonathan Smart 
//This is the interface far an arrayList

public interface BarebonesArrayList<E> 
{
  public void add(E a); //This method adds element at the end of the list
  public void add(E a, int index); //Overloaded version, adds at index
  public E remove(int index); // Removes and returns the data at the index
  public E get(int index); // Removes the Object at Location index
  public void set(int index, E a); // Update the value at the index 
  public int getSize(); //Returns the total number of    
  public int indexOF(E a); // Searches and returns the index of Object   

}