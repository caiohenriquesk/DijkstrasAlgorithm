package controller;
/**
 * This class contains an implementation of Dijkstra's algorithm.
 *
 * @author Caio Henrique, caiohenriquesk@gmail.com
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import model.Edge;
import model.Node;

public class DijkstrasAlgorithm {
  // Smallest epsilon value to compare double values.
  private static final double EPSILON = 1e-6;

  private int nodesQuantity;
  private double[] distance;
  private Integer[] previousNodes;
  private List<List<Edge>> graph;
  private Comparator<Node> comparator =
      new Comparator<Node>() {
        @Override
        public int compare(Node firstNode, Node secondNode) {
          if (Math.abs(firstNode.getValue() - secondNode.getValue()) < EPSILON) return 0;
          return (firstNode.getValue() - secondNode.getValue()) > 0 ? +1 : -1;
        }
      };

  /**
   * A constructor that provides the graph size and a starting node.
   * Use the addEdge method to add edges to the graph.
   *
   * @param nodesQuantity - The total quantity of nodes in the graph.
   */
  public DijkstrasAlgorithm(int nodesQuantity) {
    this.nodesQuantity = nodesQuantity;
    createEmptyGraph();
  }

  /**
   * Adds an edge to the graph using the initial node index (from), 
   * the node index that is connected (to) and the distance between both (distance).
   *
   * @param from - The index of the node the edge starts at. |
   * @param to - The index of the node the edge end at. |
   * @param distance - The edge distance between parameter 'from' to parameter 'to'. | A distancia entre o nó inicial e o nó final.
   */
  public void addEdge(int from, int to, int distance) {
	if(distance < 0) throw new IllegalArgumentException("Distance cannot be negative");
    graph.get(from).add(new Edge(from, to, distance));
  }

  /**
   * This method returns the created graph.
   * Esse método retorna o grafo criado.
   *
   * @return An List<List<Edge>> that represents the graph created. | Um List<List<Edge>> que representa o grafo criado.
   */
  public List<List<Edge>> getGraph() {
    return graph;
  }

  /**
   * This method reconstructs the shortest path of nodes from 'start' to 'end'.
   * Esse método reconstrói o menor caminho do nó inicial até o final.
   *
   * @param start - The initial index node. | O index do nó inicial.
   * @param end - The final index node. | O index do nó final.
   *
   * @return An array of nodes indexes of the shortest path from 'start' to 'end'. | Um Array de index dos nós do menor caminho entre o nó inicial e final.
   * If 'start' and 'end' are not connected then an empty array is returned. | Se o nó inicial e final não estiverem conectados, será retornado um array vazio.
   */
  public List<Integer> reconstructShortestPath(int start, int end) {
    if (end < 0 || end >= nodesQuantity) throw new IllegalArgumentException("Invalid node index");
    if (start < 0 || start >= nodesQuantity) throw new IllegalArgumentException("Invalid node index");
    double distance = findShortestDistance(start, end);
    List<Integer> path = new ArrayList<>();
    if (distance == Double.POSITIVE_INFINITY) return path;
    for (Integer at = end; at != null; at = previousNodes[at]) path.add(at);
    Collections.reverse(path);
    return path;
  }

  /**
   * This method runs Dijkstra's algorithm on a graph to find the shortest path 
   * between the start node and the end node.
   *
   * @param start - The initial index node.
   * @param end - The final index node.
   *
   * @return An double result that represents the shortest distance between the
   * starting node and the destination node. 
   * If there is no path between the starting node and the destination node the 
   * returned value is set to be Double.POSITIVE_INFINITY.
   */
  public double findShortestDistance(int start, int end) {
    // Maintain an array of the minimum distance to each node
	distance = new double[nodesQuantity];
	// Set infinity to all nodes value
    Arrays.fill(distance, Double.POSITIVE_INFINITY);
    // Set 0 to the initial node
    distance[start] = 0;

    // Keep a priority queue of the next most promising node to visit.
    PriorityQueue<Node> priorityQueue = new PriorityQueue<>(2 * nodesQuantity, comparator);
    priorityQueue.offer(new Node(start, 0));

    // Initiate an array used to track which nodes have already been visited.
    boolean[] visitedNodes = new boolean[nodesQuantity];
    previousNodes = new Integer[nodesQuantity];

    while (!priorityQueue.isEmpty()) {
      Node node = priorityQueue.poll();
      visitedNodes[node.getId()] = true;

      // If we found a better path before process this node, we just continue.
      if (distance[node.getId()] < node.getValue()) continue;

      List<Edge> edges = graph.get(node.getId());
      for (int i = 0; i < edges.size(); i++) {
		Edge edge = edges.get(i);
		
		// If the node was already been visited, continue
		if (visitedNodes[edge.getTo()]) continue;
		
		// Relax edge by updating minimum distance if it's applicable.
		double newDistance = distance[edge.getFrom()] + edge.getDistance();
		if (newDistance < distance[edge.getTo()]) {
		  previousNodes[edge.getTo()] = edge.getFrom();
		  distance[edge.getTo()] = newDistance;
		  priorityQueue.offer(new Node(edge.getTo(), distance[edge.getTo()]));
		}
      }
      // Once we've got through all nodes, we know we can return the 
      // minimum distance value to the end node because there isn't 
      // any more nodes to go through.
      if (node.getId() == end) return distance[end];
    }
    // If end node is unreachable
    return Double.POSITIVE_INFINITY;
  }

  // Create an empty graph with a number of nodes.
  private void createEmptyGraph() {
    graph = new ArrayList<>(nodesQuantity);
    for (int i = 0; i < nodesQuantity; i++) graph.add(new ArrayList<>());
  }
}