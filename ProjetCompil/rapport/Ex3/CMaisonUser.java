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
    CAutreAppareil hf = new CAutreAppareil("hf",TypeAppareil.AUTRE_APPAREIL_HIFI);
    ma_liste_appareils.add(hf);
    CChauffage r1 = new CChauffage("r1",TypeAppareil.CHAUFFAGE);
    ma_liste_appareils.add(r1);
    CChauffage rad1 = new CChauffage("rad1",TypeAppareil.CHAUFFAGE);
    ma_liste_appareils.add(rad1);
    CAlarme a1 = new CAlarme("a1",TypeAppareil.ALARME);
    ma_liste_appareils.add(a1);
    CAlarme a2 = new CAlarme("a2",TypeAppareil.ALARME);
    ma_liste_appareils.add(a2);
    CAlarme a3 = new CAlarme("a3",TypeAppareil.ALARME);
    ma_liste_appareils.add(a3);
    CVoletFenetre v5 = new CVoletFenetre("v5",TypeAppareil.VOLET);
    ma_liste_appareils.add(v5);
    CVoletFenetre fen = new CVoletFenetre("fen",TypeAppareil.FENETRE);
    ma_liste_appareils.add(fen);
    CAutreAppareil cafe = new CAutreAppareil("cafe",TypeAppareil.AUTRE_APPAREIL_CAFE);
    ma_liste_appareils.add(cafe);
    CAutreAppareil matv = new CAutreAppareil("matv",TypeAppareil.AUTRE_APPAREIL_TV);
    ma_liste_appareils.add(matv);
    CAutreAppareil proj = new CAutreAppareil("proj",TypeAppareil.AUTRE_APPAREIL_VP);
    ma_liste_appareils.add(proj);
    CAutreAppareil lv = new CAutreAppareil("lv",TypeAppareil.AUTRE_APPAREIL_LV);
    ma_liste_appareils.add(lv);
    CAutreAppareil ll = new CAutreAppareil("ll",TypeAppareil.AUTRE_APPAREIL_LL);
    ma_liste_appareils.add(ll);
    CAutreAppareil port = new CAutreAppareil("port",TypeAppareil.AUTRE_APPAREIL_PORTAIL);
    ma_liste_appareils.add(port);
    CAutreAppareil ordi = new CAutreAppareil("ordi",TypeAppareil.AUTRE_APPAREIL_ORDINATEUR);
    ma_liste_appareils.add(ordi);
    CAutreAppareil ordi1 = new CAutreAppareil("ordi1",TypeAppareil.AUTRE_APPAREIL_ORDINATEUR);
    ma_liste_appareils.add(ordi1);
    CAutreAppareil ordi2 = new CAutreAppareil("ordi2",TypeAppareil.AUTRE_APPAREIL_ORDINATEUR);
    ma_liste_appareils.add(ordi2);
    CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
    mon_eclairage_salon.addAppareil(e2);
    mon_eclairage_salon.addAppareil(e3);
    ma_liste_ens_appareils.add(mon_eclairage_salon);
    CEnsAppareil mon_elec_salon = new CEnsAppareil("mon_elec_salon");
    mon_elec_salon.addAppareil(matv);
    mon_elec_salon.addAppareil(proj);
    mon_elec_salon.addAppareil(ordi3);
    ma_liste_ens_appareils.add(mon_elec_salon);

// Les interfaces

    CInterface b1 = new CInterface("b1",TypeInterface.INTERRUPTEUR);
    ma_liste_interfaces.add(b1);
    CInterface b3 = new CInterface("b3",TypeInterface.INTERRUPTEUR);
    ma_liste_interfaces.add(b3);
    CInterface t1 = new CInterface("t1",TypeInterface.MOBILE);
    ma_liste_interfaces.add(t1);
    CInterface tel1 = new CInterface("tel1",TypeInterface.TELEPHONE);
    ma_liste_interfaces.add(tel1);
    CInterface tab1 = new CInterface("tab1",TypeInterface.TABLETTE);
    ma_liste_interfaces.add(tab1);
    CInterface zap = new CInterface("zap",TypeInterface.TELECOMMANDE);
    ma_liste_interfaces.add(zap);
    CInterface b2 = new CInterface("b2",TypeInterface.INTERRUPTEUR);
    ma_liste_interfaces.add(b2);

// Les scenarii

String bonjour_contenu = "for(CAppareil appareil : this.l_appareils)\nif (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.OUVRIR);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"a1\"))appareil.appliquer(TypeActionAppareil.ETEINDRE);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"cafe\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"rad1\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)){\nfor(CAppareil appareil1 : this.l_appareils)\nif(appareil1.getNomAppareil().equals(\"rad1\"))appareil1.appliquer(TypeActionAppareil.ALLUMER);\n;}\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"hf\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\n";


CScenario bonjour = new CScenario("bonjour",bonjour_contenu);
ma_liste_scenarios.add(bonjour);
String test_contenu = "for(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"e1\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"cafe\"))appareil.appliquer(TypeActionAppareil.ETEINDRE);\n";


CScenario test = new CScenario("test",test_contenu);
ma_liste_scenarios.add(test);
String test2_contenu = "for(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"hf\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)){\nSystem.out.println(appareil1.getNomAppareil()+\" allum�e \");\n;}\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"hf\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)){\nSystem.out.println(appareil1.getNomAppareil()+\" �teinte \");\n;}\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"e1\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"cafe\"))appareil.appliquer(TypeActionAppareil.ETEINDRE);\n";


CScenario test2 = new CScenario("test2",test2_contenu);
ma_liste_scenarios.add(test2);
String test3_contenu = "for(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"hf\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)){\nSystem.out.println(appareil1.getNomAppareil()+\" allum�e \");\n;}else{System.out.println(appareil.getNomAppareil()+\" �teinte \");\n;}\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"e1\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"cafe\"))appareil.appliquer(TypeActionAppareil.ETEINDRE);\n";


CScenario test3 = new CScenario("test3",test3_contenu);
ma_liste_scenarios.add(test3);
String test4_contenu = "for(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"v1\"))appareil.appliquer(TypeActionAppareil.OUVRIR);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"a1\"))appareil.appliquer(TypeActionAppareil.ETEINDRE);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"v2\"))appareil.appliquer(TypeActionAppareil.OUVRIR);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"v3\"))appareil.appliquer(TypeActionAppareil.OUVRIR);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"hf\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"cafe\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"v5\"))appareil.appliquer(TypeActionAppareil.OUVRIR);\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"rad1\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)){\nfor(CAppareil appareil1 : this.l_appareils)\nif(appareil1.getNomAppareil().equals(\"rad1\"))appareil1.appliquer(TypeActionAppareil.ALLUMER);\n;}\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"v4\"))appareil.appliquer(TypeActionAppareil.OUVRIR);\n";


CScenario test4 = new CScenario("test4",test4_contenu);
ma_liste_scenarios.add(test4);
String test5_contenu = "for(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"e1\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"cafe\"))appareil.appliquer(TypeActionAppareil.ETEINDRE);\n";


CScenario test5 = new CScenario("test5",test5_contenu);
ma_liste_scenarios.add(test5);
String test6_contenu = "for(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"e1\"))appareil.appliquer(TypeActionAppareil.ALLUMER);\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"hf\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.ALLUME)){\nSystem.out.println(\" allum�e \");\n;}\nfor(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"cafe\"))appareil.appliquer(TypeActionAppareil.ETEINDRE);\n";


CScenario test6 = new CScenario("test6",test6_contenu);
ma_liste_scenarios.add(test6);
String soiree_contenu = "for(CAppareil appareil : this.l_appareils)\nif (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.ETEINDRE);\nfor(CEnsAppareil ensAppareil : this.l_ensembles)\nif (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\nfor(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.TAMISER);\nfor(CEnsAppareil ensAppareil : this.l_ensembles)\nif (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\nfor(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ALLUMER);\n";


CScenario soiree = new CScenario("soiree",soiree_contenu);
ma_liste_scenarios.add(soiree);
String soiree_musique_contenu = "for(CAppareil appareil : this.l_appareils)\nif(appareil.getNomAppareil().equals(\"hf\"))appareil.appliquer(TypeActionAppareil.OUVRIR);\n";


CScenario soiree_musique = new CScenario("soiree_musique",soiree_musique_contenu);
ma_liste_scenarios.add(soiree_musique);
String depart_contenu = "for(CAppareil appareil : this.l_appareils)\nif (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.FERMER);\nfor(CEnsAppareil ensAppareil : this.l_ensembles)\nif (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\nfor(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ETEINDRE);\nfor(CAppareil appareil : this.l_appareils)\nif (appareil.getNomAppareil().equals(\"fen\"))\nif (appareil.etatAppareil.equals(TypeEtatAppareil.FERME)){\nfor(CAppareil appareil1 : this.l_appareils)\nif(appareil1.getNomAppareil().equals(\"a\"))appareil1.appliquer(TypeActionAppareil.ALLUMER);\n;}else{System.out.println(\"Attention : la fenetre \"+appareil.getNomAppareil()+\" est ouverte !\");\n;}\nfor(CEnsAppareil ensAppareil : this.l_ensembles)\nif (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\nfor(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ETEINDRE);\n";


CScenario depart = new CScenario("depart",depart_contenu);
ma_liste_scenarios.add(depart);


// Les commandes

    b1.addScenarioAssocie("bonjour");
    tel1.addScenarioAssocie("test");
    tab1.addScenarioAssocie("test");
    zap.addScenarioAssocie("test");
    b1.addScenarioAssocie("test2");
    b3.addScenarioAssocie("bonjour2");

    CProgrammation p1 = new CProgrammation("test2");
    CDate p1d1 = new CDate(2016,3,21,-1,0);
    p1.addDate(p1d1);

    CProgrammation p2 = new CProgrammation("bonjour3");
    CDate p2d1 = new CDate(-1,9,1,7,0);
    p2.addDate(p2d1);

    CProgrammation p3 = new CProgrammation("test3");
    CDate p3d1 = new CDate(2012,-1,1,10,0);
    p3.addDate(p3d1);

    CProgrammation p4 = new CProgrammation("test4");
    CDate p4d1 = new CDate(2012,9,1,10,0);
    p4.addDate(p4d1);

    CProgrammation p5 = new CProgrammation("soiree");
    CDate p5d1 = new CDate(2012,2,34,18,0);
    p5.addDate(p5d1);
    CDate p5d2 = new CDate(2010,1,15,27,10);
    p5.addDate(p5d2);

    CProgrammation p6 = new CProgrammation("soiree_musique");
    CDate p6d1 = new CDate(2012,-1,31,19,30);
    p6.addDate(p6d1);
    CDate p6d2 = new CDate(2013,1,1,1,1);
    p6.addDate(p6d2);

    CProgrammation p7 = new CProgrammation("test3");
    CDate p7d1 = new CDate(2013,1,1,10,0);
    p7.addDate(p7d1);
    b2.addScenarioAssocie("depart");
    t1.addScenarioAssocie("depart");

    monHabitat = new HabitatSpecific(ma_liste_appareils,
      ma_liste_ens_appareils, ma_liste_scenarios,
      ma_liste_interfaces, ma_liste_programmations);
   }
}
