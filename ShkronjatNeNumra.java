import javax.swing.*;

public class ShkronjatNeNumra {

	public static void main(String[] args) {
		String [][] shkronjat = new String [3][3];
		char [][] karakteret = new char [3][3];
		int [][] numrat = new int[3][3];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				shkronjat[i][j] = JOptionPane.showInputDialog("Shkronja ");
				karakteret[i][j] = shkronjat[i][j].charAt(0);
			}
		}
		
		for(int i = 0; i < 3; i++){
			System.out.println("");
			for(int j = 0; j < 3; j++){
				numrat[i][j] = (int) (karakteret[i][j] + 10);
				System.out.print(numrat[i][j] + "  ");
			}
		}
	}

}
