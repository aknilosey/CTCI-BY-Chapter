import java.util.ArrayList;
import java.util.Stack;
public class CTCI47 {
    //To find the order in which projects should be covered on the basis of dependency
    //topological sort is done. DFS is used to find the order, the node which
    //is first removed from the stack should be the first in the order to build
    public static Stack<Project> buildOrder(String[] projects, String[][] dependencies) {
        Graph graph =  buildGraph(projects,dependencies);
        return orderOfProjects(graph.getNodes());
    }

    public static Stack<Project> orderOfProjects(ArrayList<Project> projects) {
    Stack<Project> stack = new Stack<Project>();
        for (Project project: projects) {
            if (project.getState() == Project.State.BLANK) {
                if(!doDFS(project,stack)) {
                    return null;
                }
            }
        }
        return stack;
    }
    public static Graph buildGraph(String[] projects, String[][] dependencies) {
        Graph graph = new Graph();
        for (String project: projects) {
            graph.formNode(project);
        }
        for (String [] dependency:dependencies) {
            String firstName = dependency[0];
            String secondName = dependency[1];
            graph.addEdge(firstName,secondName);
        }
        return graph;

    }
    public static boolean doDFS(Project project, Stack<Project> stack) {
        if (project.getState() == Project.State.PARTIAL) {
            return false;
        }
        if (project.getState() == Project.State.BLANK) {
            project.setState(Project.State.PARTIAL);
            ArrayList<Project> children = project.getChildren(); 
            for (Project child: children) {
                if (!doDFS(child,stack)) {
                    return false;
                }
            }
            Project.setState(Project.State.COMPLETE);
            stack.push(project);
        }
        return true;
    }
    public static void main(String[] args) {
        String[] projects = {"a", "b", "c", "d", "e", "f"};
		String[][] dependencies = {
				{"a", "d"},
				{"f", "b"},
				{"b", "d"},
				{"f", "a"},
				{"d", "c"}}; 
       Stack<Project> order = buildOrder(projects, dependencies);
        System.out.println(order);
    }
}
