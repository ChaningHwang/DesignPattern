package Composite;

public class Leaf extends Component {
    public Leaf(String name){
        super(name);
    }
    @Override
    public void Add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void Display(int depth) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.append(name).toString());
    }
}
