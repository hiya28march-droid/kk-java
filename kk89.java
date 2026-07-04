public class kk89 {
    static void mazeallpath(String p,boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(maze[r][c]==false)return;
        maze[r][c]=false;
        if(r<maze.length-1)mazeallpath(p+'D',maze,r+1,c);
        if(c<maze[0].length-1)mazeallpath(p+'R',maze,r,c+1);
        if(r>0)mazeallpath(p+'U',maze,r-1,c);
        if(c>0)mazeallpath(p+'L',maze,r,c-1);
        maze[r][c]=true;

    }
    
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        mazeallpath("",maze,0,0);
    }
}
