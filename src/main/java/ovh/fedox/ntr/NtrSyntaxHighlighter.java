package ovh.fedox.ntr;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import ovh.fedox.ntr.psi.NtrTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NtrSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("NTR_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey CLASS =
            createTextAttributesKey("NTR_CLASS", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey FUNCTION =
            createTextAttributesKey("NTR_FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey TAG =
            createTextAttributesKey("NTR_TAG", DefaultLanguageHighlighterColors.MARKUP_TAG);
    public static final TextAttributesKey MEMBER =
            createTextAttributesKey("NTR_MEMBER", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("NTR_KEY", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("NTR_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("NTR_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("NTR_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] CLASS_KEYS = new TextAttributesKey[]{CLASS};
    private static final TextAttributesKey[] FUNCTION_KEYS = new TextAttributesKey[]{FUNCTION};
    private static final TextAttributesKey[] TAG_KEYS = new TextAttributesKey[]{TAG};
    private static final TextAttributesKey[] MEMBER_KEYS = new TextAttributesKey[]{MEMBER};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NtrLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(NtrTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(NtrTypes.CLASS)) {
            return CLASS_KEYS;
        } else if (tokenType.equals(NtrTypes.FUNCTION)) {
            return FUNCTION_KEYS;
        } else if (tokenType.equals(NtrTypes.TAG)) {
            return TAG_KEYS;
        } else if (tokenType.equals(NtrTypes.MEMBER)) {
            return MEMBER_KEYS;
        } else if (tokenType.equals(NtrTypes.KEY)) {
            return KEY_KEYS;
        } else if (tokenType.equals(NtrTypes.SEPARATOR)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(NtrTypes.VALUE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }
}