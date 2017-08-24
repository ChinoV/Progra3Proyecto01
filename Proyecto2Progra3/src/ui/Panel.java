/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import ui.BoxNumber;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import ui.AnimVentana;
/**
 *
 * @author Alfredo Valverde
 */
public class Panel extends JPanel{

    private int NUM_BOX = 12;
    private Dimension dimension = new Dimension(320,128);    
    private int max = 99;
    private int min = 1;
    private BoxNumber[] bNumber;

 /**
 * Constructor de clase Panel
 */
    public Panel(){
        setSize(dimension);
        setVisible(true);                
    }

    @Override
    public void paintComponent(Graphics g){    
        Graphics2D g2 =(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);    
        g2.setColor( new Color(255,255,255) );
        g2.fill(new Rectangle2D.Double(0,0,getWidth(),getHeight()));                 
        //pinta numeros y casillas
        if(bNumber!=null)
        for(BoxNumber b:bNumber){
            b.draw(g2);
        }

    }

/**
     * <h1>generar</h1>
     * <p>
     * Dibuja en un Panel n numeros correspondientes a la cantidad de numeros deseados</p>
     */
    public void generar(){        
        bNumber = new BoxNumber[NUM_BOX];
        Random rn = new Random();
        for(int i=0;i<NUM_BOX;i++){
            bNumber[i] = new BoxNumber();    
            bNumber[i].x= 10 + bNumber[i].WIDTH * i;
            bNumber[i].y = getHeight()/2 - bNumber[i].HEIGHT/2 ;
            int num = rn.nextInt(max - min + 1) + min;
            bNumber[i].setNumber(String.valueOf(num));
        }
        repaint();
    }
 
 /**
     * <h1>Brick</h1>
     * <p>
     * Metodo para iniciar el metodo BrickWorker</p>
     */
    public void Brick() {
        if (bNumber != null) {
            AnimVentana.terminarProceso = true;
            new BrickWorker().execute();
        }
    }
    public void ordenarMerge() {
        if (bNumber != null) {
            AnimVentana.terminarProceso = true;
            new MergeWorker().execute();//inicia worker
        }
    }

     /**
     * <h1>BrickWorker</h1>
     * <p>
     * Metodo para ordenar el array de numeros con el algoritmo BrickSort</p>
     */
    public class BrickWorker extends SwingWorker<Void, Void> {

        private final int velocidad = 6; //velocidad de animacion (msegundos)    
        @Override
        protected Void doInBackground() throws Exception {
            //BrickSort
            int i, j;
            BoxNumber aux;
            int cont = 0;
            while (cont < bNumber.length - 1) {
                for (i = 0; i < bNumber.length / 2; i++) {
                    for (j = 0; j + 1 < bNumber.length; j += 2) {
                        if (bNumber[j].getValue() > bNumber[j + 1].getValue()) {

                            aux = bNumber[j];
                            girar(j, j + 1);
                            bNumber[j] = bNumber[j + 1];
                            bNumber[j + 1] = aux;
                        }
                    }
                    for (j = 1; j + 1 < bNumber.length; j += 2) {
                        if (bNumber[j].getValue() > bNumber[j + 1].getValue()) {
                            aux = bNumber[j];
                            girar(j, j + 1);
                            bNumber[j] = bNumber[j + 1];
                            bNumber[j + 1] = aux;
                        }
                    }
                }
                cont++;
            }
             
            AnimVentana.terminarProceso = false;    
            JOptionPane.showMessageDialog(null, "Se ha terminado la animacion BrickSort.");
            return null;
        }
        
         /**
     * <h1>girar</h1>
     * <p>
     * Metodo llamado para la animacion del ordenamiento</p>
     * @param a int
     * @param b int
     */
        private void girar(int a , int b){
            //movmiento vertical
            for(int i=0; i< bNumber[0].HEIGHT;i++){
                bNumber[a].y -= 1;
                bNumber[b].y += 1;                   
                try {
                    Thread.sleep(velocidad);
                 } catch (InterruptedException e) {}
                repaint();
            }

            //vomiento horizontal
            for(int i=0; i< bNumber[0].WIDTH;i++){
                 bNumber[a].x += 1;
                 bNumber[b].x -= 1;
                 try {
                    Thread.sleep(velocidad);
                 } catch (InterruptedException e) {}
                repaint();
            }

            //movimiento vertical
            for(int i=0; i< bNumber[0].HEIGHT;i++){
                bNumber[a].y += 1;
                bNumber[b].y -= 1;                   
                try {
                    Thread.sleep(velocidad);
                 } catch (InterruptedException e) {}
                repaint();
            }
        } 
    }
    //-----------------------------------------------------
   public class MergeWorker extends SwingWorker<Void, Void> { //Solo separa la lista (ACTUALMENTE)

        private final int velocidad = 100; //velocidad de animacion (milisegundos)  

        @Override
        protected Void doInBackground() throws Exception {
            animar();
            AnimVentana.terminarProceso = false;
            return null;
        }
        
        private int[] ArrayTemp;
        /**
         * <h1>Animar</h1>
         * <p>
         * Reproduce la animacion del Mergesort</p>
         */
        private void animar() {
          InicializarArrayTemporal();
          MergeSort(ArrayTemp);
          JOptionPane.showMessageDialog(null, "Se ha terminado la animacion MergeSort.");
        }

        /**
         * <h1>InicializarArrayTemporal</h1>
         * <p>
         * Inicializa un Array de tipo int de uso temporal</p>
         */
        public void InicializarArrayTemporal(){
            ArrayTemp = new int[bNumber.length];
            for (int i = 0; i < bNumber.length; i++) {
                ArrayTemp[i] = bNumber[i].getValue();
            }
        }
        
        /**
         * <h1>MergeSort</h1>
         * <p>
         * Ordena en base al algoritmo MergeSort</p>
         * @param Array de tipo int
         */
        public void MergeSort(int[] values) {
                     
            int k = 1;
            int y = 0;
            int yStarting = 1;
            int amountToAdd = 2;
            do{
                k = yStarting;
                for (int j = 0; k<values.length; j = j+amountToAdd) {
                    Merge(j,k);
                    k = k+amountToAdd;
                }
                yStarting = yStarting+amountToAdd;                 
                amountToAdd = amountToAdd*2;
            }while(yStarting<values.length);
            Merge(y,values.length-1);
        }        
        
        /**
         * <h1>Merge</h1>
         * <p>
         * Facilita el ordenamiento de la animacion en base al algoritmo MergeSort</p>
         * @param inicio int
         * @param fin int
         */
        public void Merge(int inicio, int fin) {
            for (int i = inicio; i < fin; i++)  
            {  
                int index = i;
                for (int j = i + 1; j <= fin; j++){  
                    if (ArrayTemp[j] < ArrayTemp[index]){  
                        index = j;//searching for lowest index  
                    }
                }
                if(ArrayTemp[index] < ArrayTemp[i]){
                    int distancia = index - i;
                    moverArriba(i);
                    moverAbajo(index);
                    for(int x = 0; x < distancia; x++){
                        moverDerecha(i);
                        moverIzquierda(index);
                    }
                    moverArriba(index);
                    moverAbajo(i);
                    int smallerNumber = ArrayTemp[index];   
                    ArrayTemp[index] = ArrayTemp[i];  
                    ArrayTemp[i] = smallerNumber;
                    BoxNumber temp = bNumber[index];   
                    bNumber[index] = bNumber[i];  
                    bNumber[i] = temp;
                }
            }  
        }
        /**
         * <h1>moverAbajo</h1>
         * <p>
         * Moviliza la casilla indicada hacia abajo, usando las cordenadas verticales en "y"</p>
         * @param numCaja int 
         */
        private void moverAbajo(int numCaja) { 
            for (int i = 0; i < bNumber[numCaja].HEIGHT; i++) {
                bNumber[numCaja].y += 1;
            }
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {
            }
            repaint();
        }
        
        /**
         * <h1>moverArriba</h1>
         * <p>
         * Moviliza la casilla indicada hacia arriba, usando las cordenadas verticales en "y"</p>
         * @param numCaja int 
         */
        private void moverArriba(int numCaja) {
            for (int i = 0; i < bNumber[numCaja].HEIGHT; i++) {
               bNumber[numCaja].y -= 1;
           } 
           try {
               Thread.sleep(velocidad);
           } catch (InterruptedException e) {
           }
           repaint();
        }

        /**
         * <h1>moverDerecha</h1>
         * <p>
         * Moviliza la casilla indicada hacia la derecha, usando las cordenadas horizontales en "x"</p>
         * @param numCaja int 
         */
        private void moverDerecha(int numCaja) {
            for (int i = 0; i < bNumber[numCaja].WIDTH; i++) {
                bNumber[numCaja].x += 1;
            }
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {
            }
            repaint();
        }

        /**
         * <h1>moverIzquierda</h1>
         * <p>
         * Moviliza la casilla indicada hacia la izquierda, usando las cordenadas horizontales en "x"</p>
         * @param numCaja int 
         */
        private void moverIzquierda(int numCaja) {
           for (int i = 0; i < bNumber[numCaja].WIDTH; i++) {
                bNumber[numCaja].x -= 1;
            }
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {
            }
            repaint();
        }
    }
}