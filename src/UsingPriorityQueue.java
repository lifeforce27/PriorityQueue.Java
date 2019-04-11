import java.util.Random;

//Author Jonathan Smart


public class UsingPriorityQueue {
	static Random rand = new Random();
	static String Word;
	static Patient[] PatientsList = new Patient[15];
	
	public static void main(String[] args) {

       USEQue();
    }
	
	
	public static void USEQue(){
	
		System.out.println("Welcome to the Emergency Room!");
		System.out.println("Please check in with the nurse and we will be with you as soon as we can\n");
		
		
		CheckIn();		
		Sort(PatientsList);
	    WaitingRoom();
					
		
}
	
	
  public static void CheckIn(){
	Patient mypatient1 = new Patient("Patient1",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[0] = mypatient1;	
	Patient mypatient2 = new Patient("Patient2",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[1] = mypatient2;	
	Patient mypatient3 = new Patient("Patient3",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[2] = mypatient3;	
	Patient mypatient4 = new Patient("Patient4",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[3] = mypatient4;	
	Patient mypatient5 = new Patient("Patient5",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[4] = mypatient5;	
	Patient mypatient6 = new Patient("Patient6",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[5] = mypatient6;	
	Patient mypatient7 = new Patient("Patient7",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[6] = mypatient7;	
	Patient mypatient8 = new Patient("Patient8",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[7] = mypatient8;	
	Patient mypatient9 = new Patient("Patient9",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[8] = mypatient9;	
	Patient mypatient10 = new Patient("Patient10",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[9] = mypatient10;	
	Patient mypatient11 = new Patient("Patient11",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[10] = mypatient11;	
	Patient mypatient12 = new Patient("Patient12",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[11] = mypatient12;	
	Patient mypatient13 = new Patient("Patient13",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[12] = mypatient13;	
	Patient mypatient14 = new Patient("Patient14",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[13] = mypatient14;	
	Patient mypatient15 = new Patient("Patient15",Injury(),Arrival(),Priorty(),Month(),day());
	PatientsList[14] = mypatient15;	
	
  }	

  
  static String Injury(){
	  int  n = rand.nextInt(10) + 1;
	  
	  if(n == 1)
	    Word = "car accident";
	  if(n == 2)
		    Word += " abdominal injuries";
	  if(n == 3)
		    Word = "Chest Pains";
	  if(n == 4)
		    Word = "Broken Bones and Sprains";
	  if(n == 5)
		    Word = "Upper Respiratory Infections";
	  if(n == 6)
		    Word = "Contusions and Cuts";
	  if(n == 7)
		    Word = "Back Pain";
	  if(n == 8)
		    Word = "Skin Infections";
	  if(n == 9)
		    Word = "Foreign Objects in the Body";
	  if(n == 10)
		    Word = "Headaches";
	  if(n == 11)
		    Word = "Sore throat";
	  if(n == 12)
		    Word = "heart attack";
	  if(n == 13)
		    Word = "fever";
	  if(n == 14)
		    Word = "Toothaches";
	  if(n == 15)
		    Word = " slips and falls";
	  
	return Word;

  }
  static int Arrival() {
	  int  n = rand.nextInt(60);
	return n;
	  
  }
  
  static int Priorty() {
	  int  n = rand.nextInt(20) + 1;
	return n;
	  
  }
  
  static void Sort(Patient[] arr)
  {
      int n = arr.length;
      for (int i = 0; i < n-1; i++)
          for (int j = 0; j < n-i-1; j++)
              if (arr[j].getArrival() > arr[j+1].getArrival())
              {
                  // swap temp and arr[i]
                  Patient temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
  }
  
  
  static int Month(){
	  int  n = rand.nextInt(12) + 1;
		return n;
	  
  }
  
  static int day(){
	  int  n = rand.nextInt(30) + 1;
		return n;
  }
  
  
 public static void WaitingRoom(){
	  int time_clock = 0;
	  boolean Now_Being_Served = false; 
	  ArrayHeap myheap = new ArrayHeap();
	  int Patient_holder; int count =0;
	  int Patient_ArrivalTime_holder;
	  
	  while(time_clock < 60) {
		  
		  if(time_clock %2 ==0)
			  Now_Being_Served = false; 
			  
			  
		  System.out.println("---------------------------------------------------");
		  System.out.println("The time is " + time_clock);
		  System.out.println("---------------------------------------------------");
		  
		  for(int i=0; i<15; i++)
			{
				if(PatientsList[i].getArrival() == time_clock)
		         {							         
					myheap.add(PatientsList[i].getPriority());
					
		         }
		    }
		  
		  if(time_clock ==0 || time_clock % 2 == 0) {
		         if(Now_Being_Served == false) {
		        	 Now_Being_Served = true;
		        	 
		        	 if(myheap.isEmpty()==false)
		        	 {      
		        		 Patient_holder = myheap.removeMin();
			          
			          for(int j=0; j<15;j++) 
						{		
							if(PatientsList[j].getPriority() == Patient_holder)
							{
								 System.out.println("---------------------------------------------------");
								 System.out.println("The doctor is now attending to this patient");
							     System.out.println("At time: " + time_clock +" " +"\n" +PatientsList[j].toString());
						      System.out.println("---------------------------------------------------");
						      break;
				            }
		          }
		        	 }
		    }
	  
	  
		  
	     } 
		  time_clock++;
      }
  }
}
  












