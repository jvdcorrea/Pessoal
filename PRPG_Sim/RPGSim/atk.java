public class atk
{
    public static void main(){
        System.out.println();
        int danototal = 0;
        for (int i = 0; i < 10000; i++){
            int n = testcrit(5,5,1,"d8");
            danototal = danototal + n;
        }
        System.out.println("dano total (T 5) (STR 5) (LCK 1): " + danototal/10000+ "");
        danototal = 0;
        
        for (int i = 0; i < 10000; i++){
            int n = testcrit(5,5,5,"d8");
            danototal = danototal + n;
        }
        System.out.println("dano total (T 5) (STR 5) (LCK 5): " + danototal/10000+ "");
        danototal = 0;
        
        for (int i = 0; i < 10000; i++){
            int n = testcrit(5,9,1,"d8");
            danototal = danototal + n;
        }
        System.out.println("dano total (T 5) (STR 9) (LCK 1): " + danototal/10000+ "");
        
        
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
    public static int testcrit(int turnos, int str, int lck, String dado){
        int result = 0; //resultado
        int ncriticos = 0;
        for (int i = 0; i < turnos; i++){
            //int sorte = lck;
            int crit = 0;
            
            if(lck > 0){crit = roll("1d10"); lck--; }
            
            int rolagem = roll(""+str+dado)+str;
            if(crit == 1 || crit == 2){rolagem = rolagem*2; ncriticos++; /*System.out.println(lck);*/ }
            // 
            //System.out.println("roll " + i + " : " + rolagem);
            result = result+rolagem;
        }
        //System.out.println("numero de criticos: " + ncriticos);
        return result;
    }
}
