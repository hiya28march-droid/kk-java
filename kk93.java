public class kk93 {
    static void nknights(boolean[][] board,int row,int col,int targets){
        if(targets==0){
            display(board);
            System.out.println();
            return ;
        }
        if(row==board.length){
            return;
        }
        if( col==board.length){
            nknights(board,row+1,0,targets);
            return ;
            
        }
        if(issafe(board,row,col)){
            board[row][col]=true;
            nknights(board,row,col+1,targets-1);
            board[row][col]=false;
        }
        nknights(board,row,col+1,targets);

    }
    static boolean issafe(boolean[][] board,int row,int col){
       if(isvalid(board,row-2,col-1)){
        if(board[row-2][col-1]){
            return false;
        }
        }
        if(isvalid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isvalid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isvalid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
       }

    static boolean isvalid(boolean[][] board,int row,int col){
        if(row>=0 && row<board.length && col>=0 && col<board[0].length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]){
                    System.out.print("K");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        nknights(board,0,0,3);
    }
    
}
