package proyectoclasematriz;

import java.util.Random;

public class ClaseMatriz
{

    private int nFilas;
    private int nCol;
    private int mat[][];

    //Metodo constructor.
    public ClaseMatriz(int nFilas,int nCol)
    {
        this.nFilas = nFilas;
        this.nCol = nCol;
        mat=new int[this.nFilas][this.nCol];
    }
    
    //Metodo para obtener numero de filas.
    public int getNfilas()
    {
        return nFilas;
    }
    
    //Metodo para obtener numero de columnas.
    public int getNcol()
    {
        return nCol;
    }

    //Metodo para obtener un dato de una posicion de la matriz.
    public int getDato(int f, int c)
    {
        return(mat[f][c]);
    }

    //Metodo para asignar un dato a una posicion de la matriz.
    public void setDato(int dato,int f, int c)
    {
        mat[f][c]=dato;
    }    

    //Metodo llenar.
    public void llenar()
    {
        Random nro = new Random ();
        for(int k=0;k<nFilas;k++)
        {
            for(int j=0;j<nCol;j++)
            {
                mat[k][j] = nro.nextInt(10);
            }
        }
    }
    
    //Metodo para mostrar.
    public String mostrar()
    {
        String salida="La Matriz tiene estos datos:\n";
        for(int k=0;k<nFilas;k++)
        {
            for(int j=0;j<nCol;j++)
            {
                salida = salida + mat[k][j] + " ";
            }
            salida = salida + "\n";
        }
        return salida;
    }
    //Metodo para sumar.
    /**public ClaseMatriz sumar(ClaseMatriz B)
    {
        String salida = "";
        int s,ms[][] = new int[nFilas][nCol];
        for(int k=0;k<nFilas;k++)
        {
            for(int j=0;j<nCol;j++)
            {
                
            }
        }
        return(ms);
    }*/
    
    //Metodo para multiplicar matrices.
    public ClaseMatriz multiplicar(ClaseMatriz B)
    {
        ClaseMatriz RM=new ClaseMatriz(nFilas,B.getNcol());
        for(int i=0;i<nFilas;i++)
        {
            for(int j=0;j<nCol;j++)
            {
                for(int k=0;k<nCol;k++)
                {
                    int s=RM.getDato(i, j)+mat[i][k]*B.getDato(k, j);
                    RM.setDato(s, i, j);
                }
            }
        }
        return (RM);
    }
    
    //Metodo para encontrar la traspuesta de una matriz.
    public ClaseMatriz traspuesta()
    {
        ClaseMatriz TM=new ClaseMatriz(nCol,nFilas);
        for(int k=0;k<nCol;k++)
        {
            for(int j=0;j<nCol;j++)
            {
                TM.setDato(mat[k][j], k, j);
            }
        }
        return(TM);
    }
    //Metodo para ordenar una matriz.
    public void ordenar()
    {
        
    }

}