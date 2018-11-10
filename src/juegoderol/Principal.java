/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderol;
import java.util.Random;
/**
 *
 * @author caromuscari
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Juan", 2,20);
        Jugador j2 = new Jugador("martin", 5,18);
        
        System.out.println("-------Comienzo de Juego de Rol-------");
        
        juego(j1,j2);
        
        if(j1.vive()){
            System.out.println("Ganó el Jugador: " + j1.nombre);
        }
        else {
            System.out.println("Ganó el Jugador: " + j2.nombre);
        }
    }
    
    private static void juego(Jugador j1, Jugador j2){
        Jugador turno, enEspera, aux;
        Random alea = new Random();
        
        if(alea.nextInt(2) == 0) {
            turno = j1;
            enEspera = j2;
        }
        else {
            turno = j2;
            enEspera = j1;
        }
        
        while(j1.vive()&& j2.vive()){
            System.out.println("-------Turno de " + turno.nombre + "-------");
            
            turno.atacar(enEspera);
            
            aux = turno;
            turno = enEspera;
            enEspera = aux;
        }
        
        System.out.println("-------Fin del juego-------");
    }
    
}
