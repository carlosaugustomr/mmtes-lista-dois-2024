
package Lista3;

public class Fucionario {
    public double dinheiro = 1000;
    public String nome = "Zumbi";
    public int ataque =1000;
    
    public Fucionario(double dinheiro) {
    	this.dinheiro= dinheiro;
    }
    


    public void getvida() {
    	
    	 dinheiro=1000;
    }
    public void perderVida(){
    	if(dinheiro<=0) {
    		dinheiro=0;
    	}else {
    dinheiro--;
    	}
    }
    public void umDeVida() {
    	if(dinheiro>=1000) {
    		dinheiro=1000;
    	}else{
    		    	
    	dinheiro++;
    	}
    }
}
    

