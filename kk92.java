public class kk92 {
    static void nqueens(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return ;
        }
        //to check every column in current row
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
                board[row][col]=true;
                nqueens(board,row+1);
                board[row][col]=false;
            }
        }
    }
    static boolean issafe(boolean[][] board,int row,int col){
        //check this column on upper side
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxleft=Math.min(row,col);
        //check upper left diagonal
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxright=Math.min(row,board.length-col-1);
        //check upper right diagonal
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
                
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];
        nqueens(board,0);
    }
}