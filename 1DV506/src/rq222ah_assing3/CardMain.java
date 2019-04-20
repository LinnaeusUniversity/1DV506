package rq222ah_assing3;


public class CardMain {

	public static void main(String[] args) {
		
				Deck aviator = new Deck ();
				
				aviator.shuffle(); 
				aviator.deal(); 
			    System.out.println("Number of cards left: "+ aviator.getDeckSize()); 
			    aviator.deal(); 
			    System.out.println("Number of cards left: "+aviator.getDeckSize());
			    aviator.reset(); 
			    aviator.shuffle(); 
			    System.out.println("Number of cards left: "+aviator.getDeckSize()); 
			    aviator.deal(10);
			    


			}

		}

