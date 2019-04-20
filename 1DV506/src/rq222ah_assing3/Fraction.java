package rq222ah_assing3;



public class Fraction {
	
		
		private int N ;
		private int D ;
		
		
		
		public Fraction (int numerator , int denominator ) {
			if (denominator != 0) {
			N = numerator ;
			D = denominator ;
			
			}
			else if (D == 0 ) 
				System.err.print("Denominator can not be Zero");
			
		      
			
		}
		
		public  int getNumerator () {
			
			return N ;
		}
		
		
		public int getDenominator () {
			
			return D ;
		}
		

		public String toString() {
			
			return String.format("%d/%d", N, D);
		}
		
		
		public boolean hasZeroDenominator() {
			return D == 0;
		}
		
		public boolean isNegative () {
			
			
			if (N < 0  && D < 0) 
				return false ;
			
			if (N < 0 || D < 0 ) 
				return true ;
			
			return false ;
				
		}

	     public void add (int x , int y ) {
			
			if( y!=0 && D == y) {
				
				int newD = y;
				int newN = N+x ;
				Fraction m = new Fraction(newN,newD);
				System.out.println(m.toString());
			
			}	 

			else  {
				int newD = D*y ;
				int newN = N * y + x * D;
				Fraction m = new Fraction(newN,newD);
				System.out.println(m.toString());
			}
	     }
	     public void subtract (int x , int y ) {
	 		
	 		if( y!=0 && D == y) {
	 			
	 			int newD = y;
	 			int newN = N-x ;
	 			Fraction m = new Fraction(newN,newD);
	 			System.out.println(m.toString());
	 		
	 		}	 

	 		else  {
	 			int newD = D*y ;
	 			int newN = N * y - x * D;
	 			Fraction m = new Fraction(newN,newD);
	 			System.out.println(m.toString());
	 		}
	      }
	     
	     public void multiply (int x , int y) {
	    	 
	    	 if (y != 0) {
	    		 int newD = y*D;
	  			int newN = N*x ;
	  			Fraction m = new Fraction(newN,newD);
	 			System.out.println(m.toString());
	    	 }
	    	 else 
	    		 System.err.println("Can not multiply when the denominator is zero");
	    		 
	    	 
	     }
	     
	    public void divide (int x , int y) {
	    	 
	    	 if (y != 0) {
	    		 int newD = D*x;
	  			int newN = N*y;
	  			Fraction m = new Fraction(newN,newD);
	 			System.out.println(m.toString());
	    	 }
	    	 else 
	    		 System.err.println("Can not multiply when the denominator is zero");
	     }
	    
		public boolean isEqualTo(int newN, int newD) {
			if ((D == newD)&&(N == newN)) {
				return true;
			}
			return false;
		}
	}

