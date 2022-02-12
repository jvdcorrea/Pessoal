import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Simulations
{
   public static void main (String args[]) {
       Scanner in = new Scanner(System.in);
       
	   for (int i = 0; i < 3; i++){
		   System.out.println(i);
	   }
	   
	   
	   
	   String command = "";
       boolean w = true;
       while (w){
           command = in.nextLine();
           if (command.equals("ice rapier")){
               System.out.println("Quantas Ice Rapiers?");
               iceRapier(in.nextInt());
            }
           else if (command.equals("quit") || command.equals("end") || command.equals("q")){
               w = false;
            }
           else if (command.equals("necro army")){
               System.out.println("Numero de esqueletos e CA do inimigo");
               necroArmy(in.nextInt(),in.nextInt());
            }
           else if (command.equals("help")){
               System.out.println("Commands:\nice rapier\nnecro army\ndamage\n");
            }
		   else if (command.equals("Damage")){
			   
		   }
        }
       
       
    }
   
   public static void iceRapier(int qtdd){
       int qtddI = qtdd;
       int dano = 0;
       int danoTotal = 0;
       int vezes = 0;
       int vezesTotal = 0;
       
       
       while ( qtdd > 0 ){
           int d100 = roll("1d100");
           vezes++; vezesTotal++;
           if (d100 < 20){
               System.out.println("Quebrou. Atacou "+vezes+" vezes e causou "+dano+" de dano");
               vezes = 0;
               dano = 0;
               qtdd--;
            }
           else if (d100 <= 30){
               dano += 10;
               danoTotal += 10;
            }
           else if (d100 <= 40){
               dano += 15;
               danoTotal += 15;
            }
           else if (d100 <= 50){
               dano += 20;
               danoTotal += 20;
            }
           else if (d100 <= 60){
               dano += 30;
               danoTotal += 30;
            }
           else if (d100 <= 70){
               dano += 40;
               danoTotal += 40;
            }
           else if (d100 <= 80){
               dano += 50;
               danoTotal += 50;
            }
           else if (d100 <= 90){
               dano += 60;
               danoTotal += 60;
            }
           else if (d100 <= 99){
               dano += 70;
               danoTotal += 70;
            }
            else if (d100 == 100){
               dano += 80;
               danoTotal += 80;
               System.out.print("*");
           }
           else{System.out.println("Erro: d100 deu mais que 100 loko");}
        }
       System.out.println("\n"+qtddI+" Ice rapiers causaram "+danoTotal+" de dano");
       int mediad = danoTotal/qtddI;
       int mediav = vezesTotal/qtddI;
       int mediadv = mediad/mediav;
       System.out.println("Media de dano: "+mediad);
       System.out.println("Média de vezes: "+mediav);
       System.out.println("Vai causar "+mediadv+" de dano " +mediav+" vezes e então quebrar.");
    }
   public static void necroArmy(int nEsq, int CA){
       int acertos = 0;
       int danoTotal = 0;
       int criticos = 0;
       System.out.println("------Acertos------");
       for (int i = 0; i < nEsq; i++){
           int x = roll("1d20")+4;
           if (x >= CA){
               acertos++;
            }
           if (x-4 == 20){
               criticos++;
            }
           System.out.print(x+" ");
        }
       System.out.println("\n------Danos------"); 
       for (int i = 0; i < acertos; i++){
           int y = roll("1d6")+8;
           danoTotal += y;
           System.out.print(y+" ");
        }
       System.out.println("\n------Criticos(Dado Extra)------");
       for (int i = 0; i < criticos; i++){
           int z = roll("1d6");
           danoTotal += z;
           System.out.print(z+" ");
        }
       System.out.println("\n------Resultados------");
       System.out.println("Acertos: " + acertos);
       System.out.println("Criticos: " + criticos);
       System.out.println("Dano Total: " + danoTotal);
    }
    
    
    
   public static int roll(String s){
       int kd = s.indexOf("d");
       int dados = Integer.parseInt(s.substring(0,kd));
       int lados = Integer.parseInt(s.substring(kd+1,s.length()));
       int resultado = 0;
       for (int i = 0; i < dados; i++){
          resultado = resultado + (int)(Math.random()*lados+1);
       }
       return resultado;
    }
	
	public static int roll(String s, int vantagens){
		int result = -9999;
		for (int i = 0; i < vantagens; i++){
			int x = roll(s);
			if (x > result){result = x;}
		}
		return result
	}
	
	public static int damage(int CA, int numeroDeRolls, int d20sPorAcerto, String dano){
		for (int i = 0; i < numeroDeRolls; i++){
			
		}
		return CA;
	}
	
	
}













