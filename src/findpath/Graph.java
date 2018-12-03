/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package findpath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Class "Graph" describes an object of type Graph with specified number of nodes,
 * dictionary for storing neighbours of each node and a list with node's weights.
 *
 * <p>
 * @author Adam Górski
 * @version 1.0
 * @since   2018-12-03
 */

public class Graph {

    private final int numberOfNodes;

    /**
     * Constructor for a class:
     * @param number assigns number of nodes to field numberOfNodes.
     */
    public Graph(int number)
    {
        this.numberOfNodes = number;
    }
    /**
     * Method Getter:
     * @return value of a field numberOfNodes.
     */

    public int getnumberOfNodes()
    {
        return numberOfNodes;
    }

    //mapa przechowujaca liste sasiedztwa dla tworzonego grafu
    Map <Integer, ArrayList<Integer>> nodes = new HashMap <>();

    //lista zawierajaca informacje przechowywane w poszczegolnych wezlach grafu
    ArrayList<String> interiorOfNodes = new ArrayList<>();
}