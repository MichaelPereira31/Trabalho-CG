/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;


/**
 *
 * @author michael
 */
public class Trabalho {

    public static void main(String[] args) {
        GLProfile gp = GLProfile.get (GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(gp);
        GLCanvas gc = new GLCanvas(cap);
        JoglFrame jf = new JoglFrame();
        gc.addGLEventListener(jf);
        gc.setSize(350, 350);
        JFrame frame = new JFrame("JOGL Linha");
        frame.add(gc);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }
};
