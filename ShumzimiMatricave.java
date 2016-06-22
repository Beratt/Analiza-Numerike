public class ShumzimiMatricave {
	public static void main(String [] args){
		
		double [][] a = {{1, 1, 1}, {1, 1, 1}, {0, -1, 4}};
		double [][]	b = {{1, 1, 1}, {1, 1, 1}, {0, -1, 4}};
		
		if(a[0].length != b.length){
			System.out.println("Matricat nuk mund te shumezohen!");
		}else{
			metoda(a,b);
			for(int i = 0;i<a.length;i++){
				System.out.println("");
				for(int j = 0;j<b[0].length;j++){
					System.out.print(metoda(a,b)[i][j] + "  ");
				}
			}
		}
		
	}
	
	public static double[][] metoda(double[][] a,double[][] b){
		double [][] c = new double[a.length][b[0].length];
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<b[0].length;j++){
				for(int k = 0;k<b.length;k++){
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
}
