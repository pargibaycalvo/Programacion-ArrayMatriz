
package arraymatriz;

import javax.swing.JOptionPane;


public class metodosmatriz {
    int[][]notas=new int[4][1];//cojemos espacio en memoria 3 filas y 4 columnas 
    float[]notasmedias=new float[notas.length];//cojemos espacio en memoria 3 filas
    float[]notascolum=new float[notas.length];//cojemos espacio en memoria 4 filas
                          
    
    public void cargarmatriz(){
        for(int f=0;f<notas.length;f++){//dende a fila 0 hasta el tamaño que tengo en filas
            for(int c=0;c<notas[f].length;c++){
                notas[f][c]=pedirnota();//metodo para pedir la nota que queremos
                
            }
        }
    }
    public int pedirnota(){//le decimos que el resultado tiene que estar comprendido entre 1 y 10.  
        int resultado;
        do{
            resultado=Integer.parseInt(JOptionPane.showInputDialog("Resultado :"));
        }while(resultado<1||resultado>10);
        return resultado;
        }
    
    public void amosarmatriz(){
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                System.out.println(notas[f][c]+"  ");
            }
        }
    }
    public void calcularmedianotas(){
        float acumulador;
        for (int f=0;f<notas.length;f++){
            acumulador=0;
            for (int c=0;c<notas[f].length;c++){
                acumulador=acumulador+notas[f][c];          
            }
            notasmedias[f]=acumulador/notas[f].length;
            
        }
    
    }
    public void mediaalumnos(){
        float acumulador;
        for(int f=0;f<notas.length;f++){
            acumulador=0;
            for(int c=0;c<notas.length;c++){
                acumulador=acumulador+notas[f][c];
            }
            notascolum[f]=acumulador/notas[f].length;
            System.out.println("Media:"+notascolum);
            
        }
        
    }
    
    }
    

    

