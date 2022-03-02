package united;


import java.io.PrintStream;
import java.util.Scanner;

import java.util.Scanner;
public class united {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int quantidadeEntradas = scan.nextInt();

        int[] entradas = new int[quantidadeEntradas];
        long[] graos = new long[quantidadeEntradas];
        for (int i = 0; i < quantidadeEntradas; i++) {
            entradas[i] = scan.nextInt();
            graos[i] = ((long) Math.pow(2, entradas[i] - 2)) / 3000;
        }

        for (int i = 0; i < graos.length; i++) {
            System.out.println(graos[i] + " kg");
        }
    }
}


/*public class united {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();
        if (horasaida + tempoviagem >= 24)
            tempoviagem = tempoviagem - 24;

            horasaida = (horasaida + tempoviagem - 24 - tempoviagem);
    ;

        int ajuste = (horasaida + tempoviagem + fuso);
        //Escreva a sua lógica aqui

        System.out.println(ajuste);

        sc.close();
    }
}


public class united {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            if(        )
                System.out.println("0");
            else if(                 )
                System.out.println();
            else if(                  )
                System.out.println("1");
            else
                System.out.println("2");
        }
        sc.close();
    }
}

//public class united {
       //public static void main(String[] args) {
           //Scanner sc = new Scanner(System.in);

           long n = sc.nextLong();
           for(long i=0 ; i<n ; i++) {
               long x = sc.nextLong();
               long soma = (long) Math.pow(2, x);

               //long soma = x * 2;
               System.out.printf(String.valueOf(((soma / 12) / 1000 + " Kg \n")));  //Complete o código aqui.
           }
           sc.close();
       }
   }

   private static double primeiro, segundo;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double graosCasa = 1, casasTabuleiro = 64;
        int graos = 1;

        for (int x = 1; x < casasTabuleiro; x++) {
            graosCasa = graosCasa * 2;
            graos += graosCasa;
        }

        System.out.println(("\nO quantidade de grãos é: " + graos /12)) ;
    }
}
*/




