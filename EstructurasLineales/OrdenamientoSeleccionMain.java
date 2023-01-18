package EstructurasLineales;

public class OrdenamientoSeleccionMain {

    public static void main(String[] args) {

        //Vector a ordenar
        int vector[] = {9,3,5,7,1,2,8};
        //Variable auxiliar
        int temp;

        //Primer ciclo de recorrido
        for (int k = 0; k <= vector.length-1; k++)
        {
            //Almacenamientño de variable de recorrido
            int p = k;
            //Segundo ciclo de recorrido
            for (int i = k+1; i <= vector.length-1; i++)
            {
                //Comparación de valores y almacenaje de posiciones
                if (vector[i] < vector[p]) p = i;

                //Comparación de posiciones
                if (p != k)
                {
                    //Intercambio de valores en posiciones
                    temp = vector[p];
                    vector[p] = vector[k];
                    vector[k] = temp;
                }

            }
        }
        for (int k = 0; k <= vector.length-1; k++){
            System.out.print(vector[k] + "  - ");
        }

    }
}
