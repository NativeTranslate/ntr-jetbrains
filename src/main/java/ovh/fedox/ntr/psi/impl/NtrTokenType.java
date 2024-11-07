package ovh.fedox.ntr.psi.impl;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ovh.fedox.ntr.NtrLanguage;

public class NtrTokenType extends IElementType {
    public NtrTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NtrLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "NtrTokenType." + super.toString();
    }
}