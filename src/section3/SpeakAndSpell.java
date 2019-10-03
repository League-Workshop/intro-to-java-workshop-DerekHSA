package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Spell hippopotomonstrosesquipedaliophobia");
		// 2. Catch the user's answer in a String
		String Correct=JOptionPane.showInputDialog("Spell");
		// 3. If the user spelled the word correctly, speak "correct"
		if (Correct.equalsIgnoreCase("hippopotomonstrosesquipedaliophobia")) {
			speak("Correct");
		}
		else {
		// 4. Otherwise say "wrong"
			speak("Wrong");
		// 5. repeat the process for other words
			speak("Spell hippopotomonstrosesquipedaliophobia");
			String Correct1=JOptionPane.showInputDialog("Spell");
			if (Correct1.equalsIgnoreCase("hippopotomonstrosesquipedaliophobia")) {
				speak("Correct");
			}
			else {
				speak("Are you even listening?");
			}
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


