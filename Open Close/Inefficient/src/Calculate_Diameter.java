public class Calculate_Diameter {
    Integer Diameter;
    GeneratedTree tree;
    /*
        To calculate diameter two bfs should be executed in succession.First one will determine the fartherest node from the
        root and second one will be run from that node to calculate diameter.
     */
    Integer CalculateDiameterofBFSTREE(BFS bfs)
    {
        tree=bfs.Bfstreegetter();
        /*

         */
        return Diameter;
    }
    Integer CalculateDiameterofDFSTREE(DFS dfs)
    {
        tree=dfs.Dfstreegetter();
        /*

         */
        return Diameter;
    }
    Integer CalculateDiameterofPRIMSTREE(PRIMS prims)
    {
        tree=prims.Primstreegetter();
        /*

         */
        return Diameter;
    }
}
