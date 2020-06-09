package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i=0;i<101;i++){
			System.out.println(i);
		}
		for (int z=100;z>0;z--) {
			System.out.println(z);
		}
		for (int j=2;j<101;j++){
			if(j % 2 == 0) {
			System.out.println(j);
			}
		}
		for (int x=0;x<101;x++){
			if(x % 2 != 0) {
			System.out.println(x);
			}
		}
		for (int h=1;h<501;h++){
			if(h % 2 == 0) {
			System.out.println(h);
			System.out.println("even");
			}
			else {
			System.out.println(h);
			System.out.println("odd");
			}
		}
		for (int x=0;x<778;x++){
			if(x % 7 == 0) {
			System.out.println(x);
			}
		}
		for (int b=2008;b<2021;b++){
			System.out.println("In " + b +", I was " + (2021-b));
			
		}
		for (int k = 0; k <= 3; ++k) {
			   for (int l = 1; l <=3; ++l) {
				   System.out.println(k +" "+ l);
			   }
			}
		int o = 1;
		for (int f = 0; f < 3; ++f) {
			   for (int q = 0; q <3; ++q) {
				   System.out.print(o + " ");
				   o++;
			   
			   }
			   System.out.println();
		}
		int w = 1;
		for (int d = 0; d < 10; ++d) {
			   for (int s = 0;s<10; ++s) {
				   System.out.print(w + " ");
				   w++;
			   
			   }
			   System.out.println();
		}
		for (int t = 0; t < 6; ++t) {
			   for (int y = 0; y <t+1; ++y) {
				   System.out.print("*" + " ");
			   
			   }
			   System.out.println();
		}
		
		
		
		
	}
}
