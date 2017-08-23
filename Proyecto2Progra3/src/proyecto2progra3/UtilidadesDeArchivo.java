/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2progra3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alfredo Valverde
 */
public class UtilidadesDeArchivo {
    
    /**
     * <h1>AgregarAHistorial</h1>
     * <p> Agrega string en el Historial
     * </p> 
     * @param mensaje Lista a ordenar
     */
    public void AgregarAHistorial(String mensaje){
        String fileName = "Historial.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(mensaje);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
        }
    }
    
     /**
     * <h1>ObtenerHistorial</h1>
     * <p> Obtiene el Historial 
     * </p> 
     * @return ArrayList
     */
    public ArrayList<InformacionAlgoritmo> ObtenerHistorial(){
        ArrayList<InformacionAlgoritmo> Temp = new ArrayList<InformacionAlgoritmo>();
        String fileName = "Historial.txt";
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                String[] array = line.replace('[', ' ').replace(']', ' ').trim().split(",");
                Temp.add(new InformacionAlgoritmo(array[0].trim(), array[1].trim(), array[2].trim(), array[3].trim(), array[4].trim()));
            }
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }
        return Temp;
    }
    
    /**
     * <h1>LimpiarHistorial</h1>
     * <p> Borra los datos del Historial 
     * </p> 
     */
    public void LimpiarHistorial(){
        String fileName = "Historial.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write("");
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
        }
    }
    
}
