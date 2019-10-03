package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String If=JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(If.equalsIgnoreCase("yes")) {
			speak("You will rule the world");
		}
		else {
		// 3. Otherwise, wish them good luck washing dishes.
			speak("Good luck washing dishes");
		}
	}


static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

}