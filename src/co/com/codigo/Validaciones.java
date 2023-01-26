
package co.com.codigo;
import javax.swing.JOptionPane;

public class Validaciones {

    public Validaciones() {
    }
    
    public boolean validarNumero(String valor){
        boolean sw=true;
     
                if ("".equals(valor)){
                   JOptionPane.showMessageDialog(null, "ERROR, este campo es requerido!"); 
                    sw = false;  
                }else{
                    
                    try{   
                        if(Double.parseDouble(valor)<0){
                          JOptionPane.showMessageDialog(null, "ERROR, Solo numeros positivos!"); 
                          sw = false; 
                        }   
                    }catch(NumberFormatException e){ 
                        JOptionPane.showMessageDialog(null, "ERROR, solo se permiten datos numericos!");
                        sw = false;    
                    }
                }

        return sw;
        
    }
    
    public boolean validarNumeroconNegativo(String valor){
        boolean sw=true;
     
                if ("".equals(valor)){
                   JOptionPane.showMessageDialog(null, "ERROR, este campo es requerido!"); 
                    sw = false;  
                }else{
                    
                    try{   
                        
                        Double.parseDouble(valor);
                           
                    }catch(NumberFormatException e){ 
                        JOptionPane.showMessageDialog(null, "ERROR, solo se permiten datos numericos!");
                        sw = false;    
                    }
                }

        return sw;
        
    }
    
}
