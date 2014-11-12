
package main;

// objekt pro uložení obsahu formuláře

public class Formular {
    
    // statický seznam stavů osoby (pozor - musí mít obě stejné pořadí)
    // stavyM - pro muže, stavyZ - ty samé stavy, ale pro ženy
    String stavyM[]={"svobodný", "ženatý", "rozvedený", "vdovec"};
    String stavyZ[]={"svobodná", "vdaná", "rozvedená", "vdova"};
    
    // export definovaných stavů osoby (ze statického pole)
    public String[] getStavy(boolean muz) {
        if (muz)
            return (stavyM);
        else
            return (stavyZ);
    }
}
