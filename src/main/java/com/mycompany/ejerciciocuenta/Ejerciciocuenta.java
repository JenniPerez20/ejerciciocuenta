

package com.mycompany.ejerciciocuenta;


public class Ejerciciocuenta {

    public static void main(String[] args) {
        
       
        public void consul_total(){  
            System.out.println("EL TOTAL ES: "+total);
        }
    
        public void abono(int abono){      
            total += abono;
            
            System.out.println("EL ABONO A SU CUENTA ES: "+abono);
        }
        
        public void debito(int debito){
            total -= debito;
            System.out.println("EL DEBITO A SU CUENTA ES:"+debito);
        }
    
    public static void main(String[] args) {
        cuen obj1 = new Cuen();           
        Cuen obj2 = new Cuen();            
            System.out.println("-------CUENTA NO.1-------");
            obj1.saldo=1500;
            obj1.consul_saldo();
            obj1.abono(500);
            obj1.debito(800);
            System.out.println("-------------------------");
            
            System.out.println("-------CUENTA NO.2-------");
            obj2.saldo=3000;
            obj2.consul_saldo();
            obj2.abono(500);
            obj2.debito(800);
            System.out.println("-------------------------");
        
    }
}
