package Java1DArrayPart2;

import java.util.Scanner;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
    	int myPosition =0;
    	while(true) {
    		if(game[myPosition]==0) {
    			myPosition++;
    		if(myPosition+leap > game.length+1)
    			return true;
    		if(myPosition >= game.length)
    			return true;
    		if(myPosition+leap < game.length) {
    			if(game[myPosition+leap]==0) {
    				myPosition = myPosition+leap;
    			}
    		}
    		}else {
    			if(myPosition+leap > game.length+1)
        			return true;
        		if(myPosition >= game.length)
        			return true;
        		break;
    		}
    	}
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
