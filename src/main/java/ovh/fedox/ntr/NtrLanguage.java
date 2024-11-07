package ovh.fedox.ntr;

import com.intellij.lang.Language;

/**
 * © 2024 Florian O and Fabian W.
 * Created on: 11/7/2024 11:32 AM
 * <p>
 * https://www.youtube.com/watch?v=tjBCjfB3Hq8
 */

public class NtrLanguage extends Language {
    public static final NtrLanguage INSTANCE = new NtrLanguage();

    private NtrLanguage() {
        super("NTR");
    }
}
