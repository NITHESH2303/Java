import java.util.ArrayList;
import java.util.List;

// import java.util.* ;

// class test {
//     // Class for storing a Point's data
//     static class Point {
//         int x, y;
//         int dis;

//         public Point(int x, int y, int dis)
//         {
//             this.x = x;
//             this.y = y;
//             this.dis = dis;
//         }
//     }

//     // Utility method returns true if (x, y) lies
//     // inside Boarda
//     static boolean isInside(int x, int y, int N)
//     {
//         if (x >= 0 && x < N && y >= 0 && y < N)
//             return true;
//         return false;
//     }

//     public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {

//         int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
//         int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
//         int minDistance = Integer.MAX_VALUE;
//         Queue<Point> queue = new ArrayDeque<>();
//         queue.add(new Point(startRow, startCol,0));

//         Point t;
//         int x, y;
//         boolean visit[][] = new boolean[n][n];
//         // make all Point unvisited
//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++)
//                 visit[i][j] = false;

//         visit[startRow][startCol] = true;

//         while (!queue.isEmpty()) {
//             t = queue.poll();

//             if (t.x == endRow && t.y == endCol){
//                 if(minDistance > t.dis)
//                 minDistance =  t.dis;
//             }
//             for (int i = 0; i < 8; i++) {
//                 x = t.x + dx[i];
//                 y = t.y + dy[i];

//                 // If reachable state is not yet visited and
//                 // inside board, push that state into queue
//                 if (isInside(x, y, n) && !visit[x][y]) {
//                     visit[x][y] = true;
//                     queue.add(new Point(x, y, t.dis + 1));
//                 }
//             }
//         }
//         return minDistance == Integer.MAX_VALUE? -1:minDistance;
//     }
//     // Driver code
//     public static void main(String[] args)
//     {
//         System.out.println( minMoves(7, 6, 6, 1,0));
//     }
// }

// class test {

//     public static void main(String[] args) {
//         List<String> letterCombinations = new ArrayList<String>();
//         System.out.println(letterCombinations("23"));
//     }

//     final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
// 	{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
//     public static List<String> letterCombinations(String digits) {
//         int len = digits.length();
//         List<String> ans = new ArrayList();
//         if (len==0)
//             return ans;
//         else{
//             rec(0,len,ans,digits,new StringBuilder());
//                 return ans;
//         }
//     }
//     static void rec(int pos,int len,List<String>ans,String digits, StringBuilder sb){
//         if(pos==len){
//             ans.add(sb.toString());
//         }
//         else{
//             char[] letter = L[digits.charAt(pos) - '0'];
//             for (int i = 0; i<letter.length;i++){
//                 rec(pos+1,len,ans,digits,new StringBuilder(sb).append(letter[i]));
//             }
//         }
//     }
// }
class Test{
    public int numSquares(int n) {
        int count = 0;
        int temp = n/3;
        for(int i=temp;i>0;i--){
            if(i*i<=n){
                n-=i*i;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.
    }
}

