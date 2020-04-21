package model;
/**
 * This edge class represent a directed edge between two nodes with a certain distance.
 *
 * @author Caio Henrique, caiohenriquesk@gmail.com
 */

public class Edge {
   private double distance;
   private int from, to;
   
   public Edge(int from, int to, double distance) {
	   this.from = from;
	   this.to = to;
	   this.distance = distance;   
   }

	public double getDistance() {
		return distance;
	}
	public void setDistance(double cost) {
		this.distance = cost;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
}