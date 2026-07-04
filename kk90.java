public class kk90 {
    static void matrixallpath(String p,boolean[][] maze,int[][] path,int step,int r,int c){
        if(maze[r][c]==false){
            return;
        }
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int i=0;i<path.length;i++){
                for(int j=0;j<path[0].length;j++){
                    System.out.println(path[i][j]+" ");
                    
                }
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1)matrixallpath(p+'D',maze,path,step+1,r+1,c);
        if(c<maze[0].length-1)matrixallpath(p+'R',maze,path,step+1,r,c+1);
        if(r>0)matrixallpath(p+'U',maze,path,step+1,r-1,c);
        if(c>0)matrixallpath(p+'L',maze,path,step+1,r,c-1);
        maze[r][c]=true;
        path[r][c]=0;

    }
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        matrixallpath("",maze,new int[maze.length][maze[0].length],1,0,0);
    }


}
