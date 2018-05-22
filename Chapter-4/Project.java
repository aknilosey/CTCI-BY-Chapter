import java.util.ArrayList;
import java.util.HashMap;
public class Project {
    private ArrayList<Project> children = new ArrayList<>();
    private HashMap<String, Project> map = new HashMap<>();
    private int dependencies;
    private String name;
    
    public Project (String name) {
        this.name = name;
    }

    public enum State {
        PARTIAL,
        COMPLETE,
        BLANK,
    };

    private State state = Project.State.BLANK;
    public State getState() {
        return state;
    }

    public static void setState(State state) {
        state = state;
    }
    
    public void addNeighbour(Project node) {
        if (!map.containsKey(node.getName())) {
            children.add(node);
            map.put(node.getName(),node);
            node.incrementDependencies();
        }
    }
    
    public void incrementDependencies() {
        dependencies++;
    }


    public void decrementDependencies() {
        dependencies--;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Project> getChildren() {
        return children;
    }

    public int getDependencies() {
        return dependencies;
    }

}
