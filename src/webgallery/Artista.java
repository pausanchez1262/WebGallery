/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario{

    private String informacionCurriculum;
    private String distinciones;
    private ArrayList<Obra> obra;
    
    public Artista(String nombre, String apellido, String informacionCurriculum, String distinciones) {
        super(nombre, apellido);
        this.informacionCurriculum = informacionCurriculum;
        this.distinciones = distinciones;
        this.obra = new ArrayList<>();
    }
    
    public void publicarObras(){
        
    }
    
}
