/**
 *
 * @author Hitalo Novais
 */

public class CarroControl {

    
    public static void main(String[] args) {
        
        Carros c1 = new Carros("Fusca", 140, (float)1.4);
        Carros c2 = new Carros("Monza", 220, (float)2.0);
        Carros c3 = new Carros("Opala", 160, (float)1.8);
        Carros c4 = new Carros("Golf", 240, (float)2.0);
        
        System.out.println (c1.verModelo() + " - " + c1.acelerar(30)+  " KM/H" + " = " + c1.verDistancia() +  " metros.");
        desenharTrajeto(c1);
        System.out.println (c2.verModelo() + " - " + c2.acelerar(18)+  " KM/H" + " = " + c2.verDistancia() +  " metros.");
        desenharTrajeto(c2);
        System.out.println (c3.verModelo() + " - " + c3.acelerar(25)+  " KM/H" + " = " + c3.verDistancia() +  " metros.");
        desenharTrajeto(c3);
        System.out.println (c4.verModelo() + " - " + c4.acelerar(22)+  " KM/H" + " = " + c4.verDistancia() +  " metros.");
        desenharTrajeto(c4);
        
        
    }//Fechando Main
    
    public static void desenharTrajeto(Carros tmpCarro){
        String trajeto="";
        for(int i=0; i<tmpCarro.verDistancia(); i++){
        trajeto+="#";
    }
        System.out.println(trajeto);
    }
    
}//Fechando Class
