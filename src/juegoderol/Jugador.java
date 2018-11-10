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
public class Jugador {
    public String nombre;
    public int vida = 100;
    public int minPower;
    public int maxPower;
    
    public Jugador(String nombre, int min, int max){
        this.nombre = nombre;
        this.minPower = min;
        this.maxPower = max;
    }
    
    public void atacar(Jugador j1){
        Random aleatorio = new Random();
        int intensidad = this.minPower + aleatorio.nextInt(this.maxPower-this.minPower+1);
        System.out.println("Golpe con intensidad " + intensidad);
        j1.recibirAtaque(intensidad);
    }
    
    public void recibirAtaque(int intensidad){
        vida -= intensidad;
        if(this.vida >0){
            System.out.println("Al jugador " + this.nombre + " le queda " + this.vida + " de vida");
        }
        else {
            System.out.println("El jugador " + this.nombre + " murió");
        }
    }
    
    public boolean vive(){
        if(vida > 0){
            return true;
        }
        else return false;
    }
    
    
}
