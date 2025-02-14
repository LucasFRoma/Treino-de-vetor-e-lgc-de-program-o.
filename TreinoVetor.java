
import java.text.DecimalFormat;
import java.util.Scanner;

public class TreinoVetor {
    static Scanner e = new Scanner(System.in);

    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("#.00");
        String[] nomes = alunos();
        double[] mediaAl = notasAl(nomes);
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno - " + nomes[i] + " e sua respectiva média " + dc.format(mediaAl[i] ));
        }

    }//Fecha o main

    public static String[] alunos() {
        String[] nomes = new String[3];
        for (int j = 0; j < 3; j++) {
            System.out.println("Qual o nome do " + (j + 1) + " aluno?");
            nomes[j] = e.next();
        }
        return nomes;
    }

    public static double[] notasAl(String[] nomes) {
        double[] notas = new double[3];
        double totAl;
        double[] mediaAl = new double[3];
        for (int j = 0; j < 3; j++) {
            totAl = 0;
            System.out.print("Aluno - " + nomes[j]);
            for (int i = 0; i < 3; i++) {
                System.out.println();
                System.out.print("Digite a " + (i + 1) + " nota - ");
                notas[i] = e.nextDouble();
                while (notas[i] < 1 || notas[i] > 10) {
                    System.out.print("Nota inválida, digite uma nota válida - ");
                    notas[i] = e.nextDouble();
                }
                totAl = totAl + notas[i];
            }
            mediaAl[j] = totAl / 3;
        }

        return mediaAl;
    }


}
