package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "The Heros go to defeat the dragon that has been\nterrorizing San Elijo Hills.\nDefeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		int L_H = 100;//
		int S_H = 1;//
		int O_H = 100;//
		int N_H = 100;
		int D_H = 100;//
		int P_Attck = 0;
		int D_Attck = 0;
		while (L_H > 0 && D_H > 0 && O_H > 0 && S_H > 0 && N_H > 0) {
			String Character=JOptionPane.showInputDialog("Choose your fighter!\nNaruto\nSans\nLink\nOne-Punch Man");
			if (Character.equalsIgnoreCase("Sans")) {
				String This_Or_That = JOptionPane.showInputDialog(null, "Do you attack the dragon?\nBones/Ghaster Blaster/Teleport?");
				if (This_Or_That.equalsIgnoreCase("Bones")) {
					P_Attck = new Random().nextInt(26);
					D_H -= P_Attck;
				}
				if (This_Or_That.equalsIgnoreCase("Ghaster Blaster")) {
					P_Attck = new Random().nextInt(76);
					D_H -= P_Attck;
				}
				if (This_Or_That.equalsIgnoreCase("Teleport")) {
					S_H += D_Attck;
				}D_Attck = new Random().nextInt(36);
				S_H -= D_Attck;}
			if (Character.equalsIgnoreCase("One-Punch Man")) {
				String This_Or_That = JOptionPane.showInputDialog(null,"");
				if (This_Or_That.equalsIgnoreCase("Punch")) {
					P_Attck = (100);
					D_H -= P_Attck;
				}D_Attck = new Random().nextInt(36);
				O_H -= D_Attck;}
			if (Character.equalsIgnoreCase("Link")) {
			String This_Or_That = JOptionPane.showInputDialog(null, "Do you attack the dragon?\nYell/Hit/Slash/Eat?");
			if (This_Or_That.equalsIgnoreCase("Yell")) {
				P_Attck = new Random().nextInt(11);
				D_H -= P_Attck;
			}
			if (This_Or_That.equalsIgnoreCase("Hit")) {
				P_Attck = new Random().nextInt(26);
				D_H -= P_Attck;
			}
			if (This_Or_That.equalsIgnoreCase("Slash")) {
				P_Attck = new Random().nextInt(51);
				D_H -= P_Attck;
			}
			if (This_Or_That.equalsIgnoreCase("Eat")) {
				P_Attck = new Random().nextInt(101);
				L_H += P_Attck;
			}
			D_Attck = new Random().nextInt(36);
			L_H -= D_Attck;}
			if (Character.equalsIgnoreCase("Naruto")) {
				String This_Or_That = JOptionPane.showInputDialog(null, "Do you attack the dragon?\nShadow Clone/Resengan/Rice Ball?");
				if (This_Or_That.equalsIgnoreCase("Shadow Clone")) {
					P_Attck = new Random().nextInt(101);
					D_H -= P_Attck;
				}
				if (This_Or_That.equalsIgnoreCase("Resengan")) {
					P_Attck = new Random().nextInt(51);
					D_H -= P_Attck;
				}
				if (This_Or_That.equalsIgnoreCase("Rice Ball")) {
					P_Attck = (20);
					N_H += P_Attck;
				}
				D_Attck = new Random().nextInt(36);
				N_H -= D_Attck;}
			
			
			if (L_H < 0 && D_H < 0 && O_H < 0 && S_H < 0 && N_H < 0) {
				JOptionPane.showMessageDialog(null, "GAME OVER");
			} else if (D_H <= (0)) {
				JOptionPane.showMessageDialog(null, "You Won\n1,000,000G gained");
			} else {
JOptionPane.showMessageDialog(null, "Naruto's Health: "+N_H+"\nSans's Health: "+S_H+"\nLink's Health: "+L_H+"\nOne-Punch Man's Health: "+O_H+"\nDragon Health: "+D_H+"\nDamage Taken: "+D_Attck+"\nDamage Dealt/Healed:"+P_Attck);
			}
		}
	}
}
