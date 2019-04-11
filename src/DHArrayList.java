

public class DHArrayList<E> implements BarebonesArrayList<E>
{
	private int size; // How many elements in the arrayList?
	private int capacity; // What is the size of the arrayList?
	private E[] myArray; // Array reference to the actual data
	private static final int INITITAL_CAPACITY = 20; // Default capacity

//constructor
	public DHArrayList()
	{
		this.capacity = INITITAL_CAPACITY; //Default capacity
		this.size = 0; //There is nothing at the begining
		myArray = (E[])new Object[this.capacity];
	}

	public DHArrayList(int capacity)
	{
		this.capacity = capacity;
		this.size = 0;
		myArray = (E[])new Object[this.capacity];
	}



	public void add (E a)
	{
		//this method adds an element to the end
		if(size<capacity) //This means there is space at the end
		{
			myArray[size] = a; //Insert the data
			size++;   //Update size
		}	 
		else
		{
			System.out.println("There isnt enough space to add!");
			System.out.println("Calling reallocate() method");
			this.reallocate(); //Calls reallocate and increases space
			this.add(a); //We can call this method again
		}
	}


	public void add (E a, int index)
	{
      //This add method adds the data at the specified index
	  //Chek if the index is valid
	  
	  if(index < 0 || index > size)
	  {
		  System.out.println("invalid index");
	      return;
	  }
	  else if (index == size)
	  {
		  //THis means we are insearting ath the end of the list
		  //so, just use the other method already implemented
		  this.add(a);
		  
	  }
	  else
	  {
		  //We have to shift some elemt to right 
		  //MAke sure there is space
		  
		  if(this.capacity == this.size)
		  {
			  this.reallocate();
	      }
		  
		  //move the data and insert
		  for(int i=size; i> index; i--)
		  {
			  this.myArray[i] = this.myArray[i-1];
			  
		  }
		  
		  //once shifting is done insert data at index
		  
		  this.myArray[index] = a;
		  size++; //Dont forget to update size.....IE # of elements in the list
		  
		  
	  }  
	  
	}


public E remove(int index)
	{
		//this method is going to delete and return the deleated value at index
		//Check if index is valid for removal
		
		if(index < 0 || index >= size)
		{
			System.out.println("Invald index! Cannot remove data ");
			return null;
		}
	      //Store deleted data in variabl sp it can be returned
		  
		  E temp = this.myArray[index];
		  
		  //use a loop to shift the elements one place ;left
		  
		  for(int i= index; i< size; i++)
		  {
			  this.myArray[i] = this.myArray[i+1];
			  
		  }
		  size--; //update size 
		  return temp; //return list
	}

	
	

	
	
	
	
	
	public E get(int index)
	{
	  //This elemetn returns the element at a givem index
	  
	  if(index < 0 || index >= size)
	  {
		  System.out.println("Invalid index");
		  return null;
	  }
	  
	  return this.myArray[index];
	}  


	public void set(int index, E a)
	{
		//This method updates the value at specified index
		if(index < 0 || index >= size)
		{
			System.out.println("Invalid index");
		  //return null;
		}
	     this.myArray[index] = a;  //Else update the value
	}


	public int getSize()
	{
	   return this.size;
	}     


	public int indexOF(E a)
	{
	   for(int i = 0; i < size; i++)
	   {
		   if(this.myArray[i].equals(a))
		   {
			   return i;
		   }
	   }
	   return -1;
	} 





	public void reallocate()
	{
		this.capacity *=2; //update the capacity to twice the original
		E[] temp = (E[])new Object[this.capacity]; // creates a new array

		//give new array old array values
		for(int i = 0; i < myArray.length; i++)
		{
			temp[i] = myArray[i];
		}
		//After copying ths is done update the reference
		this.myArray = temp; 

	}

public String toString()
{
	String S = "";
	//We populate S with elemetns of the list
	//iterate over list and add elemts to the string
	
	for(int i=0; i<size; i++)
	{
		S += myArray[i] + "," ;
	}
	
	return S;
}










}