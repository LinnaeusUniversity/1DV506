package rq222ah_assing3;
public class FractionMain {

	public static void main(String[] args) {


				
				
				Fraction num = new Fraction (3,2);
				
				
				System.out.println(num.toString());
				if (num.isNegative()) 
					System.out.println("Negative");
				else 
					System.out.println(num.isNegative());
				num.add(1, 3);
				num.subtract(1, 3);
				num.multiply(1, 4);
				num.divide(1, 3);
				System.out.println(num.isEqualTo(3, 1));
				
			}

		}