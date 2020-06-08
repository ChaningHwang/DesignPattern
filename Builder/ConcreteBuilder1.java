package Builder;

public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.Add("part A");
    }

    @Override
    public void BuildPartB() {
        product.Add("part B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
