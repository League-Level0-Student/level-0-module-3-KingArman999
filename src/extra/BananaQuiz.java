//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import java.net.URI;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		// 2. if they say no,
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes�? or “no�?
		// show a pop up that says “You are bananas!�?
		String banana = JOptionPane.showInputDialog(null, "Do you like Bananas?");
		if (banana.equals("No")) {
			playVideo("https://www.youtube.com/watch?v=7fFSupGfZME");
		
		}
		else if (banana.equals("Yes")) ;{
			String hobby = JOptionPane.showInputDialog("What's your favorite hobby?");
			 JOptionPane.showMessageDialog(null, hobby + " is much better with bananas." );
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
