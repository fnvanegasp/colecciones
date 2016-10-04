/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.ArrayList; 

public class RegistroFamilia {
    private ArrayList<Familia> familias;
    
    public RegistroFamilia(){
    this.familias = new ArrayList<Familia>();
    }
    
    public boolean ingresarFamilia(Familia familia){
        boolean insercion = this.familias.add(familia);
        return insercion;
    }
    
        public void listarFamilias(){
        for(Familia familia : familias){
           familia.listarMiembros();
        }
    }
        
        public void consultarFamilia(String apellido){
            for(Familia familia : familias){
                if(familia.getApellido().equals(apellido)){
                    familia.listarMiembros();
                }
            }
        }
}
