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
public class WebGallery {
    private ArrayList<Usuario> usuario;
    private Obra listaObras;
    
    public WebGallery(Usuario usuario){
        this.usuario = new ArrayList<>();
        this.listaObras = listaObras;
    }
    
    public Obra getObra(){
        return listaObras;
    }
    
    public void setObra(Obra listaObras){
        this.listaObras = listaObras;
    }
    
    public void registrarUsuarios(){
        
    }
    
    public void consultarColeccion(){
        
    }
    
    public void calcularSumaValorObras(){
        
    }
}
