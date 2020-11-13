/*
 * Title: The Units Project
 * Availability: https://github.com/LuisPedroMoura/The_Units_Project
 */

package units.units;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <b>Graph</b><p>
 * Implementation based on adjacencies lists.<p>
 *
 * @author Luis Moura (https://github.com/LuisPedroMoura)
 * @version 1.0.0
 */
public class Graph {
    /**
     * The Logger for this class.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Graph.class);

    /**
     * The list adjacency list.
     */
    private Map<Unit, List<Node>> adjList = new HashMap<>();
    /**
     * The size of the Graph.
     */
    private int size = 0;

    /**
     * The Graph Object Constructor.
     * @implNote assumes the Unit E (the Edge) is or extends Class Number.
     */
    public Graph() {
	}

    /**
     * The Graph Object Copy Constructor.
     * @param graph the Graph instance to be copied.
     */
    public Graph(final Graph graph) {
        this.size = graph.getSize();
        final Set<Unit> keys = graph.getAdjList().keySet();
        for (Unit key : keys) {
            final List<Node> newList = new ArrayList<>();
            final List<Node> list = graph.getAdjList().get(key);
            list.forEach(node -> newList.add(new Node(node)));
            this.adjList.put(new Unit(key), newList);
        }
    }


    /**
     * Getter for the <b>adjList</b> attribute.
     *
     * @return the <b>adjList</b> attribute.
     */
    public Map<Unit, List<Node>> getAdjList() {
        return adjList;
    }

    /**
     * Getter for the <b>size</b> attribute.
     *
     * @return the <b>size</b> attribute.
     */
    public int getSize() {
        return this.size;
    }


    /**
     * Adds a Vertx to the Graph.
     *
     * @param vertex to be added to the Graph.
     * @return true if vertex is added, false if it already exists.
     */
    public boolean addVertex(final Unit vertex) {
        if (!adjList.containsKey(vertex)) {
            adjList.put(vertex, new ArrayList<>());
            size++;

            LOGGER.debug("ADDED VERTEX: " + vertex);
            LOGGER.debug("GRAPH: " + this);

            return true;
        }
        return false;
    }

    /**
     * Adds an Edge to the Graph.
     *
     * @param edge        the Edge to be added.
     * @param startVertex the vertex to apply as outGoing edge.
     * @param endVertex   the vertex to apply as inComing edge
	 *                    (in the Node object)
     * @throws NullPointerException if any param is null
     * @return true if Edge is added, false if edge already exists
     */
    public boolean addEdge(final Double edge,
						   final Unit startVertex,
						   final Unit endVertex) {

        if (edge == null || startVertex == null || endVertex == null) {
            throw new NullPointerException();
        }

        // add new Vertices to the Graph
        addVertex(startVertex);
        addVertex(endVertex);
        this.size++;

        // A new Edge between existing connected vertices is not allowed
        for (final Node node : adjList.get(startVertex)) {
            if (node.getVertex().equals(endVertex)) {
                return false;
            }
        }

        // Edge does not exist, so its linked to vertices
        //adjList.get(startVertex).add(new Node(endVertex, edge));

        // create end Node and add to startVertex adjacency list
        final Node endNode = new Node(endVertex, edge);
        adjList.get(startVertex).add(endNode);

        LOGGER.debug("ADDED EDGE: " + startVertex
                + " -> " + edge + " -> " + endVertex);
        LOGGER.debug("Graph: " + this);

        return true;
    }

    /**
     * Verifies if a Vertex exists on the Graph.
     *
     * @param vertex the vertex to verify the existence of.
     * @return true if vertex is in the Graph.
     */
    public boolean containsVertex(final Unit vertex) {
        if (adjList.containsKey(vertex)) {
            return true;
        }
        return false;
    }

    /**
     * Verifies the existence of an Edge that connects the given vertices in
     * the correct direction.
     *
     * @param edge		  the Edge to verify the existence of.
     * @param startVertex the start Vertex.
     * @param endVertex   the end Vertex.
     * @return true if the edge is in the Graph.
     */
    public boolean containsEdge(final Double edge,
                                final Unit startVertex,
                                final Unit endVertex) {
        if (adjList.containsKey(startVertex)) {
            for (final Node node : adjList.get(startVertex)) {
                if (node.getEdge().equals(edge)
                        && node.getVertex().equals(endVertex)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Verifies the existence of an Edge between the given Vertices in the
     * correct direction.
     *
     * @param startVertex the start Vertex.
     * @param endVertex   the end Vertex
     * @return true if the Edge exists in the Graph.
     */
    public boolean containsEdge(final Unit startVertex, final Unit endVertex) {
        if (adjList.containsKey(startVertex)) {
            for (final Node node : adjList.get(startVertex)) {
                if (node.getVertex().equals(endVertex)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Verifies the existence of an Edge in the Graph.
     *
     * @param edge the edge to verify the existence of.
     * @return true if the Edge exists in the Graph.
     */
    public boolean containsEdge(final Double edge) {
        for (Unit key : adjList.keySet()) {
            for (final Node node : adjList.get(key)) {
                if (node.getEdge().equals(edge)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Getter for an Edge between two vertices.
     *
     * @param startVertex the start vertex.
     * @param endVertex   the end vertex.
     * @return the Edge.
     */
    public Double getEdge(final Unit startVertex, final Unit endVertex) {
        if (adjList.containsKey(startVertex)) {
            for (final Node node : adjList.get(startVertex)) {
                if (node.getVertex().equals(endVertex)) {
                    return node.getEdge();
                }
            }
        }
        return Double.POSITIVE_INFINITY;
    }

    /**
     * Getter for the outgoing Edges of a Vertex.
     *
     * @param vertex the vertex to get the outgoing edges from.
     * @return List<E> the list of outgoing Edges for vertex
     */
    public List<Double> getVertexOutgoingEdges(final Unit vertex) {
        final List<Double> newList = new ArrayList<>();
        for (final Node node : adjList.get(vertex)) {
            newList.add(node.getEdge());
        }
        return newList;
    }

    /**
     * Getter for the incoming Edges of a Vertex.
     *
     * @param vertex the vertex to get the incoming edges from.
     * @return List<E> the list of incoming Edges for vertex
     */
    public List<Double> getVertexIncomingEdges(final Unit vertex) {
        final List<Double> newList = new ArrayList<>();
        for (final Unit key : adjList.keySet()) {
            final List<Node> list = adjList.get(key);
            for (final Node node : list) {
                if (node.getVertex().equals(vertex)) {
                    newList.add(node.getEdge());
                }
            }
        }
        return newList;
    }

    /**
     * Getter for the outgoing neighbors of a vertex.
     *
     * @param vertex the vertex to get the outgoing neighbor of.
     * @return the outgoing neighbors of the given vertex.
     */
    public List<Unit> getVertexOutgoingNeighbors(final Unit vertex) {
        final List<Unit> newList = new ArrayList<>();
        adjList.get(vertex).forEach(node -> newList.add(node.getVertex()));
        return newList;
    }

    /**
     * Getter for the incoming neighbors of a vertex.
     *
     * @param vertex the vertex to get the incoming neighbors of.
     * @return the incoming neighbors of the given vertex.
     */
    public List<Unit> getVertexIncomingNeighbors(final Unit vertex) {
        final List<Unit> newList = new ArrayList<>();
        for (final Unit key : adjList.keySet()) {
            for (final Node node : adjList.get(key)) {
                if (node.getVertex().equals(vertex)) {
                    newList.add(key);
                }
            }
        }
        return newList;
    }

    /**
     * Get the destination Vertex of an Edge.
     *
     * @param startVertex the Edge starting vertex.
     * @param edge the edge
     * @return the destination vertex of the edge if it exists, else null.
     */
    public Unit getDest(final Unit startVertex, final Double edge) {
        for (final Node node : adjList.get(startVertex)) {
            if (node.getEdge().equals(edge)) {
                return node.getVertex();
            }
        }
        return null;
    }

    /**
     * Calculates the Dijkstra Shortest Path from a given Vertex.
     *
     * @param startVertex the vertex to start the calculation from.
     * @return the path.
     */
    public List<ArrayList<Unit>> dijkstraShortestPaths(final Unit startVertex) {

        // stores the minimum cost from startVertex to all other vertices
        final Map<Unit, Double> totalCosts = new HashMap<>();
        // stores the connections that build the minimum Cost Tree
        final Map<Unit, Unit> prevVertex = new HashMap<>();
        // improvised Priority Queue, easier to use
        final Map<Unit, Double> minPath = new HashMap<>();
        // keeps track of visited vertices
        final Set<Unit> visited = new HashSet<>();

        // TODO verify that this works with loops present and absent

        // initialize with startVertex
        if (getEdge(startVertex, startVertex) != null) {
            totalCosts.put(startVertex, getEdge(startVertex, startVertex));
            minPath.put(startVertex, getEdge(startVertex, startVertex));
        } else {
            totalCosts.put(startVertex, Double.POSITIVE_INFINITY);
            minPath.put(startVertex, Double.POSITIVE_INFINITY);
        }

        // initialize the cost to all vertices as infinity
        for (final Unit vertex : getAdjList().keySet()) {
            if (!vertex.equals(startVertex)) {
                totalCosts.put(vertex, Double.POSITIVE_INFINITY);
            }
        }

        // Dijkstra algorithm, runs while there are cheaper paths to be explored
        while (!minPath.isEmpty()) {

            // find the next Vertex to be analyzed by finding the minimum Path
            // so far
            Unit newSmallest = (Unit) minPath.keySet().toArray()[0];
            final double minPathsmallestValue = minPath.get(newSmallest);

            for (final Unit vertex : minPath.keySet()) {
                if (minPath.get(vertex) <= minPathsmallestValue) {
                    newSmallest = vertex;
                }
            }
            // once found, removes path that will be processed and adds vertex
            // as visited
            minPath.remove(newSmallest);
            visited.add(newSmallest);

            // search for neighbors and update paths costs
            final List<Unit> neighbors =
					getVertexOutgoingNeighbors(newSmallest);
            for (final Unit neighbor : neighbors) {
                // if already visited, no update necessary
                if (!visited.contains(neighbor)) {
                    // calculate path cost
                    double altPathCost = totalCosts.get(newSmallest)
                            + getEdge(newSmallest, neighbor);

                    // if calculated path cost is cheaper than previous
                    // calculation, replace and store information
                    if (neighbor != null
                            && altPathCost < totalCosts.get(neighbor)) {
                        // update total cost to get to this vertex
                        // (now is cheaper)
                        totalCosts.put(neighbor, altPathCost);
                        // update the previous vertex to this one that made the
                        // path cheaper
                        prevVertex.put(neighbor, newSmallest);
                        // store the new minimum path to later processing
                        minPath.put(neighbor, altPathCost);
                    }
                }
            }
        }

        // shortest paths are calculated but not organized, connection between
        // vertices that form the minimum Cost Tree are calculated but not
        // ordered. The following steps stores a List of Lists of all the
        // minimum cost paths starting in startVertex to all other vertices.
        final List<ArrayList<Unit>> shortestPaths = new ArrayList<>();

        final Set<Unit> vertexSet = getAdjList().keySet();

        // creates paths in reverse other (starting with endVertex to
        // startVertex)
        for (Unit vertex : vertexSet) {
            if (!vertex.equals(startVertex)) {
                final ArrayList<Unit> path = new ArrayList<>();
                path.add(vertex);
                while (!vertex.equals(startVertex)) {
                    final Unit next = prevVertex.get(vertex);
                    if (next == null) {
                        break;
                    }
                    path.add(next);
                    vertex = next;
                }
                if (path.size() > 1) {
                    Collections.reverse(path);
                    shortestPaths.add(path);
                }
            }
        }
        return shortestPaths;
    }

    /**
     * Calculates the Dijkstra Shortest Path from a given Vertex.
     * @implNote same as dijkstraShortestPaths() but all paths are considered
     * as having cost 1
     *
     * @param startVertex the vertex to start the calculation from.
     * @return the path.
     */
    public List<ArrayList<Unit>> dijkstraMinimumJumpsPaths(
    		final Unit startVertex) {

        // stores the minimum cost from startVertex to all other vertices
        final Map<Unit, Double> totalCosts = new HashMap<>();
        // stores the connections that build the minimum Cost Tree
        final Map<Unit, Unit> prevVertex = new HashMap<>();
        // improvised Priority Queue, easier to use
        final Map<Unit, Double> minPath = new HashMap<>();
        // keeps track of visited vertices
        final Set<Unit> visited = new HashSet<>();

        // initialize with startVertex
        totalCosts.put(startVertex, 0.0);
        minPath.put(startVertex, 0.0);

        // initialize the cost to all vertices as infinity
        for (final Unit vertex : getAdjList().keySet()) {
            if (!vertex.equals(startVertex)) {
                totalCosts.put(vertex, Double.POSITIVE_INFINITY);
            }
        }

        // Dijkstra algorithm, runs while there are cheaper paths to be explored
        while (!minPath.isEmpty()) {

            // find the next Vertex to be analyzed by finding the minimum Path
            // so far
            Unit newSmallest = (Unit) minPath.keySet().toArray()[0];
            double minPathsmallestValue = minPath.get(newSmallest);

            for (final Unit vertex : minPath.keySet()) {
                if (minPath.get(vertex) < minPathsmallestValue) {
                    newSmallest = vertex;
                }
            }
            // once found, removes path that will be processed and adds vertex
            // as visited
            minPath.remove(newSmallest);
            visited.add(newSmallest);

            // search for neighbors and update paths costs
            final List<Unit> neighbors =
					getVertexOutgoingNeighbors(newSmallest);
            for (final Unit neighbor : neighbors) {
                // if already visited, no update necessary
                if (!visited.contains(neighbor)) {
                    // calculate path cost
                    double altPathCost = totalCosts.get(newSmallest) + 1.0;
                    // if calculated path cost is cheaper than previous
                    // calculation, replace and store information
                    if (altPathCost < totalCosts.get(neighbor)) {
                        // update total cost to get to this vertex
                        // (now is cheaper)
                        totalCosts.put(neighbor, altPathCost);
                        // update the previous vertex to this one that made the
                        // path cheaper
                        prevVertex.put(neighbor, newSmallest);
                        // store the new minimum path to later processing
                        minPath.put(neighbor, altPathCost);
                    }
                }
            }
        }

        // shortest paths are calculated but not organized, connection between
        // vertices that form the minimum Cost Tree are calculated but not
        // ordered. The following steps stores a List of Lists of all the
        // minimum cost paths starting in startVertex to all other vertices.
        final List<ArrayList<Unit>> shortestPaths = new ArrayList<>();

        final Set<Unit> vertexSet = getAdjList().keySet();

        // creates paths in reverse other (starting with endVertex to
        // startVertex)
        for (Unit vertex : vertexSet) {
            if (!vertex.equals(startVertex)) {
                final ArrayList<Unit> path = new ArrayList<>();
                path.add(vertex);
                while (!vertex.equals(startVertex)) {
                    final Unit next = prevVertex.get(vertex);
                    if (next == null) {
                        break;
                    }
                    path.add(next);
                    vertex = next;
                }
                if (path.size() > 1) {
                    Collections.reverse(path);
                    shortestPaths.add(path);
                }
            }
        }
        return shortestPaths;
    }

    /**
     * Internal Class that represents a NOde of the Graph.
     * Contains Vertex and Incoming Edge.
     */
    public class Node {

        /**
         * The vertex of this node.
         */
        private final Unit vertex;
        /**
         * The incoming edge, or the cost to get to this node.
         */
        private final Double edge;
        /**
         * Flag that indicates if the node is parent.
         */
        private boolean isParent = false;

        /**
         * Node Object Constructor.
         *
         * @param vertex the vertex.
         * @param edge   the edge.
         */
        protected Node(final Unit vertex, final Double edge) {
            this.vertex = vertex;
            this.edge = edge;
        }

        /**
         * Node Object copy Constructor.
         *
         * @param node the node the copy.
         */
        protected Node(final Node node) {
            this.vertex = new Unit(node.getVertex());
            this.edge = node.getEdge();
        }

        /**
         * Getter for the <b>vertex</b> attribute.
         *
         * @return the <b>vertex</b> attribute.
         */
        protected Unit getVertex() {
            return vertex;
        }

        /**
         * Getter for the <b>edge</b> attribute.
         *
         * @return the <b>edge</b> attribute.
         */
        protected Double getEdge() {
            return edge;
        }

        /**
         * Getter for the <b>isParent</b> attribute.
         *
         * @return the <b>isParent</b> attribute.
         */
        protected boolean isParent() {
            return isParent;
        }

        /**
         * Setter for the <b>isParent</b> attribute.
         */
        protected void setAsParent() {
            isParent = true;
        }

    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Unit key : adjList.keySet()) {
            str.append(key + " ->");
            for (Node node : adjList.get(key)) {
                str.append("\n\t" + node.getVertex() + " " + node.getEdge()
                        + "  |  ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((adjList == null) ? 0 : adjList.hashCode());
        result = prime * result + size;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Graph other = (Graph) obj;
        if (adjList == null) {
            if (other.adjList != null) {
                return false;
            }
        } else if (!adjList.equals(other.adjList)) {
            return false;
        }
        if (size != other.size) {
            return false;
        }
        return true;
    }
}
