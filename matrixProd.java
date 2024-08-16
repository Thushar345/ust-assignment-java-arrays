package src;

public class matrixProd {

	public static void main(String[] args){
		int[][] matrixA={{2,3},{1,2}};
        int[][] matrixB={{2,4},{2,1}};

        int[][] resultMatrix=new int[2][2];

        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                resultMatrix[i][j] = 0;
                for (int k=0; k<2; k++){
                    resultMatrix[i][j]+=matrixA[i][k]*matrixB[k][j];
                }
            }
        }

        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

	}

}
