import java_cup.runtime.Symbol;
%%
%unicode
%cup
%line
%column

chiffre = [0-9]

%%

{chiffre}+ { return new Symbol(sym.ENTIER, new Integer(yytext())); }
\n {}
. {}
