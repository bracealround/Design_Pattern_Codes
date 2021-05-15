/*
    The open–closed principle states "software entities should be open for extension,
    but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.
 */

/*
    The Main Idea of The Code:
    Bfs,Dfs and Prims all algorithm though have different features,they all can generate a tree from a graph.Here,
    each of them takes a graph and after executing the operation they all generate a tree.On the other hand,
    Calculate_Diameter will take trees and calculate the diameter of the tree.
 */

    /*
        Why doesn't inefficient code doesn't follow the open closed principle?:
        Every Time an algorithm will generate a tree(like Kruskal) a different method has to be introduced in the
        Calculate_Diameter class to calculate that trees diameter.This is a definite violation of the open-close principle
        because it requires the modification of the existing class Calculate_Diameter.
     */
public class Main {
    public static void main(String[] args) {
        System.out.println("Inefficient Open Closed Principle");
    }
}
