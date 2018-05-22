import java.util.ArrayList;
import java.util.HashMap;
public class Graph {
    private ArrayList<Project> nodes = new ArrayList<>();
    private HashMap<String,Project> map = new HashMap<>();
    
    public Project formNode(String name) {
        if (!map.containsKey(name)) {
            Project node = new Project(name);
            nodes.add(node);
            map.put(name,node);
        }
        return map.get(name);
    }

    public void addEdge(String startEdge, String endEdge) {
        Project start = formNode(startEdge);
        Project end = formNode(endEdge);
        start.addNeighbour(end);
    }

    public ArrayList<Project> getNodes(){
        return nodes;
    }
}
