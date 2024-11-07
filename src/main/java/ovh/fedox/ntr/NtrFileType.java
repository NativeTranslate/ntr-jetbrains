package ovh.fedox.ntr;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * © 2024 Florian O and Fabian W.
 * Created on: 11/7/2024 11:38 AM
 * <p>
 * https://www.youtube.com/watch?v=tjBCjfB3Hq8
 */

public class NtrFileType extends LanguageFileType {

    public static final NtrFileType INSTANCE = new NtrFileType();

    private NtrFileType() {
        super(NtrLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "NativeTranslate Resource";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Adds support for NativeTranslate Resource files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ntr";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return NtrIcons.FILE;
    }

}
