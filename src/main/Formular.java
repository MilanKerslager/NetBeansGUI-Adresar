/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Administrator
 */
public class Formular {
    
    String stavyM[]={"svobodný", "ženatý", "rozvedený", "vdovec"};
    String stavyZ[]={"svobodná", "vdaná", "rozvedená", "vdova"};
    
    public String[] getStavy(boolean muz) {
        if (muz)
            return (stavyM);
        else
            return (stavyZ);
    }
}
