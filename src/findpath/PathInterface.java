/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findpath;

import java.util.Collection;

/**
 * Interface PathInterface describes methods that have to be implemented by the class:
 * <p>
 * buildGraph - for reading a text file (containing a binary information)
 *              and building a graph after converting a binary information to decimal;
 * <p>
 * decompress - for decoding a text located in a given node;
 * <p>
 * findPath - for finding a shortest path between two nodes;
 * <p>
 * getPathString - keeps decoded paths between two given nodes;
 *
 */
public interface PathInterface {

    /*
    metoda, która jest odpowiedzialna za odczytanie pliku graph.txt, zamiane 
    informacji zapisanej w postaci binarnej na dziesietna oraz zbudowanie 
    grafu na podstawie odczytanego i rozkodowanego kodu binarnego
    @param fileName - the name of a text file, containing graph information.
    */
    public Graph buildGraph(String fileName);

    /*
    metoda dekodujaca i zwracajaca ciag znakow znajdujacy sie w zadanym wezle;
    @param Graph - object of class Graph;
    @param node - node for decoding;
    @param code - text to decode;
    */
    public String decompress(Graph Graph, int node, String code);

    /*
    metoda znajdująca najkrotsza ścieżkę (numry wezlow) pomiędzy dwoma wezlami 
    zadanymi na wejsciu
    @param Graph - object of class Graph;
    @param beginingNode - start node in path;
    @param destinationNode - end node in path;
    */
    public String findPath(Graph Graph, int beginingNode, int destinationNode);

    /*
    metoda zwracajaca rozkodowany ciag znakow, które sa przechowywane przez 
    poszczegolne wezly w najkrotszej sciezce pomiedzy dwoma wezlami oznaczonymi 
    jako beginingNode oraz destinationNode
    @param Graph - object of class Graph;
    @param beginingNode - start node in a shortest path;
    @param destinationNode - end node in a shortest path;
    */
    public String getPathString(Graph Graph, int beginingNode, int destinationNode);

}