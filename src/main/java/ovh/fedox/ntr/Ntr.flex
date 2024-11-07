package ovh.fedox.ntr;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import ovh.fedox.ntr.psi.NtrTypes;
import com.intellij.psi.TokenType;

%%

%public
%class NtrLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
COMMENT=@.*
IDENTIFIER=[a-zA-Z0-9_]+
VALUE=[^\n]*

%%

<YYINITIAL> {COMMENT}                           { return NtrTypes.COMMENT; }

<YYINITIAL> ^{IDENTIFIER}                       { return NtrTypes.CLASS; }

<YYINITIAL> ^{WHITE_SPACE}+{IDENTIFIER}         { return NtrTypes.FUNCTION; }

<YYINITIAL> ^{WHITE_SPACE}{2,4}{IDENTIFIER}     { return NtrTypes.TAG; }

<YYINITIAL> ^{WHITE_SPACE}{4,6}{IDENTIFIER}     { return NtrTypes.MEMBER; }

<YYINITIAL> {IDENTIFIER}                        { return NtrTypes.KEY; }

">"                                             { return NtrTypes.SEPARATOR; }

[^\n>]+                                         { return NtrTypes.VALUE; }

{CRLF}                                          { return NtrTypes.CRLF; }

{WHITE_SPACE}+                                  { return NtrTypes.WHITE_SPACE; }

[^]                                             { return TokenType.BAD_CHARACTER; }