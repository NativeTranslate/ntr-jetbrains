package ovh.fedox.ntr.psi.impl;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ovh.fedox.ntr.NtrLanguage;

/**
 * © 2024 Florian O and Fabian W.
 * Created on: 11/7/2024 11:47 AM
 * <p>
 * https://www.youtube.com/watch?v=tjBCjfB3Hq8
 */

public class NtrElementType extends IElementType {
    public NtrElementType(@NotNull @NonNls String debugName) {
        super(debugName, NtrLanguage.INSTANCE);
    }
}