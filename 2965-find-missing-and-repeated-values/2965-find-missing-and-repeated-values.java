class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> hs = new HashSet<>();
        int ans[]= new int[2];
        int n=grid.length;
        int a=0;int b=0;
        int expectedSum=((n*n)*(n*n+1)/2);
        int actualSum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                actualSum+=grid[i][j];
                if(hs.contains(grid[i][j])){
                    a=grid[i][j];
                }
                hs.add(grid[i][j]);
            }
        }
        b= expectedSum + a - actualSum;
        return new int[]{a,b};
    }
}