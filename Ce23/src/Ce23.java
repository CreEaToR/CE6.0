import javax.swing.JOptionPane;


public class Ce23 {

	public static void main(String args[]){
		
		
		double cm = Double.parseDouble(JOptionPane.showInputDialog("Enter height in centimeters"));
		
		double inch = Math.round(cm*0.39);
		
		double feet = (inch/12);
		
		JOptionPane.showMessageDialog(null,inch + " in " + feet + " ft");
		
	}
	
	
}
