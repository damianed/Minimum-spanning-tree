
package arbol.minimo;

import java.awt.Color;
import java.awt.Graphics;


public class Linea{
    private Nodo inicio;
    private Nodo fin;
    private int distancia;
    private Color color= Color.BLACK;
    
    public Linea(int distancia, Nodo inicio, Nodo fin, Graphics g){
        this.distancia = distancia;
        this.inicio = inicio;
        this.fin = fin;
        inicio.addLinea(this);
        fin.addLinea(this);
       dibujar(g);
    }
    
    public void dibujar(Graphics g){
        int x1 = inicio.getLabel().getX()+inicio.getLabel().getWidth()/2;
        int y1 = inicio.getLabel().getY()+(inicio.getLabel().getHeight()/2)+25;
        int x2 = fin.getLabel().getX()+fin.getLabel().getWidth()/2;
        int y2 = fin.getLabel().getY()+(inicio.getLabel().getHeight()/2)+25;
      
        g.setColor(color);
        g.drawLine(x1,y1,x2,y2); 
        
        g.drawString(this.distancia+"", (x1+x2)/2, (y1+y2)/2);
    }
    
  
    
    public Nodo getInicio(){
        return inicio;
    }
    public Nodo getFin(){
        return fin;
    }
    public int getDistancia(){
        return distancia;
    }
    public void setDistancia(int dist){
        this.distancia = dist;
    }
    
    public boolean conectadoA(Nodo nodo){
        if(nodo==this.inicio || nodo==this.fin){
            return true;
        }else return false;
        
    }
    
    public void enRuta(boolean a){
        if(a) this.color=Color.BLUE;
        else this.color = Color.BLACK;
    }
    
    public boolean esRuta(){
        if(this.color == Color.BLUE) return true;
        else return false;
    }
}
