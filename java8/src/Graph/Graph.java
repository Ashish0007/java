package Graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Graph {

	private final long noOfVertices;
	private static List<Integer>[] adjanceyList;
	
	
	@SuppressWarnings("unchecked")
	public Graph(int noOfVetices) {
		this.noOfVertices = noOfVetices;
		adjanceyList = (ArrayList[])new ArrayList[noOfVetices];
		for(int i = 0; i< noOfVetices; i++){
			adjanceyList[i] = new ArrayList<>();
		}
	}
	
	public static void addEdge(int v,int w){
		adjanceyList[v].add(w);
		adjanceyList[w].add(v);
	}
	
	public Iterable<Integer> adj(int v){
		return adjanceyList[v];
	}

	public long getNoOfVertices() {
		return noOfVertices;
	}
	
	public  static void addVertices(String line){
		
		String[] vertices = line.split(":");
		int v = Integer.parseInt(vertices[0]);
		String[] connectedVertices = vertices[1].split(" ");
		Arrays.asList(connectedVertices)
				.stream()
				.forEach(
						 vertex ->{
							int w = Integer.parseInt(vertex);
							addEdge(v, w);
						}
						);
	}
	
	public static void main(String[] args) {
		System.out.println();
		
		try {
			Long vertexCount = Files.lines(Paths.get("D://Java//java8//src//Graph//DFSInput.txt")).count();
			Graph g = new Graph(Integer.parseInt(vertexCount.toString()));
			Stream<String> lines = Files.lines(Paths.get("D://Java//java8//src//Graph//DFSInput.txt"));
			lines.forEach(line -> {
				addVertices(line);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
		}
		
		System.out.println();
		
	}
}
