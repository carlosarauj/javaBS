import javax.swing.JOptionPane;

public class ativ01 {

  public static void main(String args []) {


   int[] vetor = new int[10];
   
   for(int i = 0; i < vetor.length; i++) {
	   vetor[i] = (int) (Math.random() * vetor.length);
	   System.out.println(vetor[i]);
   }
   

  } 

 }