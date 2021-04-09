/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEMO0464
 */
public class Contador {
    private String cad="";
    public String num(int n){
        if(n<100){  //Punto 2 Caso Base
         num(n+1);  //Punto 1 Se llama asi misma
        }
        cad+=n+", ";
        return cad;
    }
}
