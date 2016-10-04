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


public class Familia {

    private String apellido;
    private ArrayList<Miembro> miembros;

    public Familia(String apellido) {
        this.apellido = apellido;
        this.miembros = new ArrayList<Miembro>();
    }
    
    public boolean ingresarMiembro(Miembro miembro){
        boolean insercion = this.miembros.add(miembro);
        return insercion;
    }
    
    public void listarMiembros(){
        for(Miembro m : this.miembros){
            System.out.println(m);
        }
    }
    
        public void consultarMiembro(String nombre){
            for(Miembro miembro : miembros){
                if(miembro.getApellido().equals(apellido)){
                    System.out.println(miembro.toString());
                }
            }
        }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
