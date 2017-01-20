// HabitatSpecific.java
import java.util.ArrayList;
public class HabitatSpecific extends Habitat{
        public HabitatSpecific(ArrayList<CAppareil> lapp, ArrayList<CEnsAppareil> lens, ArrayList<CScenario> lscen, ArrayList<CInterface> lint, ArrayList<CProgrammation> lprog){
           super(lapp,lens,lscen,lint,lprog);
       }
  public void execScenarioNum(int num)
   {
     System.out.println( "Execution du scenario "+this.l_scenarios.get(num).getNomScenario()+"...");
     switch(num) {
case 0:
for(CAppareil appareil : this.l_appareils)if (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.OUVRIR);for(CAppareil appareil : this.l_appareils)if(appareil.getNomAppareil().equals("a1"))appareil.appliquer(TypeActionAppareil.ETEINDRE);for(CAppareil appareil : this.l_appareils)if(appareil.getNomAppareil().equals("cafe"))appareil.appliquer(TypeActionAppareil.ALLUMER);for(CAppareil appareil : this.l_appareils)if (appareil.getNomAppareil().equals("rad1"))if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT)){for(CAppareil appareil1 : this.l_appareils)if(appareil1.getNomAppareil().equals("rad1"))appareil1.appliquer(TypeActionAppareil.ALLUMER);;}for(CAppareil appareil : this.l_appareils)if(appareil.getNomAppareil().equals("hf"))appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 1:
for(CAppareil appareil : this.l_appareils)if (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.FERMER);for(CEnsAppareil ensAppareil : this.l_ensembles)if (ensAppareil.nomEnsAppareil.equals("mon_eclairage_salon"))for(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 2:
for(CEnsAppareil ensAppareil : this.l_ensembles)if (ensAppareil.nomEnsAppareil.equals("mon_eclairage_salon"))for(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 3:
System.out.println("Scenario Depart");for(CAppareil appareil : this.l_appareils)if (appareil.typeAppareil.equals(TypeAppareil.VOLET))appareil.appliquer(TypeActionAppareil.FERMER);for(CEnsAppareil ensAppareil : this.l_ensembles)if (ensAppareil.nomEnsAppareil.equals("mon_eclairage_salon"))for(CAppareil appareil : ensAppareil.lAppareils)appareil.appliquer(TypeActionAppareil.ETEINDRE);for(CAppareil appareil : this.l_appareils)if (appareil.estTypeAutreAppareil())appareil.appliquer(TypeActionAppareil.ETEINDRE);for(CAppareil appareil : this.l_appareils)if (appareil.getNomAppareil().equals("fen"))if (appareil.etatAppareil.equals(TypeEtatAppareil.FERME)){for(CAppareil appareil1 : this.l_appareils)if(appareil1.getNomAppareil().equals("a1"))appareil1.appliquer(TypeActionAppareil.ALLUMER);;}else{System.out.println("Attention : la fenetre "+appareil.getNomAppareil()+" est ouverte !");;}
break;
case 4:
for(CAppareil appareil : this.l_appareils)if(appareil.getNomAppareil().equals("e1"))appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 5:
for(CAppareil appareil : this.l_appareils)if(appareil.getNomAppareil().equals("e2"))appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 6:
for(CAppareil appareil : this.l_appareils)if(appareil.getNomAppareil().equals("e3"))appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
    	default:
      }
   }
}
