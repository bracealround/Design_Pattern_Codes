/*
    The open–closed principle states "software entities should be open for extension,
    but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.
 */

/*
    The Main Idea of The Code:
    Bfs,Dfs and Prims all algorithm though have different features,they all can generate a tree from a graph.Here,
    each of them takes a graph and after executing the operation they all generate a tree.On the other hand,
    Calculate_Diameter will take the tree and calculate the diameter of the tree.
 */

/*
    Why does this efficient implementation follow openclosed principle?
    Here BFS,DFS and PRIMS all are extended from an abstarct class TreegenratingAlgo and only implement the abstract method treegetter().
    Thus CalculateDiameter's CalculateDiameterof can take the object of the parent class and  if we pass that respective child class's
     object, the method of that specific child class gets called.Thus here is no need to change Calculate diameter each time a
     treegeneratingalgo's child class is created.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Efficient Open Close Principle");

        CalculateDiameter calculateDiameter=new CalculateDiameter();

        System.out.println(calculateDiameter.CalculateDiameterof(new BFS(new Graphs())));
        System.out.println(calculateDiameter.CalculateDiameterof(new DFS(new Graphs())));
        System.out.println(calculateDiameter.CalculateDiameterof(new PRIMS(new Graphs())));
    }
}
