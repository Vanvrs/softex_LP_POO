package getset;

import java.util.Scanner;

	
public class Futebol {
       private String nomeTime;
       public void setTime(String meuTime) {
    	   nomeTime = meuTime;
       }
       public String getTime() {
    	   return nomeTime;
       }
       public void mostraTime() {
    	   System.out.printf("Seu time do coração é %\n", getTime());
       }
 
public static void main(String[] args) {
    		String time;
    		Futebol torcida = new Futebol();
    		Scanner texto = new Scanner(System.in);
    		
    		System.out.println("Para qual time você torce? ");
    		time = texto.nextLine();
    		
    		torcida.setTime(time);
    		torcida.mostraTime();
}
}
