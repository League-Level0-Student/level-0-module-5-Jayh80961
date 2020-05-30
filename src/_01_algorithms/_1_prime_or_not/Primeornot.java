package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Primeornot {
	
	public static void main(String[] args) {
	String bob = JOptionPane.showInputDialog("Type any number");
	int bobAsInt = Integer.parseInt(bob);
	for (int i=0;i< 1;i++){
		if(bobAsInt % 1 == 0 && bobAsInt % bobAsInt == 0) {
			JOptionPane.showMessageDialog(null, "It is a prime!!!");	
		}
		else {
			JOptionPane.showMessageDialog(null, "It is not prime!!!");	
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}