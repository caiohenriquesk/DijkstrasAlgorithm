package test;
import controller.DijkstrasAlgorithm;

public class Main {
	
	public static void main(String[] args) {
		//firstExemple();
		//secondExemple();
		//thirdExemple();
		forthExemple();
		//fifthExemple();
	}

	private static void fifthExemple() {
		DijkstrasAlgorithm d = new DijkstrasAlgorithm(12);
		//A - Node 0
		d.addEdge(0, 1, 10); 	//A -> B = 10
		d.addEdge(0, 4, 2); 	//A -> E = 2
		d.addEdge(0, 5, 8); 	//A -> F = 8
		//B - Node 1
		d.addEdge(1, 0, 10); 	//B -> A = 10
		d.addEdge(1, 2, 2); 	//B -> C = 2
		d.addEdge(1, 5, 3); 	//B -> F = 3
		//C - Node 2
		d.addEdge(2, 1, 2); 	//C -> B = 2
		d.addEdge(2, 3, 2); 	//C -> D = 2
		d.addEdge(2, 5, 5); 	//C -> F = 5
		d.addEdge(2, 6, 1); 	//C -> G = 1
		//D - Node 3
		d.addEdge(3, 2, 2); 	//D -> C = 2
		d.addEdge(3, 6, 2); 	//D -> G = 2
		d.addEdge(3, 7, 9); 	//D -> H = 9
		//E - Node 4
		d.addEdge(4, 0, 2); 	//E -> A = 2
		d.addEdge(4, 5, 6); 	//E -> F = 6
		d.addEdge(4, 8, 1); 	//E -> I = 1
		d.addEdge(4, 9, 3); 	//E -> J = 3
		//F - Node 5
		d.addEdge(5, 0, 8); 	//F -> A = 8
		d.addEdge(5, 1, 3); 	//F -> B = 3
		d.addEdge(5, 2, 5); 	//F -> C = 5
		d.addEdge(5, 4, 6); 	//F -> E = 6
		d.addEdge(5, 6, 3); 	//F -> G = 3
		d.addEdge(5, 9, 2); 	//F -> J = 2
		//G - Node 6
		d.addEdge(6, 2, 1); 	//G -> C = 1
		d.addEdge(6, 3, 2); 	//G -> D = 2
		d.addEdge(6, 5, 3); 	//G -> F = 3
		d.addEdge(6, 7, 10); 	//G -> H = 10
		d.addEdge(6, 9, 6); 	//G -> J = 6
		d.addEdge(6, 10, 9); 	//G -> K = 9
		d.addEdge(6, 11, 4); 	//G -> L = 4
		//H - Node 7
		d.addEdge(7, 3, 10); 	//H -> D = 9
		d.addEdge(7, 6, 5); 	//H -> G = 10
		d.addEdge(7, 11, 3); 	//H -> L = 5
		//I - Node 8
		d.addEdge(8, 4, 1); 	//I -> E = 1
		d.addEdge(8, 9, 3); 	//I -> J = 3
		//J - Node 9
		d.addEdge(9, 4, 3); 	//J -> E = 3
		d.addEdge(9, 5, 2); 	//J -> F = 2
		d.addEdge(9, 6, 6); 	//J -> G = 6
		d.addEdge(9, 8, 3); 	//J -> I = 3
		d.addEdge(9, 10, 2); 	//J -> K = 2
		//K - Node 10
		d.addEdge(10, 6, 9); 	//K -> G = 9
		d.addEdge(10, 9, 2); 	//K -> J = 2
		d.addEdge(10, 11, 1); 	//K -> L = 1
		//L - Node 11
		d.addEdge(11, 6, 4); 	//L -> G = 4
		d.addEdge(11, 7, 5); 	//L -> H = 5
		d.addEdge(11, 10, 1); 	//L -> K = 1
		System.out.println(d.findShortestDistance(1, 7));
		System.out.println(d.reconstructShortestPath(1, 7));
	}

	private static void forthExemple() {
		DijkstrasAlgorithm d = new DijkstrasAlgorithm(7);
		//A - Node 0
		d.addEdge(0, 1, 4); 	//A -> B = 4
		d.addEdge(0, 2, 3); 	//A -> C = 3
		d.addEdge(0, 4, 7); 	//A -> E = 7
		//B - Node 1
		d.addEdge(1, 0, 4); 	//B -> A = 4
		d.addEdge(1, 2, 6); 	//B -> C = 6
		d.addEdge(1, 3, 5); 	//B -> D = 5
		//C - Node 2
		d.addEdge(2, 0, 3); 	//C -> A = 3
		d.addEdge(2, 1, 6); 	//C -> B = 6
		d.addEdge(2, 3, 11); 	//C -> D = 11
		d.addEdge(2, 4, 8); 	//C -> E = 8
		//D - Node 3
		d.addEdge(3, 1, 5); 	//D -> B = 5
		d.addEdge(3, 2, 11); 	//D -> C = 11
		d.addEdge(3, 4, 2); 	//D -> E = 2
		d.addEdge(3, 5, 2); 	//D -> F = 2
		d.addEdge(3, 6, 10); 	//D -> G = 10
		//E - Node 4
		d.addEdge(4, 0, 7); 	//E -> A = 7
		d.addEdge(4, 2, 8); 	//E -> C = 8
		d.addEdge(4, 3, 2); 	//E -> D = 2
		d.addEdge(4, 6, 5); 	//E -> G = 5
		//F - Node 5
		d.addEdge(5, 3, 2); 	//F -> D = 2
		d.addEdge(5, 6, 3); 	//F -> G = 3
		//G - Node 6
		d.addEdge(6, 3, 10); 	//G -> D = 10
		d.addEdge(6, 4, 5); 	//G -> E = 5
		d.addEdge(6, 5, 3); 	//G -> F = 3
		System.out.println(d.findShortestDistance(0, 5));
		System.out.println(d.reconstructShortestPath(0, 5));
	}

	private static void thirdExemple() {
		DijkstrasAlgorithm d = new DijkstrasAlgorithm(5);
		//A - Node 0
		d.addEdge(0, 1, 6); 	//A -> B = 6
		d.addEdge(0, 3, 1); 	//A -> D = 1
		//B - Node 1
		d.addEdge(1, 0, 6); 	//B -> A = 6
		d.addEdge(1, 2, 5); 	//B -> C = 5
		d.addEdge(1, 3, 2); 	//B -> D = 2
		d.addEdge(1, 4, 2); 	//B -> E = 2
		//C - Node 2
		d.addEdge(2, 1, 5); 	//C -> B = 5
		d.addEdge(2, 4, 5); 	//C -> E = 5
		//D - Node 3
		d.addEdge(3, 0, 1); 	//D -> A = 1
		d.addEdge(3, 1, 2); 	//D -> B = 2
		d.addEdge(3, 4, 1); 	//D -> E = 1
		//E - Node 4
		d.addEdge(4, 1, 2); 	//E -> B = 2
		d.addEdge(4, 2, 5); 	//E -> C = 5
		d.addEdge(4, 3, 1); 	//E -> D = 1
		System.out.println(d.findShortestDistance(0, 2));
		System.out.println(d.reconstructShortestPath(0, 2));
	}

	private static void secondExemple() {
		DijkstrasAlgorithm d = new DijkstrasAlgorithm(8);
		//A - 0 
		d.addEdge(0, 1, 8); 	//A -> B = 8
		d.addEdge(0, 3, 5); 	//A -> D = 5
		d.addEdge(0, 2, 2); 	//A -> C = 2
		//B - 1
		d.addEdge(1, 0, 8); 	//B -> A = 8
		d.addEdge(1, 3, 2); 	//B -> D = 2
		d.addEdge(1, 5, 13); 	//B -> F = 13
		//C - 2
		d.addEdge(2, 0, 2); 	//C -> A = 2
		d.addEdge(2, 3, 2); 	//C -> D = 2 
		d.addEdge(2, 4, 5); 	//C -> E = 5
		//D - 3
		d.addEdge(3, 0, 5); 	//D -> A = 5
		d.addEdge(3, 1, 2); 	//D -> B = 2
		d.addEdge(3, 2, 2); 	//D -> C = 2
		d.addEdge(3, 4, 1); 	//D -> E = 1
		d.addEdge(3, 5, 6); 	//D -> F = 6
		d.addEdge(3, 6, 3); 	//D -> G = 3
		//E - 4
		d.addEdge(4, 2, 5); 	//E -> C = 5
		d.addEdge(4, 3, 1); 	//E -> D = 1
		d.addEdge(4, 6, 1); 	//E -> G = 1
		//F - 5
		d.addEdge(5, 1, 13); 	//F -> B = 13
		d.addEdge(5, 3, 6); 	//F -> D = 6
		d.addEdge(5, 6, 2); 	//F -> G = 2
		d.addEdge(5, 7, 3); 	//F -> H = 3
		//G - 6
		d.addEdge(6, 3, 3); 	//G -> D = 3
		d.addEdge(6, 4, 1); 	//G -> E = 1
		d.addEdge(6, 5, 2); 	//G -> F = 2
		d.addEdge(6, 7, 6); 	//G -> H = 6
		//H - 7
		d.addEdge(7, 5, 3); 	//H -> F = 3
		d.addEdge(7, 6, 6); 	//H -> G = 6
		System.out.println(d.findShortestDistance(0, 7));
		System.out.println(d.reconstructShortestPath(0, 7));
	}

	private static void firstExemple() {
		DijkstrasAlgorithm d = new DijkstrasAlgorithm(5);
		d.addEdge(0, 1, 4);
		d.addEdge(0, 2, 1);
		d.addEdge(2, 1, 2);
		d.addEdge(2, 3, 5);
		d.addEdge(1, 3, 1);
		d.addEdge(3, 4, 3);
		System.out.println(d.findShortestDistance(0, 4));
		System.out.println(d.reconstructShortestPath(0, 4));
	}
	
}
