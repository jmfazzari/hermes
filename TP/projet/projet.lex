// Specification JFlex
// Compilation : java JFlex.Main ex1.lex
import java_cup.runtime.Symbol;

%%

%unicode
%cup
%line
%column

ALPHABET = [-a-zA-Z0-9ÀÁÂÃÄÅÇÑñÇçÈÉÊËÌÍÎÏÒÓÔÕÖØÙÚÛÜÝàáâãäåçèéêëìíîïðòóôõöøùúûüýÿ !:;,?./&]
TITRE = "\\titre "
AUTHEUR = "\\auteurs "
TYPE = "\\type "
CRITIQUE = "\\critique "
%%

"\t"+ {System.out.println("t");}
" "+ {}
"{" { return new Symbol (sym.ACOLOUV);}
"}" { return new Symbol (sym.ACOLFERM);}
" "*{TITRE} { return new Symbol (sym.TITRE);}
{AUTHEUR} { return new Symbol (sym.AUTEURS);}
{TYPE} { return new Symbol (sym.TYPE);}
{CRITIQUE} { return new Symbol (sym.CRITIQUE);}
{ALPHABET}+  { return new Symbol (sym.CHAINE, new String(yytext()));}
\n {}
. { System.out.println("Hein ? : ("+yytext()+")"); }

