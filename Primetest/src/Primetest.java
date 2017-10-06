public class Primetest {
	static int threshold = 1000;
	
	public static void main(String[] args) {
		
		
		primtest(threshold);
		collatz(7);
		
		
		
	}
	
	
	private static void collatz(int i){
		System.out.println();
		System.out.println("Collatzfolge von "+i+":");
			int n = i;   // hier wird die Hochzählvariable 
						// nach n kopiert, damit diese durch 
						//folgenden Algorithmus nicht überschrieben wird
			System.out.print(n +": "); // Ausgabe der berechneten Collatz-Startzahl
		
			do{							// Beginn des Collatz Algorithmus...
				if(n%2==0){
					n=n/2;}
				else{n=3*n+1;}
			
			System.out.print(n +" ");} //und Ausgabe
			while(n>1);  				// ..solange n >1
			System.out.println();
		 }

	
	private static boolean prime(int number){
		
		boolean isPrime = true;
		
		for(int i=2; i<=number/2&&isPrime==true; i++){
			if(number%i==0){
				isPrime = false;
			}
			
		}
		return isPrime;
	}
	
    public static void primtest(int threshold){
    	int counter = 0;
    	System.out.println("Primzahlen von 2 bis "+threshold+":");
          int number = 2;
    	  while(number<=threshold){	 	
    				
    		  
    		  
    			if(prime(number)){
    				System.out.print(number+" ");
    				counter++;
    				if(counter%20==0){System.out.println();}
    			}
    		 
    			number++;
    			
    			}
    		}
    	
    }