package leson_1.tms.Shildt.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][]= new int[3][3];
        int i, j, k = 0;

        for (i=0; i<twoD.length; i++)
            for ( j=0; j<twoD.length; j++) {
                twoD[i][j] = k;
                k++;
            }

        for (i=0; i<4; i++){
            for ( j=0; j<5; j++)
                System.out.print( twoD[i][j]+" ");
            System.out.println();
        }



    }
}
