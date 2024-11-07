package ovh.fedox.ntr;

/**
 * © 2024 Florian O and Fabian W.
 * Created on: 11/7/2024 11:47 AM
 * <p>
 * https://www.youtube.com/watch?v=tjBCjfB3Hq8
 */

import com.intellij.lexer.FlexAdapter;

public class NtrLexerAdapter extends FlexAdapter {
    public NtrLexerAdapter() {
        super(new NtrLexer(null));
    }
}