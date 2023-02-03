import java.util.Random;

public class PosicionAleatoria {

    public static void main(String[] args) {

        String[][] matriz = new String[3][4];

        Random r = new Random();

        for(int i = 0; i < 3; i++) {

            int i1 = r.nextInt(matriz.length);
            int i2 = r.nextInt(matriz[0].length);

            System.out.print("Fila:" + i1 + ", ");
            System.out.print("Columna:" + i2 + ": ");
            System.out.println("Valor:" + "€");
        }











    }
}