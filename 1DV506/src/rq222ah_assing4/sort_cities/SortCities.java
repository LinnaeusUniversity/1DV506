package rq222ah_assing4.sort_cities;
import java.io.*;
import java.util.*;

public class SortCities {
	public static void main(String[] args) throws IOException{
		//file path
		String path="C:\\eclipse\\Java_courses\\1DV506\\bin\\Cities.txt";

		try{
			
			File f=new File(path);
			Scanner sc=new Scanner(f);
			int n=0;
			ArrayList<String> list=new ArrayList<>();
			//Scanning files using while-loop
			while(sc.hasNextLine()){
				list.add(sc.nextLine());
				n++;
			}
		
			City[] city=new City[n];
			for(int i=0; i<n; i++){
				city[i]=new City(list.get(i));
			}
			//Ordering cities zipcodes
			Arrays.sort(city);

			System.out.println("Reading cities from file: "+f.getAbsolutePath());
			System.out.println("Number of cities found: "+n + "\n");
			for(City e: city){
				System.out.println(e);
			}	
			sc.close();
		}

		catch(IOException o){
			o.printStackTrace();
		}

	}
}