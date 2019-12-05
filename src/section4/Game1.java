package section4;
import javax.swing.JOptionPane;

public class Game1 {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Chose your foe.");
	String Foe=JOptionPane.showInputDialog("Dragon(Easy)\nHydra(Medium)\nDragon Lord(Hard)");
	if(Foe.equalsIgnoreCase("Dragon")) {
		String Name=JOptionPane.showInputDialog(null, "This dragon shoudn't have messed with ____!");
		
	}else if(Foe.equalsIgnoreCase("Hydra")) {
		
	}else if(Foe.equalsIgnoreCase("Dragon Lord")) {
		
	}
}
}
