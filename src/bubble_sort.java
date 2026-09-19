import java.util.Scanner;



public class bubble_sort {
    public static int Bubble_sort(int[] ordemfila) {
                int n = ordemfila.length;

                for (int fila = 0; fila < n - 1; fila++) {
                    boolean troca = false;
                    for (int j = 0; j < n - 1 - fila; j++) {

                        if (ordemfila[n] > ordemfila[n + 1]) {
                            int provisoria = ordemfila[n];
                            ordemfila[n] = ordemfila[n + 1];
                            ordemfila[n + 1] = provisoria;
                            troca = true;
                        }
                        if (!troca) {
                            break;
                        }
                    }
                }
            }
            public static void principal(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Insira as senha que precisam ser ordenadas: ");
                int n = sc.nextInt();
                int[] ordemfila = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("insira as senhas: ");
                    ordemfila[i] = sc.nextInt();
                }
                System.out.println("ordem correta de pacientes: ");
                Bubble_sort(ordemfila);
            }
        }



