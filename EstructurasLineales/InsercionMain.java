package EstructurasLineales;

public class InsercionMain {

    public static void main(String[] args) {

        //Vector a ordenar método Inserción
        int vector[] = {9, 7, 8, 0, 4, 5, 6, 2, 1, 3};
        //Primer ciclo de recorrido
        for (int i = 0; i < vector.length; i++)
        {
            //Declaración y asignación de la variable a ordenar
            int aux = vector[i];
            //Declaración de la variable del ciclo
            int j;

            //Segundo ciclo de recorrido

            for (j = i-1; j >= 0 && vector[j] > aux; j--)
            {

                vector[j+1] = vector[j];
            }
            //Asignación de valores al ciclo
            vector[j+1] = aux;
        }

        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }

}
