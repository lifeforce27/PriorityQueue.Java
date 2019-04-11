import java.util.*;
//Author Jonathan Smart
public class ArrayHeap {

	private  DHArrayList<Integer>arrayHeap = new DHArrayList<Integer>();
	DHArrayList<Integer> priorities;
	int size = arrayHeap.getSize();
	
	private void siftUP() {
		int p = arrayHeap.getSize()-1; //position to sift up
		
		while(p !=0){
			
			int parent = (p-1) /2;
			if(valueAt(p) >= valueAt(parent))
			{
				//we are done break
				break;
			}
			else {
				//Do a swap
				Integer temp = arrayHeap.get(parent);
				arrayHeap.set(parent, arrayHeap.get(p));
				arrayHeap.set(p, temp);
				
				//move UP
				p = parent;
			}
		}
		
	}

/**
 * The siftDown method sifts down the elements at arrayHeap[0]
 * 
 */

	private void siftDown() {
		
		int p = 0; //position to sift down
//		int size = arrayHeap.getSize();
		
		while(2*p + 1 < size) {
			int leftChildPos = 2*p + 1;
			int rightChildPos = leftChildPos + 1;
			int minChildPos = leftChildPos;
			
			//is there a right child?
			if(rightChildPos < size) {
				//Which child is smaller
				if(valueAt(rightChildPos)< valueAt(leftChildPos))
				{
					minChildPos = rightChildPos;
				}
			}
			//If less than children we are done ,otherwise swap node with smaller child
		
			if(valueAt(p) <= valueAt(minChildPos)) {
				break;
			}
			else{
				//Do the swap
				Integer temp = arrayHeap.get(p);
				arrayHeap.set(p, arrayHeap.get(minChildPos));
				arrayHeap.set(minChildPos, temp);
								
			}
				//Go down to the child position
			
			p = minChildPos;
			
		}
			
		
		
	}


           /**
            * The add method adds a value to the heap
            */

     boolean add(int x) {
	//Add x at the end of the array list
    	 arrayHeap.add(x);
    	 
    	 //sift up
    	 siftUP();
    	 
    	 
    	 return true;
	
}

     
//    void ADDSSS(){
//    	priorities =  arrayHeap;
//    	 
//     }


/**
 * The remove method removes an item from the heap
 * 
 */
     
     
     public int removeMin() {
    	 
    	 if(isEmpty()) {
    		 String message = "Priorty que is empty";
    		 throw new RuntimeException(message);
    	 }
    	 else {
    		 int val = arrayHeap.get(0);
    		 
    		 //Replace root by last leaf
    		 int lastPos = arrayHeap.getSize()-1;
    		 arrayHeap.set(0, arrayHeap.get(lastPos));
    		 
    		 //Remove the last leaf
    		 arrayHeap.remove(arrayHeap.getSize()-1);
    		 siftDown();
    		 return val;
    	 }
    		 
    		 
     }
          
     /**
      * The isEmpty method checks if the heap is empty
      */
     
   public boolean isEmpty() {
	return arrayHeap.getSize() == 0;
   }  
     
/**
 * The valueAt method is a convience method      
 */
     
     private int valueAt(int pos) {
		return arrayHeap.get(pos);
    	 
     }
     
     
}




