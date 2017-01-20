public class CMaisonUser extends CMaison {
  public CMaisonUser() {
  super();

// Les appareils

    CEclairage e1 = new CEclairage("e1",TypeAppareil.ECLAIRAGE);
    ma_liste_appareils.add(e1);
    CEclairage e2 = new CEclairage("e2",TypeAppareil.ECLAIRAGE);
    ma_liste_appareils.add(e2);
    CEclairage e3 = new CEclairage("e3",TypeAppareil.ECLAIRAGE);
    ma_liste_appareils.add(e3);
    CVoletFenetre v1 = new CVoletFenetre("v1",TypeAppareil.VOLET);
    ma_liste_appareils.add(v1);
    CVoletFenetre v2 = new CVoletFenetre("v2",TypeAppareil.VOLET);
    ma_liste_appareils.add(v2);
    CVoletFenetre v3 = new CVoletFenetre("v3",TypeAppareil.VOLET);
    ma_liste_appareils.add(v3);
    CVoletFenetre v4 = new CVoletFenetre("v4",TypeAppareil.VOLET);
    ma_liste_appareils.add(v4);
    CChauffage rad1 = new CChauffage("rad1",TypeAppareil.CHAUFFAGE);
    ma_liste_appareils.add(rad1);
    CAlarme a1 = new CAlarme("a1",TypeAppareil.ALARME);
    ma_liste_appareils.add(a1);
    CVoletFenetre fen = new CVoletFenetre("fen",TypeAppareil.FENETRE);
    ma_liste_appareils.add(fen);
    CAutreAppareil cafe = new CAutreAppareil("cafe",TypeAppareil.AUTRE_APPAREIL_CAFE);
    ma_liste_appareils.add(cafe);
    CAutreAppareil hf = new CAutreAppareil("hf",TypeAppareil.AUTRE_APPAREIL_HIFI);
    ma_liste_appareils.add(hf);
    CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
    mon_eclairage_salon.addAppareil(e2);
    mon_eclairage_salon.addAppareil(e3);
    ma_liste_ens_appareils.add(mon_eclairage_salon);

// Les interfaces

    CInterface b1 = new CInterface("b1",TypeInterface.INTERRUPTEUR);
    ma_liste_interfaces.add(b1);
    CInterface b2 = new CInterface("b2",TypeInterface.INTERRUPTEUR);
    ma_liste_interfaces.add(b2);
    CInterface t1 = new CInterface("t1",TypeInterface.MOBILE);
    ma_liste_interfaces.add(t1);
    CInterface c1 = new CInterface("c1",TypeInterface.TELECOMMANDE);
    ma_liste_interfaces.add(c1);

// Les scenarii

String bonjour_contenu = "for(CAppareil appareil : this.l_appareils)\nif (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.OUVRIR);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"a1\"))appareil.appliquer(TypeActionAppareil.ETEINDRE);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"cafe\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"rad1\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)){\nfor(CAppareil appareil1 : this.l_appareils)\nif(appareil1.getNomAppareil().equals(\"rad1\"))appareil1.appliquer(TypeActionAppareil.ALLUMER);\n;}\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"hf\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\n";


CScenario bonjour = new CScenario("bonjour",bonjour_contenu);
ma_liste_scenarios.add(bonjour);
String soiree_contenu = "for(CAppareil appareil : this.l_appareils)\nif (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.FERMER);\nfor(CEnsAppareil ensAppareil : this.l_ensembles)\nif (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\nfor(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ALLUMER);\n";


CScenario soiree = new CScenario("soiree",soiree_contenu);
ma_liste_scenarios.add(soiree);
String soiree_musique_contenu = "for(CEnsAppareil ensAppareil : this.l_ensembles)\nif (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\nfor(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ALLUMER);\n";


CScenario soiree_musique = new CScenario("soiree_musique",soiree_musique_contenu);
ma_liste_scenarios.add(soiree_musique);
String depart_contenu = "System.out.println(\"Scenario Depart\");\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.FERMER);\nfor(CEnsAppareil ensAppareil : this.l_ensembles)\nif (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\nfor(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ETEINDRE);\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.estTypeAutreAppareil())appareil.appliquer(TypeActionAppareil.ETEINDRE);\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"fen\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.FERME)){\nfor(CAppareil appareil1 : this.l_appareils)\nif(appareil1.getNomAppareil().equals(\"a1\"))appareil1.appliquer(TypeActionAppareil.ALLUMER);\n;}else{System.out.println(\"Attention : la fenetre \"+appareil.getNomAppareil()+\" est ouverte !\");\n;}\n";


CScenario depart = new CScenario("depart",depart_contenu);
ma_liste_scenarios.add(depart);
String noel1_contenu = "for(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"e1\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\n";


CScenario noel1 = new CScenario("noel1",noel1_contenu);
ma_liste_scenarios.add(noel1);
String noel2_contenu = "for(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"e2\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\n";


CScenario noel2 = new CScenario("noel2",noel2_contenu);
ma_liste_scenarios.add(noel2);
String noel3_contenu = "for(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"e3\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\n";


CScenario noel3 = new CScenario("noel3",noel3_contenu);
ma_liste_scenarios.add(noel3);


// Les commandes

    b1.addScenarioAssocie("bonjour");
    b2.addScenarioAssocie("depart");
    t1.addScenarioAssocie("depart");
    c1.addScenarioAssocie("noel1");
    c1.addScenarioAssocie("noel2");
    c1.addScenarioAssocie("noel3");

    CProgrammation p1 = new CProgrammation("soiree");
    CDate p1d1 = new CDate(2012,-1,1,18,0);
    p1.addDate(p1d1);

    CProgrammation p2 = new CProgrammation("soiree_musique");
    CDate p2d1 = new CDate(2012,11,20,19,30);
    p2.addDate(p2d1);
    CDate p2d2 = new CDate(2012,11,21,19,30);
    p2.addDate(p2d2);

    monHabitat = new HabitatSpecific(ma_liste_appareils,
      ma_liste_ens_appareils, ma_liste_scenarios,
      ma_liste_interfaces, ma_liste_programmations);
   }
}
