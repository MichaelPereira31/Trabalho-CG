/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

/**
 *
 * @author michael
 */
public class JoglFrame implements GLEventListener {

    @Override
    public void init(GLAutoDrawable glad) {
    }

    @Override
    public void dispose(GLAutoDrawable glad) {
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin(GL2.GL_LINES);
        
        //Estrela

        gl.glVertex2d(0, 0.5);
        gl.glVertex2d(0.1, 0.2);


        gl.glVertex2d(0.1, 0.2);
        gl.glVertex2d(0.5, 0.2); 
        
        gl.glVertex2d(0.5, 0.2); 
        gl.glVertex2d(0.2, -0.1); 
        
        gl.glVertex2d(0.2, -0.1);
        gl.glVertex2d(0.3, -0.5);
     
        gl.glVertex2d(0.3, -0.5);   
        gl.glVertex2d(0.0, -0.2);
        
        gl.glVertex2d(0.0, -0.2);
        gl.glVertex2d(-0.3, -0.5);
       
        gl.glVertex2d(-0.3, -0.5); 
        gl.glVertex2d(-0.2, -0.1); 
        
        gl.glVertex2d(-0.2, -0.1); 
        gl.glVertex2d(-0.5, 0.2); 
        
        gl.glVertex2d(-0.5, 0.2); 
        gl.glVertex2d(-0.1, 0.2);
        
        gl.glVertex2d(0, 0.5);
        gl.glVertex2d(-0.1, 0.2);
        
        //quadrado externo
        
        gl.glVertex2d(-0.5, 0.5);
        gl.glVertex2d(0.5, 0.5); 
        
        gl.glVertex2d(0.5, 0.5);
        gl.glVertex2d(0.5, -0.5); 
        
        gl.glVertex2d(0.5, -0.5); 
        gl.glVertex2d(-0.5, -0.5); 
        
        gl.glVertex2d(-0.5, 0.5);
        gl.glVertex2d(-0.5, -0.5); 

        
        //retas entre o quadrado e a estrela
        
        gl.glVertex2d(0.1, 0.2);
        gl.glVertex2d(0.5, 0.5);
        
        gl.glVertex2d(0.2, -0.1);
        gl.glVertex2d(0.5, -0.5); 
        
        gl.glVertex2d(0.0, -0.2);
        gl.glVertex2d(0.0, -0.5);
        
        gl.glVertex2d(-0.2, -0.1);
        gl.glVertex2d(-0.5, -0.5); 
        
        gl.glVertex2d(-0.1, 0.2);
        gl.glVertex2d(-0.5, 0.5);
        
        gl.glEnd();
       
    }

    @Override
    public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {
    }
    
}
