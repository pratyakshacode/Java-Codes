public class TransformMatrix {
    public static void main(String[] args) {
        
        int [][] initial = new int [][]{
            {1,2},
            {3,4}
        };

        int ans [][] = new int[4][1];

        int cnt = 0;

        for(int i=0; i<initial.length; i++){
            for(int j=0; j<initial[0].length; j++){

                ans[cnt/1][cnt%1] = initial[i][j];
                cnt++;
            }
        }

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){

                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
