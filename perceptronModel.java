/*
*  
*  Author  : Rashid A. Aljohani
*  Advisor : Byoung Jik Lee
*  CS 549  : Topics in Artificial Intelligence
*  Homework #1
*  Thursday, September 1, 2016
*
*/

class perceptronModel{



public static void main(String args[]){   

    // init(String type, double weight0, double weight1, double coefficient, double threshold)
    new perceptronModel().init("NOR", 0.2, 0.9, 0.5, -2);

}



// MARK : returns input vlaue (fixed set)
int[] getInputWeight0(){
   return new int[] {0, 0, 1, 1};
}

int[] getInputWeight1(){
   return new int[] {0, 1, 0, 1};
}
int[] getInput(){
   return new int[] {0,0, 0,1, 1,0, 1,1};
}

// MARK : returns target set, depends on the type of the operation. 
int[] getTarget(String type){
   
   switch(type){
      case "OR"  : return new int[] {0, 1, 1, 1};
      case "AND" : return new int[] {0, 0, 0, 1};
      case "NOR" : return new int[] {1, 0, 0, 0};
   }

   return new int[4];
}

// MARK : returns true iff threshold is smaller
boolean isBigger(int input, double threshold){
   
   return (input < threshold) ? false : true;
}

// MARK : returns actal value
double prepareActual(int input, double weight){
   return input * weight;
}

int getActual(double var, double threshold){
   return ( var < threshold) ? 0 : 1;
}

// MARK : returns an updated weight
double updateWeight(int input, int target, int actual, double cofficient, double current){
   return current + ( cofficient * (target - actual) * input) ;
}

// MARK : returns true iff target set and actual set are equal
boolean isEqual(String type, int[] actualSet){
   
   int[] targetSet = new perceptronModel().getTarget(type);
  
   
   for(int i=0; i < targetSet.length; i++){
         if (targetSet[i] != actualSet[i]) return false;
   }

   return true;
}


// MARK : returns the results
void init(String type, double weight0, double weight1, double coefficient, double threshold){

   perceptronModel x = new perceptronModel();

   int inputWeight0[] = x.getInputWeight0();  // {0,0,1,1}
   int inputWeight1[] = x.getInputWeight1();  // {0,1,0,1}
   
   int targetSet[] = x.getTarget(type); // {0, 1, 1, 1}
   int itsDone[] = targetSet;
   int acualSet[] = new int[4];
   int counter = 0;
   

   while( !x.isEqual(type, acualSet) ){
   
      System.out.print("\n============   Epoch #" + counter + "   ============\n");

      for(int i=0; i < targetSet.length; i++){
   
         double var0 = x.prepareActual(inputWeight0[i], weight0);
         double var1 = x.prepareActual(inputWeight1[i], weight1);
         double addition = var0 + var1;
      
         // get the actual value
         acualSet[i] = x.getActual(addition, threshold);

         // update weights
         weight0 = x.updateWeight(inputWeight0[i], targetSet[i], acualSet[i], coefficient, weight0);
         weight1 = x.updateWeight(inputWeight1[i], targetSet[i], acualSet[i], coefficient, weight1);
      
     
      System.out.println("weights = (" + weight0 + ", " + weight1 + ")");

      }
      
      counter++;
            if(counter == 21) break;

   }
    
    if(x.isEqual(type, acualSet)){
     
     System.out.println("\n** Final Weights : (" + weight0 + ", " + weight1 + ")");
     System.out.println("\nTarget   Actual");
   
     for(int i=0; i < targetSet.length; i++)
      System.out.println("  " + targetSet[i] + "       " + acualSet[i]);
    
    }else{
         System.out.println("\nTarget   Actual");
         for(int i=0; i < targetSet.length; i++)
           System.out.println("  " + targetSet[i] + "       " + acualSet[i]);
    }
      
}
  
   
}
