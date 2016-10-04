/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Miembro m1 = new Miembro("Valeria", "Giraldo", 4, 1, "Hija");
        Miembro m2 = new Miembro("F", "G", 32, 0, "Padre");
        Familia f1 = new Familia("Giraldo");
        f1.ingresarMiembro(m1);
        f1.ingresarMiembro(m2);
        
        RegistroFamilia r = new RegistroFamilia();
        r.ingresarFamilia(f1);
        r.listarFamilias();
        r.consultarFamilia("Giraldo");
        f1.consultarMiembro("Valeria");
    }
    
}
