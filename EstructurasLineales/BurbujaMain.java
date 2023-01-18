package EstructurasLineales;
public class BurbujaMain {

    public static void main(String[] args) {
        int vector[] = {6, 5, 9, 2, 8, 0, 1, 3, 7};

// este método nos ordena los números de menor a mayor

        //Método Burbuja

        int temp;

        for (int i = 0; i < vector.length-1; i++)
        {
            for (int j = 0; j < vector.length- 1; j++)
            {
              if (vector[j] > vector[j+1])
              {
                  temp = vector[j];
                  vector[j] = vector[j+1];
                  vector[j+1] = temp;
              }
            }
        }
        for (int i = 0; i < vector.length-1; i++){
            System.out.print(vector[i] + "  ");
        }
    }
}
