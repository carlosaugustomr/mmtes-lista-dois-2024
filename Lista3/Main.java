package Lista3;

import java.util.ArrayList;

public interface Main {
     public static void main(String[]args) {

		    new Pobre();
		    ArrayList<Fucionario>fucionarios=new ArrayList<Fucionario>();
		   
		    fucionarios.add(new Gerente(1900));
		    fucionarios.add(new Gerente(1900));
		    fucionarios.add(new Gerente(12300));
		    fucionarios.add(new Gerente(1100));
		    fucionarios.add(new Gerente(1000));
		    

		    for(int i = 0; i <fucionarios.size();i++) {
		    	Fucionario fucionarioLocal = fucionarios.get(i);
		     if(i==1) {
		    	 fucionarioLocal.umDeVida();
		    	 fucionarioLocal.perderVida();
		    	 
		    	 System.out.println(fucionarioLocal.dinheiro);
		    }else {
		    	System.out.println(fucionarioLocal.dinheiro);
		    }
		    }		    	
	 }
    
}
