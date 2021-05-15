//Child Class of the template class
public class BFS extends TreegeneratingAlgo{
    private GeneratedTree tree;
    BFS(Graphs graph)
    {
        /*
            General Bfs algorithm will be implemented here and generate a tree which will will be put into tree variable.
        */
    }
    @Override
    GeneratedTree treegetter() {
        System.out.println("Bfs Tree Getter");
        return tree;
    }
}
