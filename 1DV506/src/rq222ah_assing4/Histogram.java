package rq222ah_assing4;
import java.io.*;
import java.util.*;

public class Histogram {
	public static void main(String[] args){	
	
		String path="C:\\Temp\\";
		String fileName="integers.dat";
		File f=new File(path+fileName);
	
		if(!f.exists() && !f.isFile()){
			try{ 
				newDirectory(path);
				newFile(fileName);

				Scanner sc=new Scanner(System.in);
				System.out.print("Number of integers in file: ");
				//user input
				int c =sc.nextInt();
				//printwriter open
				PrintWriter pw=new PrintWriter(f);
				//adds random numbers to file from 0-500
				createText(pw,c);

				pw.close();
				sc.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}

		try{  
			Scanner scan=new Scanner(f);
			ArrayList<String> List=new ArrayList<>();
			while(scan.hasNextLine()){
				List.add(scan.nextLine());
			}
			String[] fArr=new String[List.size()];
			for(int i=0; i<List.size(); i++){
				fArr[i]=List.get(i);
			}
			System.out.println("\nReading integers from file: "+f.getAbsolutePath());
			System.out.println("Number of integers in the interval [1,100]: "+integers(fArr));
			System.out.println("Others: "+(List.size()-integers(fArr)));	
			printHistogram(fArr);

			scan.close();

			deleteFile(path+fileName);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void newFile(String n) throws IOException{  
		File file = new File(n);  
		if(!file.exists()){  
			try {  
				file.createNewFile();  
			} 
			catch (IOException e) {  
				e.printStackTrace();  
			}  
		}  
	} 
	
	public static void newDirectory(String n) throws IOException{   
		File file = new File(n);  
		if(!file.exists()){  
			file.mkdirs();  
		}  
	}  

	public static void deleteFile(String filePath) throws IOException{  
		File file = new File(filePath);  	      
		if(!file.exists()){
			return;
		}
		if(file.isFile()){  
			file.delete();  
		}
		else if(file.isDirectory()){  
			File[] files = file.listFiles();  
			for(int i=0;i<files.length;i++){  
				deleteFile(filePath + "\\" + files[i]);  
			}  	          
			file.delete();  
		}  
	}  

	public static PrintWriter createText(PrintWriter pw, int num){
		Random rd=new Random();
		for(int i=0; i<num; i++){
			int d=rd.nextInt(500)+1;
			pw.println(d);
		}
		return pw;
	}

	public static int integers(String[] arr){
		int nIn=0;
		int a;
		for(int i=0; i<arr.length; i++){
			a=Integer.parseInt(arr[i]);
			if(a>=1 && a<=100){
				nIn++;
			}
		}
		return nIn;
	}
	
	public static String printStar(int num){
		String b="";
		while(num!=0){
			b=b+"*";
			num--;
		}
		return b;
	}
	
	public static void printHistogram(String[] arr){
		int[] HistogramArray=new int[10];
		for(int i=0; i<arr.length; i++){
			int a=Integer.parseInt(arr[i]);
			if(a>0 && a<=100){
				if(a<=10)
					HistogramArray [0]++;
				else if(a<=20)
					HistogramArray [1]++;
				else if(a<=30)
					HistogramArray [2]++;
				else if(a<=40)
					HistogramArray [3]++;
				else if(a<=50)
					HistogramArray [4]++;
				else if(a<=60)
					HistogramArray [5]++;
				else if(a<=70)
					HistogramArray [6]++;
				else if(a<=80)
					HistogramArray [7]++;
				else if(a<=90)
					HistogramArray [8]++;
				else
					HistogramArray [9]++;												
			}
		}
		System.out.println("Histogram");
		System.out.println("  1  - 10  | "+printStar(HistogramArray [0]));
		System.out.println("  11 - 20  | "+printStar(HistogramArray [1]));
		System.out.println("  21 - 30  | "+printStar(HistogramArray [2]));
		System.out.println("  31 - 40  | "+printStar(HistogramArray [3]));
		System.out.println("  41 - 50  | "+printStar(HistogramArray [4]));
		System.out.println("  51 - 60  | "+printStar(HistogramArray [5]));
		System.out.println("  61 - 70  | "+printStar(HistogramArray [6]));
		System.out.println("  71 - 80  | "+printStar(HistogramArray [7]));
		System.out.println("  81 - 90  | "+printStar(HistogramArray [8]));
		System.out.println("  91 - 100 | "+printStar(HistogramArray [9]));
	}
}