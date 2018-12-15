package oop;

public class Matrix {
    int[][] array;
    int lines, columns;


    void matrixSum(int[][]array){
this.array = array;
this.lines = array.length;
this.columns = array[0].length;
    }

    void sum(Matrix matrix){
        if(this.lines == matrix.lines
        && this.columns ==matrix.columns){
            //for and for i and j
            //sum[i][j]=1array[i][j]+2array[i][j]

        }
        else{
            System.out.println("matrixes not equal");
        }
        //return new matrix sum;

    }
void multiplication(Matrix matrix){

}
void print(){
        System.out.println();
}

}
