package section4;
import java.util.Random;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Game1 {
public static void main(String[] args) {
	int D_H = 100;//Dragon Health
	int D_Attck = 0;//Dragon Attack
	int C_Attck = 0;//Character Attack
	int C_H = 100;//Character Health
	JOptionPane.showMessageDialog(null, "Chose your foe.");
	String Foe=JOptionPane.showInputDialog("Dragon(Easy)\nHydra(Medium)\nDragon Lord(Hard)");
	if(Foe.equalsIgnoreCase("Dragon")) {
		String Name=JOptionPane.showInputDialog(null, "This dragon shoudn't have messed with ____!");
		while (C_H > 0 && D_H > 0) {
			String Move=JOptionPane.showInputDialog("Choose move!\nAttack/Block/Evade");
			if(Move.equalsIgnoreCase("Attack")) {
				C_Attck = new Random().nextInt(30+1);
				D_H -= C_Attck;
				D_Attck = new Random().nextInt(40+1);
				C_H -= D_Attck;
			}if(Move.equalsIgnoreCase("Equal")) {
				if(C_H<=D_H) { D_H = C_H;}
				else if(C_H>=D_H) {C_H=D_H;}
			}
		if(Move.equalsIgnoreCase("Kill")) {
		C_H=100;
		D_H-=C_H;
		}
			if(Move.equalsIgnoreCase("Switch")) {
					int space1=D_H;
					int space2=C_H;
					C_H=space1;
					D_H=space2;
			}
			if(Move.equalsIgnoreCase("Evade")) {
					C_Attck = new Random().nextInt(100+1);
if (C_Attck>=51) {
	JOptionPane.showMessageDialog(null, "Attack evaded");
	C_Attck = new Random().nextInt(30+1);
	D_H -= C_Attck;
} else if (C_Attck<=50) {
	JOptionPane.showMessageDialog(null, "Attack not evaded");
	D_Attck = new Random().nextInt(40+1);
	C_H -= D_Attck;
}}if(Move.equalsIgnoreCase("Block")) {
	C_Attck = new Random().nextInt(100+1);
	if (C_Attck>=11) {
		JOptionPane.showMessageDialog(null, "Attack blocked");
}else if (C_Attck<=10) {
	JOptionPane.showMessageDialog(null, "Attack not blocked");
	D_Attck = new Random().nextInt(40+1);
	C_H -= D_Attck;
			}}
			if (C_H< 0) {
				JOptionPane.showMessageDialog(null, "GAME OVER");
			} else if (D_H <= (0)) {
				JOptionPane.showMessageDialog(null, "You Won\n1,000,000G gained");
			} else {
JOptionPane.showMessageDialog(null, Name+": "+C_H+"\nDragon: "+D_H);
			}
		}}else if(Foe.equalsIgnoreCase("Hydra")) {
			
			
		}else if(Foe.equalsIgnoreCase("Dragon Lord")) {
		
	}
}
	}
