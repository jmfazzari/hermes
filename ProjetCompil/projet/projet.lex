// Specification JFlex
import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column

%{
	public int getYyLine(){
		return yyline+1;
	}
	public int getYyColumn(){
		return yycolumn+1;
	}
	public String getYyText(){
		return yytext();
	}
%}

// qqs exemples de macros...
// caractère spéciaux
//chiffre = [0-9]
//entier = {chiffre}+
ident = [a-zA-Z_]([0-9]|[a-zA-Z_])*
virgule = ","
point = "."
pointvirgule = ";"
parouv = "("
parfer = ")"
egal = "="
crochetouv = "{"
crochetfer = "}"
pgq = ">"
guillemet = "\""
deuxpoints = ":"
comparateurs = ["==""<"">""<="">=""!"]*

//date
date=([0-9]+|_)

alphabet = [-a-zA-Z0-9ÀÁÂÃÄÅÇÑñÇçÈÉÊËÌÍÎÏÒÓÔÕÖØÙÚÛÜİàáâãäåçèéêëìíîïğòóôõöøùúûüıÿ,'= !:?(){}/&_.]*

//balises
BAL_PROG_OUV=<PROGRAMME_DOMUS>
BAL_PROG_FER=<\/PROGRAMME_DOMUS>
DECLA_APP_OUV = <DECLARATION_APPAREILS>
DECLA_APP_FER= <\/DECLARATION_APPAREILS>
DECLA_INT_OUV = <DECLARATION_INTERFACES>
DECLA_INT_FER = <\/DECLARATION_INTERFACES>
DECLA_SCE_OUV = <DECLARATION_SCENARII>
DECLA_SCE_FER = <\/DECLARATION_SCENARII>
SCE_OUV =<SCENARIO
SCE_FER =<\/SCENARIO
DECLA_COM_OUV = <DECLARATION_COMMANDES>
DECLA_COM_FER = <\/DECLARATION_COMMANDES>


//divers
texte= {guillemet}{alphabet}*{guillemet}
commentaires = "\/\/"{alphabet}*
message = message

//types
eclairage = eclairage
alarme = alarme
chauffage = chauffage
fenetre = fenetre
volet = volet
autre_appareil = autre_appareil
types_appareil = {eclairage}|{alarme}|{chauffage}|{fenetre}|{volet}

//sous-types
tv = tv
hifi = hifi
cafetiere = cafetiere
video_proj = video_proj
lave_vaisselle = lave_vaisselle
lave_linge = lave_linge
seche_linge = seche_linge
ordinateur = ordinateur
portail = portail
sous_types = {tv}|{hifi}|{cafetiere}|{video_proj}|{lave_vaisselle}|{lave_linge}|{seche_linge}|{ordinateur}|{portail}

//type interfaces
mobile = mobile
telephone = telephone
telecommande = telecommande
tablette = tablette
interrupteur = interrupteur
types_interface = {mobile}|{telephone}|{telecommande}|{tablette}|{interrupteur}

//conditionnelles
sinon = sinon
si = si
alors = alors
fsi = fsi


//boucles
pourtout=pourtout
faire=faire
fait=fait


//  commandes
executer_scenario = executer_scenario
definir = definir
associer = associer
programmer = programmer

//actions
ouvrir = ouvrir
fermer = fermer
eteindre = eteindre
allumer = allumer
tamiser = tamiser
allumer_partiel = allumer_partiel
allumer_eco = allumer_eco
ouvrir_partiel = ouvrir_partiel
fermer_partiel = fermer_partiel
etat = etat
actions = {ouvrir}|{fermer}|{eteindre}|{allumer}|{tamiser}|{allumer_partiel}|{allumer_eco}|{ouvrir_partiel}|{fermer_partiel}

// etats
allume = allume
eteint = eteint
demi = demi
eco = eco
ouvert = ouvert
ferme = ferme
etats = {allume}|{eteint}|{demi}|{eco}|{ouvert}|{ferme}




//erreur_chaine = \"[^\"\n]*\n  

%%
// **************************************************************************************************
// *********************************** debut traitement *********************************************
//[0-9]+ { return new Symbol (sym.NB, new Integer(yytext()));}
//")" { return new Symbol (sym.RP);}
// **************************************************************************************************

//BALISES
{BAL_PROG_OUV} { return new Symbol(sym.t_BAL_PROG_OUV); }
{BAL_PROG_FER} { return new Symbol(sym.t_BAL_PROG_FER); }
{DECLA_APP_OUV} { return new Symbol(sym.t_DECLA_APP_OUV); }
{DECLA_APP_FER} { return new Symbol(sym.t_DECLA_APP_FER); }
{DECLA_INT_OUV} { return new Symbol(sym.t_DECLA_INT_OUV); }
{DECLA_INT_FER} { return new Symbol(sym.t_DECLA_INT_FER); }
{DECLA_SCE_OUV} { return new Symbol(sym.t_DECLA_SCE_OUV); }
{DECLA_SCE_FER} { return new Symbol(sym.t_DECLA_SCE_FER); }
{SCE_OUV} {return new Symbol(sym.t_SCE_OUV);}
{SCE_FER} {return new Symbol(sym.t_SCE_FER);}
{DECLA_COM_OUV} {return new Symbol (sym.t_DECLA_COM_OUV);}
{DECLA_COM_FER} {return new Symbol (sym.t_DECLA_COM_FER);}



{types_appareil} {return new Symbol (sym.t_Type, new String(yytext()));}
{autre_appareil} {return new Symbol (sym.t_autre_appareil, new String(yytext()));}
{sous_types} {return new Symbol (sym.t_sous_Type, new String(yytext()));}

{si} {return new Symbol (sym.SI);}
{alors} {return new Symbol (sym.ALORS);}
{sinon} {return new Symbol (sym.SINON);}
{fsi} {return new Symbol (sym.FSI);}

{pourtout} {return new Symbol (sym.POURTOUT);}
{faire} {return new Symbol (sym.FAIRE);}
{fait} {return new Symbol (sym.FAIT);}

{types_interface} {return new Symbol (sym.t_Interface, new String(yytext()));}

{executer_scenario} {return new Symbol(sym.t_executer_scenario, new String(yytext()));}
{definir} {return new Symbol (sym.DEFINIR);}
{associer} {return new Symbol (sym.ASSOCIER);}
{programmer} {return new Symbol (sym.PROGRAMMER);}

{actions} {return new Symbol (sym.t_action, new String(yytext()));}
{etats} {return new Symbol (sym.t_etat, new String(yytext()));}
{etat} {return new Symbol (sym.ETAT);}




{message} {return new Symbol (sym.t_message);}
{texte} {return new Symbol (sym.t_texte, new String(yytext()));}

// caractère spéciaux
{date} {return new Symbol (sym.t_date, new String(yytext()));}
//{chiffre} {System.out.println(yytext());}
{ident} {return new Symbol (sym.t_ident, new String(yytext()));}

{commentaires}{alphabet}* {}

{point} {return new Symbol (sym.POINT);}
{virgule} {return new Symbol (sym.VIRGULE);}
{pointvirgule} {return new Symbol (sym.POINTVIRGULE);}
{parouv} {return new Symbol (sym.PAROUV);}
{parfer} {return new Symbol (sym.PARFERM);}
{egal} {return new Symbol (sym.EGAL);}
{crochetouv} {return new Symbol (sym.CROCHETOUV);}
{crochetfer} {return new Symbol (sym.CROCHETFERM);}
{pgq} {return new Symbol (sym.PGQ);}

{comparateurs} {return new Symbol (sym.t_comparateurs, new String(yytext()));}
{deuxpoints} {return new Symbol (sym.DEUXPOINTS);}

//{alphabet}* {System.out.println(">>alphabet>>"+yytext()+"<<alphabet<<");}
[\ \n\t]* {}

. {System.out.println(">>rejet>>"+yytext()+"<<rejet<<");}

//{erreur_ident} {}
//{erreur_chaine} {}




// qqs exemples de règles lexicales légales...




/*
{entier} { return new Symbol(sym.ENTIER, new Integer(yytext())); }
{ident} { return new Symbol(sym.IDENT, yytext()); }
{espace} {}
{finligne} {} 
*/
// qqs exemples de règles de détection d'erreurs lexicales...
/*
{erreur_ident} {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => syntaxe identificateur non respectee ! "); }

{erreur_chaine} {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => fin de chaine attendue ! "); }

.  {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => caractÃ¨re inconnu ! "); } 

*/
