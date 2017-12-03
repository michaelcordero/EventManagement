import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GroupingSymbol {

    /*
    properties
     */
    static final List<Character> validOpenSymbols = Arrays.asList('[', '{', '<', '(');
    static final List<Character> validCloseSymbols = Arrays.asList(']', '}', '>', ')');
    final Character open;
    final Character close;
    private List<Character> exceptions = new ArrayList<>();

    /*
    constructors
     */

    public GroupingSymbol(Character opening, Character closing) {
        this.open = opening;
        this.close = closing;
        validate();
    }

    public GroupingSymbol(Character opening, Character closing, Collection<Character> exceptions) {
        this.open = opening;
        this.close = closing;
        this.exceptions.addAll(exceptions);
        validate();
    }

    /*
    accessors
     */

    /*
    private
     */

    private void validate() {
        if (!validOpenSymbols.contains(this.open)) {
            throw new IllegalArgumentException("Character: " + String.valueOf(this.open) + " not contained in valid opening characters list");
        }
        if (!validCloseSymbols.contains(this.close)) {
            throw new IllegalArgumentException("Character: " + String.valueOf(this.close) + " not contained in valid closing characters list");
        }
    }

    /*
    protected
     */

    /*
    public
     */

    public void addException(Character exception) {
        exceptions.add(exception);
    }

    public boolean isExceptional(Character exceptional) {
        return exceptions.contains(exceptional);
    }
}
