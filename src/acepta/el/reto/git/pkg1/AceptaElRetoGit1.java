
package acepta.el.reto.git.pkg1;
import java.util.Scanner;
public class AceptaElRetoGit1 {
/**
 * Author: Julian DAM 1
     * @param args
 */
    public static void main(String[] args)
    {
 
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        int suma = 0;
        String resultado = "";
        
        for (int i = 0; i < cadena.length(); i++)
        {
            int n ;
            n = Integer.parseInt("" + cadena.charAt(i));
            suma += n;
            if (i != cadena.length() - 1)
            {
                resultado = resultado.concat(n + " + ");
            } else
            {
                resultado = resultado.concat(n + " = " + suma);
            }
        }
 
        System.out.println(resultado);
    }
 
}
