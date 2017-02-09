package Graph;

public class DFSProcessing {

	private boolean marked[];
	private int edgeTo[];
	private int s;
	

	public DFSProcessing(Graph g, int s){
		marked = new boolean[(int) g.getNoOfVertices()];
		edgeTo = new int[(int) g.getNoOfVertices()];
		DFS(g, s);
	}
	public void DFS(Graph g, int s){
		marked[s] = true;
		for(int w: g.adj(s)){
			
			if( !marked[w]){
				DFS(g, w);
				edgeTo[w] = s;
			}
		}
	}

	public static void main(String[] args) {

	}

}
