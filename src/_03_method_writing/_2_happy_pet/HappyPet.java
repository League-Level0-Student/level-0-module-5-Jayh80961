package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HappyPet {
	static String pet;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
			while(happinessLevel<20) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "feed", "play ball" }, null);
			
			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				cuddle();
			}
			if(task == 1) {
				feed();
			}
			if(task == 2) {
				playball();
			}
			
			}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void feed() {
		happinessLevel+=10;
		JOptionPane.showMessageDialog(null, "If you feed the "+ pet +" it is very happy.");
	}
	static void cuddle() {
		happinessLevel+=6;
		JOptionPane.showMessageDialog(null, "If you cuddle the "+ pet +" it will spin around.");
	}
	static void playball() {
		happinessLevel+=14;
		JOptionPane.showMessageDialog(null, "If you play ball with the "+ pet +" it will be very active.");
	}
}
