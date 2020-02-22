package section4;

import javax.swing.JOptionPane;

public class Game2 {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Narrator: Hello "+name+" and welcome to the arena!\nHere you will battle against your foe...");
	String foe=JOptionPane.showInputDialog("Narrator: What is your foe's name?");
	JOptionPane.showMessageDialog(null, "Narrator: Thank you!\n"+foe+", "+foe+", I'll have to remember that.");
	String Answer=JOptionPane.showInputDialog("Do you enter the arena?\nYes/No");
	if (Answer.equalsIgnoreCase("No")){
		JOptionPane.showMessageDialog(null, "Narrator: I guess you will need a weapon.");
		String type=JOptionPane.showInputDialog("Narrator: There are four types of weapons,\nMagic(Staffs, Wands, and Stones.)\nMelee(Swords, Hammers, and Spears)\nRange(Throwing Items and Guns)\nMisc.");
	if(type.equalsIgnoreCase("Magic")) {
		String M_W=JOptionPane.showInputDialog("Narrator: What magic weapon will you use?(Staffs, Wands, or Stones.");
	if (M_W.equalsIgnoreCase("Staffs")) {
		
	}
	}
	
	
	
	}else if(Answer.equalsIgnoreCase("Yes")) {
		
		
		
	}
	
	
	
	
	
}
}
