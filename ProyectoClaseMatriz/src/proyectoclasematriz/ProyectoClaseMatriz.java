package proyectoclasematriz;

import javax.swing.JOptionPane;

public class ProyectoClaseMatriz
{

    public static void main(String[] args)
    {
        ClaseMatriz A,B,C;
        int nFilas,nCol,opcion=-1;
        String menu="***Menu***"
                + "1. Mostrar matrices."
                + "2. Sumar matrices."
                + "3. Multiplicar matrices."
                + "4. Traspuestas de las matrices."
                + "5. Ordenar."
                + "6. Comparar matrices."
                + "0. Salir."
                + "Inserte la opción que necesite:";
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la fila de la Matriz 1."));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la columna de la Matriz 1."));
        A=new ClaseMatriz(nFilas,nCol);
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la fila de la Matriz 2."));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la columna de la Matriz 2."));
        B=new ClaseMatriz(nFilas,nCol);
        A.llenar();
        B.llenar();
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion)
            {
                case 1: int opcionSumar=-1;
                    String menuSumar="1.Mostrar la primera matriz."
                        + "2. Mostrar la segunda matriz."
                        + "3. Mostrar las 2 matrices."
                        + "0. Salir de mostrar."
                        + "Seleccione la opción que quiera ver:";                    
                    do
                    {
                        opcionSumar = Integer.parseInt(JOptionPane.showInputDialog(menuSumar));   
                        switch(opcionSumar)
                        {
                            case 1:
                                JOptionPane.showMessageDialog(null,"Datos del vector 1:\n"+A.mostrar());
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null,"Datos del vector 2:\n"+B.mostrar());
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null,"Datos del vector 1:\n"+A.mostrar()
                                                                +"\nDatos del vector 2:\n"+B.mostrar());
                                break;
                            case 4:
                                break;
                                
                        }
                    }while(opcionSumar!=0);
                case 2:                        
                    if(A.getNfilas()==B.getNfilas()&&A.getNcol()==B.getNcol())
                    {
                        //C=A.sumar(B);
                        JOptionPane.showMessageDialog(null,"Datos del vector 1:\n"+A.mostrar()
                                                        +"\nDatos del vector 2:\n"+B.mostrar());
                                                        /**+"\nDatos del vector sumar:\n"+C.mostrar());*/
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Las matrices no se pueden sumar ya que las dimensiones no son iguales.");
                    }
                    break;
                case 3:
                    if(A.getNcol()==B.getNfilas() || B.getNcol()==A.getNfilas())
                    {
                        
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.exit(0);
            }
        }while(opcion!=0);
    }

}