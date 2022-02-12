import java.util.Scanner;
import java.lang.Math;
public class main
{
    public static void main(){
        /*output*/double P = 0; //probability of summoning a unit
        /*input*/double orbs = 0; //x
        /*internal*/double median = 0; // m
        /*internal*/double mean = 0; // μ
        /*internal*/double FS = 0; //free summon percentage
        /*input*/double AR = 0; //appearance rate as stated on gamepedia banners
        /*input*/double CD = 0; //color distribution as stated on gamepedia banners
        /*input*/double merges = 0; // N // Merges desired
        /*internal*/double M = 0; //mean for merged unit.
        Scanner in = new Scanner(System.in);
        
        System.out.println("Number of orbs you want to invest:");
        orbs = in.nextDouble();
        
        System.out.println("Number of merges desired:");
        merges = in.nextDouble();
        
        System.out.println("Appearance rate as stated on Gamepedia banners:");
        AR = in.nextDouble()/100;
        
        System.out.println("Color distribution as stated on Gamepedia banners:");
        CD = in.nextDouble()/100;
        
        
        FS = AR*(1-Math.pow(1-CD,5));
        median = -4.05*Math.log(2)/Math.log(1-FS);
        mean = 1.37*median;
        M = mean * (merges+1);
        P = 1 - Math.exp(-Math.pow(0.71*orbs/median,1.07));
        
        
        System.out.println("Percentage: " + P*100 + "%");
        
        
    
    }
}
