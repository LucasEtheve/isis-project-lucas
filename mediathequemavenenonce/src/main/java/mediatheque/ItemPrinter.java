package mediatheque;

/**
 *
 * @author lucasetheve
 */
public class ItemPrinter implements ItemVisitor{

    @Override
    public void visit(Book b) {
        System.out.println(b);
    }

    @Override
    public void visit(CD c) {
        System.out.println(c);
    }
    
}
