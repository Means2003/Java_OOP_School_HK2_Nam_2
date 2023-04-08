package Ex2;
import java.util.Scanner;
public class C9 {
    static Scanner sc = new Scanner(System.in);

    public static void input(float matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextFloat();
            }
        }
    }

    public static void find_min_max_number(float matrix[][], float min_max[]){
        min_max[0] = matrix[0][0];
        min_max[1] = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(min_max[0] > matrix[i][j]) min_max[0] = matrix[i][j];
                else if(min_max[1] < matrix[i][j]) min_max[1] = matrix[i][j];
            }
        }
    }

    public static float encryption(float x, float min_max[]){
        return (x - min_max[0])/(min_max[1] - min_max[0]);
    }

    public static void output(float matrix[][], float min_max[]){
        find_min_max_number(matrix, min_max);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(encryption(matrix[i][j], min_max)+ " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        float matrix[][] =  new float [n][m];
        float min_max[] = new float [2];
        input(matrix);
        output(matrix, min_max);
    }
}
