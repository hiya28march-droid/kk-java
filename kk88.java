public class kk88 {
    static void mazewithobstacles(String p,boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(maze[r][c]==false)return;
        maze[r][c]=false;
        if(r<maze.length-1)mazewithobstacles(p+'D',maze,r+1,c);
        if(c<maze[0].length-1)mazewithobstacles(p+'R',maze,r,c+1);
        maze[r][c]=true;
    }
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        mazewithobstacles("",maze,0,0);
    }
    
}
