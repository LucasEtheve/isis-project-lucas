
package mediatheque;

/**
 *
 * @author lucasetheve
 */
public interface ItemVisitor {
    public void visit(Book b);
    public void visit(CD c);
}
