import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
public class Driver {
	
	
	public static void main(String[] args) {
     
		
		
		
		// reader and writer code from assignment 5 and www.stackexchange.com
		
		try //try catch statement for a reader and a writer
		{
			File names = new File("names.txt");
			 //creates a new file called file
		    BufferedReader br = new BufferedReader(new FileReader(names)); //creates a new buffered reader called br and has it read file using a filereader
		    String word2 = br.readLine(); //makes a string word2 and sets it equal to what br reads in
		    PrintWriter writer = new PrintWriter("writeme.txt"); //creates a new print writer called writer that will write into abc.txt
		    
		    
		    
		    
		    
		    
		    //From assignment 5
		    String[] wordarr = word2.split("[,]"); //creates a string array that splits the string word 2 with conditions

			for (int i = 0; i < wordarr.length; ++i) { //for loop to run until it has run the length of the array
			    System.out.println(wordarr[i]); //system out prints arr[i]
			    writer.println(wordarr[i]); //writer writes the arr[i] into writeme.txt
			   
			    String	arr[]= new String[6];
				
				
					String initials = idclass.nameMethod();
					arr[i] = initials;
					writer.println(arr[i]); //writer writes the arr[i] into writeme.txt
					
					
					int number[]= new int[6];
					
					Footballnumber num = new Footballnumber(); //From Dave assignment 2
					int playnumber = num.footballnumbermethod();
					
							number[i] = playnumber;
							writer.println(number[i]);
							
							
				}		    
		
		
		writer.close();
		br.close();
			
		}
		
			    
		
			 catch(Exception e) {
				 
				 System.out.println("No such file exists. Setting \"names\" File to standard names.txt file to avoid break");
				 
				 try //try catch statement for a reader and a writer
					{
						File names = new File("names.txt");
						 //creates a new file called file
					    BufferedReader br = new BufferedReader(new FileReader(names)); //creates a new buffered reader called br and has it read file using a filereader
					    String word2 = br.readLine(); //makes a string word2 and sets it equal to what br reads in
					    PrintWriter writer = new PrintWriter("writeme.txt"); //creates a new print writer called writer that will write into abc.txt
					    
					    
					    
					    
					    
					    
					    //test:
					    String[] wordarr = word2.split("[,]"); //creates a string array that splits the string word 2 with conditions

						for (int i = 0; i < wordarr.length; ++i) { //for loop to run until it has run the length of the array
						    System.out.println(wordarr[i]); //system out prints arr[i]
						    writer.println(wordarr[i]); //writer writes the arr[i] into writeme.txt
						   
						    String	arr[]= new String[6];
							
							
								String initials = idclass.nameMethod();
								arr[i] = initials;
								writer.println(arr[i]); //writer writes the arr[i] into writeme.txt
								
								
								int number[]= new int[6];
								
								Footballnumber num = new Footballnumber();
								int playnumber = num.footballnumbermethod();
								
										number[i] = playnumber;
										writer.println(number[i]);
										
										
							}		    
					
					
					writer.close();
					br.close();
						
					}
					
						    
					
						 catch(Exception e1) {
							 
							
							 
							 
							 
							 
							 
							 
							    e1.printStackTrace();
							}
				 
				 
				 
				 
				    e.printStackTrace();
				}
				
				  
				 }
			
			
	

			
			
		
		
	
	
	
	



	}


