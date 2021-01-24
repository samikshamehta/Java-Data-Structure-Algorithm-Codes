import java.util.Scanner;


public class codingbelt {

	/**
	 * @param args
	 */
	static int n ; 
	static int m ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[][] array= new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				array[i][j]=s.nextInt();
			}
		}
	    computeLargestConnectedGrid(array); 
	}
	static final int visited[][] = new int [n][m]; 
	static final int result[][] = new int [n][m]; 
	static int COUNT; 
	static void BFS(int x, int y, int i,int j, int input[][]) 
	{ 
		if (x != y) 
			return; 
			visited[i][j] = 1; 
			COUNT++; 
			int x_move[] = { 0, 0, 1, -1 }; 
			int y_move[] = { 1, -1, 0, 0 }; 
			for (int u = 0; u < 4; u++) 
				if ((is_valid(i + y_move[u], j + x_move[u], x, input)) == true) 
					BFS(x, y, i + y_move[u], j + x_move[u], input); 
	} 
	static boolean is_valid(int x, int y, int key,int input[][]) 
	{ 
		if (x < n && y < m && x >= 0 && y >= 0)  
		{ 
			if (visited[x][y] == 0 &&  input[x][y] == key) 
				return true; 
				else
				return false; 
		} 
		else
		return false; 
	} 
	static void reset_visited() 
	{ 
	    for (int i = 0; i < n; i++) 
	        for (int j = 0; j < m; j++) 
	         visited[i][j] = 0; 
	} 
	static void print_result(int res) 
	{ 
	    System.out.println (res ); 
	    for (int i = 0; i < n; i++) 
	    { 
	        for (int j = 0; j < m; j++)  
	        { 
	            if (result[i][j] != 0) 
	                System.out.print(result[i][j] + " "); 
	            else
	                System.out.print(". "); 
	        } 
	        System.out.println(); 
	    } 
	} 
	static void reset_result(int key, int input[][]) 
	{ 
		for (int i = 0; i < n; i++)  
		{ 
			for (int j = 0; j < m; j++)  
			{ 
				if (visited[i][j] ==1 &&  input[i][j] == key) 
					result[i][j] = visited[i][j]; 
				else
					result[i][j] = 0; 
			} 
		} 
	}
	public static void computeLargestConnectedGrid(int input[][]) 
	{ 
	    int current_max = Integer.MIN_VALUE; 
	    for (int i = 0; i < n; i++)  
	    { 
	        for (int j = 0; j < m; j++) 
	        { 
	            reset_visited(); 
	            COUNT = 0; 
	            if (j + 1 < m) 
	             BFS(input[i][j], input[i][j + 1],i, j, input); 
	             if (COUNT >= current_max) 
		            { 
		                current_max = COUNT; 
		                reset_result(input[i][j], input); 
		            } 
		            reset_visited(); 
		            COUNT = 0; 
	            if (i + 1 < n) 
	                BFS(input[i][j],input[i + 1][j], i, j, input); 
	            if (COUNT >= current_max)  
	            { 
	                current_max = COUNT; 
	                reset_result(input[i][j], input); 
	            } 
	        } 
	    } 
	    print_result(current_max); 
	}   	  
}