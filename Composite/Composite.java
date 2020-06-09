package Composite;

import java.util.*;

public class Composite extends Component {
    private List<Component> children = new ArrayList();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        children.add(c);
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.append(name).toString());

        for(Component component : children) {
            component.Display(depth + 2);
        }
    }
}
