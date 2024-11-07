package ovh.fedox.ntr;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class NtrColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Comment", NtrSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Class", NtrSyntaxHighlighter.CLASS),
            new AttributesDescriptor("Function", NtrSyntaxHighlighter.FUNCTION),
            new AttributesDescriptor("Tag", NtrSyntaxHighlighter.TAG),
            new AttributesDescriptor("Member", NtrSyntaxHighlighter.MEMBER),
            new AttributesDescriptor("Key", NtrSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", NtrSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", NtrSyntaxHighlighter.VALUE),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return NtrIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new NtrSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "@welcome texts\n" +
                "welcome\n" +
                "  title>Willkommen auf unserer Seite\n" +
                "  message>Schön, dass du hier bist!\n" +
                "\n" +
                "@ some error codes\n" +
                "error\n" +
                "  404\n" +
                "    title>Seite nicht gefunden\n" +
                "    message>Die angeforderte Seite konnte nicht gefunden werden.\n" +
                "  500\n" +
                "    title>Serverfehler\n" +
                "    message>Es gab einen internen Serverfehler.\n" +
                "    test>\n" +
                "\n" +
                "@ user infos\n" +
                "user\n" +
                "  profile\n" +
                "    name>Name\n" +
                "    age>Alter\n" +
                "\n" +
                "language\n" +
                "  en>Englisch\n" +
                "  de>Deutsch\n" +
                "  es>Spanisch\n" +
                "  fr>Französisch";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "NativeTranslate Resource";
    }
}