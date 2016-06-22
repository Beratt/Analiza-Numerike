import javax.swing.*;
public class PageRank{
	
	static String s = JOptionPane.showInputDialog("Tregoni numrin pikave(kulmeve) te grafit: ");
	static int numriPikave = new Integer(s).intValue();
	static int[][] vektori = new int[numriPikave][numriPikave];
	static double [][] vektoriFinal = new double[numriPikave][numriPikave];
	
	public static void main(String[] args){	
		String s3 = JOptionPane.showInputDialog("Numri i lidhjeve mes pikave: ");
		int t1 = new Integer(s3).intValue();
		
		for(int i = 0;i<t1;i ++){
			String pikaPare = JOptionPane.showInputDialog("Lidhni piken numer: ");
			String pikaDyte = JOptionPane.showInputDialog("me piken numer: ");
			int pika1 = new Integer(pikaPare).intValue();
			int pika2 = new Integer(pikaDyte).intValue();
			vektori[pika1][pika2]++;		
		}
		
		for(int i = 0;i<numriPikave;i++){
			for(int j = 0;j<numriPikave;j++){
				int l = shumaERreshtit(i);
				if(l == 0){
					l = 1;
				}
				vektoriFinal[i][j] = vektori[i][j]*(90.0/l) + 2;
				System.out.print(vektoriFinal[i][j] + "      ");
				if(j == numriPikave-1){
					System.out.println();
				}
			}
		}	
		
  	}
	
	public static int shumaERreshtit(int x){
		int rezultati = 0;
		for(int i = 0;i<numriPikave;i++){
			rezultati = rezultati + vektori[x][i];
		}
		return rezultati;
	}
}
