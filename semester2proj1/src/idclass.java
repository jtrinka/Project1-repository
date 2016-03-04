import javax.swing.JOptionPane;
//From Dave Assignment 2
public class idclass extends superid {
	
	private static String name;
	
	
	
	public static String nameMethod(){
		
		
		
		// www.stackexchange.com
		
		try{
			name=JOptionPane.showInputDialog("Enter the initials of the person");
		    if (name.length() <= 2) {
		        
		    	
		    	
		    } else {
		    	
		        throw new Exception("'" + name + "' is longer than 20");
		        
		    }
		} catch(Exception e){
			idclass.nameMethod();
		    
		}
		return name;}
			
}
