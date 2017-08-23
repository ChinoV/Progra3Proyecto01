/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2progra3;

import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import ui.AnimVentana;

/**
 *
 * @author Alfredo Valverde
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
    int counter;
    UtilidadesDeArchivo fl;
    
    
    public Ventana() {
        initComponents();
        fl = new UtilidadesDeArchivo();
        InicializarTabla();
    }

    
    public void InicializarTabla(){
        ArrayList<InformacionAlgoritmo> TempArray = fl.ObtenerHistorial();
        for (int i = 0; i < TempArray.size(); i++) {
             Object[] TempRow= { TempArray.get(i).getId(), TempArray.get(i).getNombre(), TempArray.get(i).getTipo(), TempArray.get(i).getFecha(), TempArray.get(i).getDuracion()};
            ((DefaultTableModel)jTable1.getModel()).addRow(TempRow);
        }
        if(TempArray.size() > 0){
            counter = Integer.parseInt(TempArray.get(TempArray.size()-1).getId()) + 1;
            MejorAlgoritmo();
        }else{
            jTextField1.setText("");
            counter = 1;
        }  
    }
    
    public void MejorAlgoritmo(){
        int indice = 0;
        int menor = Integer.parseInt(((DefaultTableModel)jTable1.getModel()).getValueAt(0, 4).toString());
        for (int i = 0; i < ((DefaultTableModel)jTable1.getModel()).getRowCount(); i++) {
            if(Integer.parseInt(((DefaultTableModel)jTable1.getModel()).getValueAt(i, 4).toString()) < menor){
                indice = i;
                menor = Integer.parseInt(((DefaultTableModel)jTable1.getModel()).getValueAt(i, 4).toString());
            }
        }
        jTextField1.setText((String)((DefaultTableModel)jTable1.getModel()).getValueAt(indice, 1));
    }
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MergeSortBtn = new javax.swing.JButton();
        InsertionSortBtn = new javax.swing.JButton();
        BrickSortBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SalirBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        HeapSortBtn = new javax.swing.JButton();
        AnimacionesBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MergeSortBtn.setText("MergeSort Simple");
        MergeSortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MergeSortBtnActionPerformed(evt);
            }
        });

        InsertionSortBtn.setText("InsertionSort");
        InsertionSortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertionSortBtnActionPerformed(evt);
            }
        });

        BrickSortBtn.setText("BrickSort");
        BrickSortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrickSortBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tipo", "Fecha", "Duracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        SalirBtn.setText("Salir");
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar Historial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Algoritmo mas rapido:");

        HeapSortBtn.setText("HeapSort");
        HeapSortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeapSortBtnActionPerformed(evt);
            }
        });

        AnimacionesBtn.setText("Animaciones");
        AnimacionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimacionesBtnActionPerformed(evt);
            }
        });

        jButton1.setText("MergeSort Cicular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MergeSortBtn)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(HeapSortBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InsertionSortBtn)
                        .addGap(18, 18, 18)
                        .addComponent(BrickSortBtn)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AnimacionesBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SalirBtn)))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MergeSortBtn)
                    .addComponent(InsertionSortBtn)
                    .addComponent(BrickSortBtn)
                    .addComponent(HeapSortBtn)
                    .addComponent(jButton1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirBtn)
                    .addComponent(AnimacionesBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MergeSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MergeSortBtnActionPerformed
        Lista<Persona> personas = new Lista<Persona>(); 
        personas.Add(new Persona("3-1437-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("E52461", 20, "a", "b", "c"));
        personas.Add(new Persona("3-1427-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("E52261", 20, "a", "b", "c"));
        personas.Add(new Persona("2-1487-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("1-1432-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("1-1417-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("2-1437-1004", 20, "a", "b", "c"));
        personas.Add(new Persona("1-1437-0224", 20, "a", "b", "c"));
        personas.Add(new Persona("E12461", 20, "a", "b", "c"));
        personas.Add(new Persona("E51461", 20, "a", "b", "c"));
        JOptionPane.showMessageDialog(null,"Lista desordenada:\n"+personas.getString());
        long startTime = System.nanoTime();    
        personas.MergeSort();
        long estimatedTime = System.nanoTime() - startTime;
        JOptionPane.showMessageDialog(null,"Lista ordenada por MergeSort:\n"+personas.getString());
        Object[] TempRow= { counter, "MergeSort Simple", "Lista Simple", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), estimatedTime};
        ((DefaultTableModel)jTable1.getModel()).addRow(TempRow);
        counter++;
        fl.AgregarAHistorial(Arrays.toString(TempRow));
        MejorAlgoritmo();
    }//GEN-LAST:event_MergeSortBtnActionPerformed

    private void BrickSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrickSortBtnActionPerformed
       Lista<Persona> personas = new Lista<Persona>(); 
        personas.Add(new Persona("3-1437-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("E52461", 20, "a", "b", "c"));
        personas.Add(new Persona("3-1427-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("E52261", 20, "a", "b", "c"));
        personas.Add(new Persona("2-1487-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("1-1432-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("1-1417-0004", 20, "a", "b", "c"));
        personas.Add(new Persona("2-1437-1004", 20, "a", "b", "c"));
        personas.Add(new Persona("1-1437-0224", 20, "a", "b", "c"));
        personas.Add(new Persona("E12461", 20, "a", "b", "c"));
        personas.Add(new Persona("E51461", 20, "a", "b", "c"));
        JOptionPane.showMessageDialog(null,"Lista desordenada:\n"+personas.getString());
        long startTime = System.nanoTime();    
        personas.brickSort(personas);
        long estimatedTime = System.nanoTime() - startTime;
        JOptionPane.showMessageDialog(null,"Lista ordenada por BrickSort:\n"+personas.getString());  
        Object[] TempRow= { counter, "BrickSort", "Lista Simple", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), estimatedTime};
        ((DefaultTableModel)jTable1.getModel()).addRow(TempRow);
        counter++;
        fl.AgregarAHistorial(Arrays.toString(TempRow));
        MejorAlgoritmo();
    }//GEN-LAST:event_BrickSortBtnActionPerformed

    private void InsertionSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertionSortBtnActionPerformed
        Cola cola = new Cola();
        cola.Enqueue(new Persona("3-1437-0004", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("E52461", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("3-1427-0004", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("E52261", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("2-1437-0004", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("1-1432-0004", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("1-1417-0004", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("2-1437-1004", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("1-1437-0224", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("E12461", 20, "a", "b", "c"));
        cola.Enqueue(new Persona("E51461", 20, "a", "b", "c"));
        JOptionPane.showMessageDialog(null,"Cola desordenada:\n"+cola.getString());
        long startTime = System.nanoTime();    
        InsertionSort(cola);
        long estimatedTime = System.nanoTime() - startTime;
        JOptionPane.showMessageDialog(null,"Cola ordenada por InsertionSort:\n"+cola.getString());   
        Object[] TempRow= { counter, "InsertionSort", "Cola", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), estimatedTime};
        ((DefaultTableModel)jTable1.getModel()).addRow(TempRow);
        counter++;
        fl.AgregarAHistorial(Arrays.toString(TempRow));
        MejorAlgoritmo();
    }//GEN-LAST:event_InsertionSortBtnActionPerformed

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        while(((DefaultTableModel)jTable1.getModel()).getRowCount()>0){
            ((DefaultTableModel)jTable1.getModel()).removeRow(0);
        }
        fl.LimpiarHistorial();
        counter = 1;
        jTextField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void HeapSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeapSortBtnActionPerformed
        Pila pila = new Pila();
        pila.Push(new Persona("3-1437-0004", 20, "a", "b", "c"));
        pila.Push(new Persona("E52461", 20, "a", "b", "c"));
        pila.Push(new Persona("3-1427-0004", 20, "a", "b", "c"));
        pila.Push(new Persona("E52261", 20, "a", "b", "c"));
        pila.Push(new Persona("2-1437-0004", 20, "a", "b", "c"));
        pila.Push(new Persona("1-1432-0004", 20, "a", "b", "c"));
        pila.Push(new Persona("1-1417-0004", 20, "a", "b", "c"));
        pila.Push(new Persona("2-1437-1004", 20, "a", "b", "c"));
        pila.Push(new Persona("1-1437-0224", 20, "a", "b", "c"));
        pila.Push(new Persona("E12461", 20, "a", "b", "c"));
        pila.Push(new Persona("E51461", 20, "a", "b", "c"));
        JOptionPane.showMessageDialog(null,"Pila desordenada:\n"+pila.getString());
        long startTime = System.nanoTime();    
        pila.HeapSortAlgorithm();
        long estimatedTime = System.nanoTime() - startTime;
        JOptionPane.showMessageDialog(null,"Pila ordenada por HeapSort:\n"+pila.getString());   
        Object[] TempRow= { counter, "HeapSort", "Pila", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), estimatedTime};
        ((DefaultTableModel)jTable1.getModel()).addRow(TempRow);
        counter++;
        fl.AgregarAHistorial(Arrays.toString(TempRow));
        MejorAlgoritmo();
    }//GEN-LAST:event_HeapSortBtnActionPerformed

    private void AnimacionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimacionesBtnActionPerformed
        AnimVentana AVentana = new AnimVentana();
        AVentana.setVisible(true);
    }//GEN-LAST:event_AnimacionesBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaCircular<Persona> personas = new ListaCircular<Persona>(); 
        personas.InsertarFinal(new Persona("3-1437-0004", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("E52461", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("3-1427-0004", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("E52261", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("2-1487-0004", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("1-1432-0004", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("1-1417-0004", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("2-1437-1004", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("1-1437-0224", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("E12461", 20, "a", "b", "c"));
        personas.InsertarFinal(new Persona("E51461", 20, "a", "b", "c"));
        JOptionPane.showMessageDialog(null,"Lista circular desordenada:\n"+personas.getString());
        long startTime = System.nanoTime();    
        personas.MergeSort();
        long estimatedTime = System.nanoTime() - startTime;
        JOptionPane.showMessageDialog(null,"Lista circular ordenada por MergeSort:\n"+personas.getString());
        Object[] TempRow= { counter, "MergeSort Circular", "Lista Circular", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), estimatedTime};
        ((DefaultTableModel)jTable1.getModel()).addRow(TempRow);
        counter++;
        fl.AgregarAHistorial(Arrays.toString(TempRow));
        MejorAlgoritmo();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    
    void InsertionSort(Cola _cola) {
        if (!_cola.IsEmpty()) {
            Cola Extranjeros = new Cola();
            Cola Nacionales = new Cola();
            while (!_cola.IsEmpty()) {
                boolean insertando = true;
                if (((Persona)_cola.Peek()).getCedula().charAt(0) == 'E')
                {
                    int tamanno = Extranjeros.Size();
                    for (int i = 0; i < tamanno; i++)
                    {
                        if (insertando)
                        {
                            if (Integer.parseInt(((Persona)_cola.Peek()).getCedula().substring(1, ((Persona)_cola.Peek()).getCedula().length()-1)) < Integer.parseInt(((Persona)Extranjeros.Peek()).getCedula().substring(1, ((Persona)Extranjeros.Peek()).getCedula().length()-1)))
                            {
                                Extranjeros.Enqueue(_cola.Dequeue());
                                insertando = false;
                            }
                        }
                        Extranjeros.Enqueue(Extranjeros.Dequeue());
                    }
                    if (insertando)
                    {
                        Extranjeros.Enqueue(_cola.Dequeue());
                    }
                }
                else {
                    int tamanno = Nacionales.Size();
                    for (int i = 0; i < tamanno; i++)
                    {
                        if (insertando)
                        {
                            if (Integer.parseInt(((Persona)_cola.Peek()).getCedula().split("-")[0]) < Integer.parseInt(((Persona)Nacionales.Peek()).getCedula().split("-")[0]))
                            {
                                Nacionales.Enqueue(_cola.Dequeue());
                                insertando = false;
                            }
                            else if (Integer.parseInt(((Persona)_cola.Peek()).getCedula().split("-")[0]) == Integer.parseInt(((Persona)Nacionales.Peek()).getCedula().split("-")[0]))
                            {
                                if (Integer.parseInt(((Persona)_cola.Peek()).getCedula().split("-")[1]) < Integer.parseInt(((Persona)Nacionales.Peek()).getCedula().split("-")[1]))
                                {
                                    Nacionales.Enqueue(_cola.Dequeue());
                                    insertando = false;
                                }
                                else if (Integer.parseInt(((Persona)_cola.Peek()).getCedula().split("-")[1]) == Integer.parseInt(((Persona)Nacionales.Peek()).getCedula().split("-")[1]))
                                {
                                    if (Integer.parseInt(((Persona)_cola.Peek()).getCedula().split("-")[2]) < Integer.parseInt(((Persona)Nacionales.Peek()).getCedula().split("-")[2]))
                                    {
                                        Nacionales.Enqueue(_cola.Dequeue());
                                        insertando = false;
                                    }
                                }
                            }
                        }
                        Nacionales.Enqueue(Nacionales.Dequeue());
                    }
                    if (insertando)
                    {
                        Nacionales.Enqueue(_cola.Dequeue());
                    }
                }
            }
            while (!Extranjeros.IsEmpty()) {
                _cola.Enqueue(Extranjeros.Dequeue());
            }
            while (!Nacionales.IsEmpty())
            {
                _cola.Enqueue(Nacionales.Dequeue());
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnimacionesBtn;
    private javax.swing.JButton BrickSortBtn;
    private javax.swing.JButton HeapSortBtn;
    private javax.swing.JButton InsertionSortBtn;
    private javax.swing.JButton MergeSortBtn;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
