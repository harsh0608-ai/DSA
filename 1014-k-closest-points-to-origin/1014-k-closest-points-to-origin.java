class Solution {
    static class point implements Comparable<point>{
        int x;
        int y;
        int dis;
        public point(int x,int y,int d){
            this.x=x;
            this.y=y;
            this.dis=d;
        }
        @Override
        public int compareTo(point p2){
            return this.dis-p2.dis;
        }

    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue <point>pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int disSqr=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new point(points[i][0],points[i][1],disSqr));

        }
        int result[][]=new int[k][2];
        for(int i=0;i<k;i++){
            point p=pq.remove();
            result[i][0]=p.x;
            result[i][1]=p.y;
        }
        return result;
    }
}