//Child Class of the template class
public class PRIMS extends TreegeneratingAlgo{

    private GeneratedTree tree;
    PRIMS(Graphs graph)
    {
        /*
            General Bfs algorithm will be implemented here and generate a tree which will will be put into tree variable.
        */
    }
    @Override
    GeneratedTree treegetter() {
        System.out.println("Prims tree getter");
        return tree;
    }
}
