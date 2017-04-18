/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaornekuygulamalar;

/**
 *
 * @author ramazan
 */
public class Kesir {
     int pay;
    int payda;
    
    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getPayda() {
        return payda;
    }

    public void setPayda(int payda) {
        if (payda==0) {
            payda=1;
        }
        this.payda = payda;
    }

    public Kesir(int pay, int payda) {
        setPay(pay);
        setPayda(payda);
    }
     int obebrecursive(int a,int b){
      
            if(a==b)  
              return a;  
            if (a>b)  
              return obebrecursive(a-b,b);  
            return obebrecursive(a,b-a);  

     /*     if(b==0)
            return a;
       else
            return okek(b,a%b);
     */}
    
 
    public void topla(Kesir k){

          
            int obeb = obebrecursive(k.payda, payda);
            k.pay *= payda/obeb;
            pay *= k.payda/obeb;
            pay += k.pay;
            payda = (k.payda*(payda/obeb ));


}
}
