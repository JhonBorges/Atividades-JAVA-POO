import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Linhas: ");
        int m = sc.nextInt();
        System.out.print("Colunas: ");
        int n = sc.nextInt();

        Integer[][] mat = new Integer[m][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("Digite o valor: ");
        Integer x = sc.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j].equals(x)){
                    System.out.print("position: " + i + ", " + j);
                    if (j > 0){
                        System.out.println();
                        System.out.println("Left: "+ mat[i][j-1]);
                    }
                    if (j < n - 1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(mat[i-1][j] > 0){
                        System.out.println("Up: "+mat[i-1][j]);
                    }
                    if (i < m-1){
                        System.out.println("Down: "+mat[i+1][j]);
                    }
                    break;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}