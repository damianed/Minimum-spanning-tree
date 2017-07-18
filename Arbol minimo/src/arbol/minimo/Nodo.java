/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.minimo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Nodo {
     private JLabel nodo;
     private boolean selected=false;
     private int numero;
     private boolean conectado=false;
     private List<Linea> lineas=new ArrayList<>(); 
     
    public Nodo(int numero){
        nodo = new JLabel(numero +"");
        nodo.setIcon (new javax.swing.ImageIcon(getClass().getResource("/arbol/minimo/nodo.png")));
        nodo.setSize(35, 35);
        nodo.setVisible(true);
        nodo.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        nodo.setHorizontalTextPosition(nodo.CENTER);
        this.numero = numero;
    }
   
    public JLabel getLabel(){
        return nodo;
    }
    
    public void setSelected(boolean a){
        selected = a;
        if(a){
          nodo.setIcon (new javax.swing.ImageIcon(getClass().getResource("/arbol/minimo/nodoRojo.png")));
        }else{
          nodo.setIcon (new javax.swing.ImageIcon(getClass().getResource("/arbol/minimo/nodo.png")));
        }
    }
    
    public boolean isSelected(){
        return selected;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setConectado(boolean con){
        this.conectado = con;
    }
    
    public boolean getConectado(){
        return this.conectado;
    }
    
    public void addLinea(Linea l){
        this.lineas.add(l);
    }
    
    public void remLinea(Linea l){
        this.lineas.remove(l);
    }
    
    public List getLineas(){
        return lineas;
    }
}
