package model;
/**
 * This node class it's created just to track nodes to visit
 * while Dijkstra's algorithm it's running.
 *
 * @author Caio Henrique, caiohenriquesk@gmail.com
 */

public class Node {
	private int id;
	private double value;
	
	public Node(int id, double value) {
		this.id = id;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}