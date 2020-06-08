package Builder;

public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.Add("part X");
    }

    @Override
    public void BuildPartB() {
        product.Add("part Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
