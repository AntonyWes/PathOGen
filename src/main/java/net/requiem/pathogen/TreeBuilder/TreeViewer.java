//package net.requiem.pathogen.TreeBuilder;
//
//import com.jogamp.opengl.*;
//import com.jogamp.opengl.awt.GLCanvas;
//import javax.swing.JFrame;
//import java.awt.*;
//
//public class TreeViewer extends JFrame implements GLEventListener {
//
//    private final GLCanvas glcanvas;
//
//    public static void main(String[] args) {
//        final TreeViewer treeViewer = new TreeViewer();
//        treeViewer.setVisible(true);
//    }
//
//    public TreeViewer() {
//        super("Tree Viewer");
//        glcanvas = new GLCanvas();
//        glcanvas.addGLEventListener(this);
//        getContentPane().add(glcanvas, BorderLayout.CENTER);
//        setSize(400, 400);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//    @Override
//    public void init(GLAutoDrawable drawable) {
//        final GL2 gl = drawable.getGL().getGL2();
//        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
//    }
//
//    @Override
//    public void display(GLAutoDrawable drawable) {
//        final GL2 gl = drawable.getGL().getGL2();
//        // Your drawing code here
//    }
//
//    @Override
//    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
//        // Method body
//    }
//
//    @Override
//    public void dispose(GLAutoDrawable arg0) {
//        // Method body
//    }
//}
