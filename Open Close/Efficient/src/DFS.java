//Child Class of the template class
public class DFS extends TreegeneratingAlgo{
    private GeneratedTree tree;
    DFS(Graphs graph)
    {
        /*
            General Bfs algorithm will be implemented here and generate a tree which will will be put into tree variable.
        */
    }
    @Override
    GeneratedTree treegetter() {
        System.out.println("Dfs tree getter");
        return tree;
    }
}
