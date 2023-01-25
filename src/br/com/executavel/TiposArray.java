package br.com.executavel;

public class TiposArray {
	
	public static void main(String[] args) {
		
	/*	double[] notas = new double[4];
		
		notas[0] = 22;
		notas[1] = 23.6;
		notas[2] = 4;
		notas[3] = 60;
		
		for(int pos = 0; pos < notas.length; pos ++) {
			System.out.println("nota " + (pos + 1) + " = " + notas[pos]);
		}
		
		System.out.println("=================================================================================");
		
		String posicoes = JOptionPane.showInputDialog("quantas posições deve ter esse Array?");
		
		double[] nota2 = new double[Integer.parseInt(posicoes)];
		
		for(int pos2 = 0; pos2 < nota2.length; pos2 ++) {
			String valor = JOptionPane.showInputDialog("qual o valor da " + (pos2 + 1));
			nota2[pos2] = Double.valueOf(valor);
			System.out.println("nota " + (pos2 + 1) + " = " + nota2[pos2]);
		}
		*/
		String [][] list1 = new String[2][3];
		
		list1[0][0] = "jhonatan";
		list1[0][1] = "25";
		list1[0][2] = "jhonatanchaves@gmail.com";
		
		
		
		list1[1][0] = "thaisa";
		list1[1][1] = "22";
		list1[1][2] = "thaisa.c.jkgha@hotmail.com";
		
		System.out.println("================= valores da matrizz =================");
		for(int linha = 0; linha < list1.length; linha++) {
			
			for(int coluna = 0; coluna < list1[linha].length; coluna++) {
				System.out.println(list1[linha][coluna]);
			}
			System.out.println("=====================================");
		}
		
		
		String arraySplit = "jhonatan, 22, jhonatan@gmail.com, brasil";
		
		String[] list4 = arraySplit.split(",");
		
		for (int pos = 0; pos < list4.length; pos++) {
			System.out.println(list4[pos]);
		}
		
		
		
	}
	
	
	
	

}
