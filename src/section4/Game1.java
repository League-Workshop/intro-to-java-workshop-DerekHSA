package section4;
import javax.swing.JOptionPane;

public class Game1 {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Chose your foe.");
	String Foe=JOptionPane.showInputDialog("Dragon(Easy)\nHydra(Medium)\nDragon Lord(Hard)\nWhat is the difference?");
	if(Foe.equalsIgnoreCase("Dragon")) {
		
	}else if(Foe.equalsIgnoreCase("Hydra")) {
		
	}else if(Foe.equalsIgnoreCase("Dragon Lord")) {
		
	}else if(Foe.equalsIgnoreCase("What is te difference?")) {
		
	}
}
}
