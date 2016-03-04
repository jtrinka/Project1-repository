import javax.swing.JOptionPane;
//From Dave's Assignment 2
public class Footballnumber extends superid {
	
	private int footballnumber;
	
	public int footballnumbermethod(){
	
	
		 
		
		 
		 while (true){
		 //parseInt code from www.stackexchange.com
			 footballnumber=Integer.parseInt(JOptionPane.showInputDialog("Enter the Player Football Number"));
		 
		 if(footballnumber<=99)
			 
		 return(footballnumber);
		 
		 
		 
		 
			 
		 
		
		 }
		
		
		
	}
	
	@Override
	public int getNumber() {
			
			return(footballnumber);
			
		}
	
	

}
