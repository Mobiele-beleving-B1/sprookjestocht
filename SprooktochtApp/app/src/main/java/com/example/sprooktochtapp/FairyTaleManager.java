package com.example.sprooktochtapp;
import java.util.ArrayList;

public class FairyTaleManager {
    private static ArrayList<FairyTale> fairyTales = new ArrayList<>();

    private FairyTaleManager(){

    }

    public static void createFairyTales(){
        fairyTales.add(new FairyTale("De wolf en de drie biggetjes", R.drawable.throphy, "unknown", "De wolf wil de biggetjes graag opeten, het blijkt alleen dat de biggetjes allen hun eigen huis hebben. Lukt het de wolf om de huizen om te blazen?"));
        fairyTales.add(new FairyTale("Hans en Grietje", R.drawable.hansengrietje, "unknown", "Hans en grietje raken verdwaald in een bos en komen bij een huisje van snoep en snoepen ervan. Er blijkt een heks te wonen, die hen eerst vriendelijk uitnodigt om binnen te komen. Dan sluit ze Hans op om hem vet te mesten en op te eten. Grietje moet helpen in de huishouding. Hans weet de heks voor de gek te houden door steeds een afgekloven botje uit zijn kooi te steken wanneer de heks wil voelen hij dik hij al is. De heks heeft niks door want ze is blind. Uiteindelijk heeft de heks er genoeg van en ze besluit Hans toch op te eten. Wanneer Grietje de oven moet aanmaken waar haar broertje in gebraden zal worden, lukt het haar de heks zelf in de oven te duwen: als Grietjes van de heks in de oven moet voelen of het al heet genoeg is, zegt ze dat de oven te klein is. De domme heks gaat hierop voor de oven staan om te laten zien dat er zoveel ruimte is dat zij er zelf zelfs in past."));
    }
    public static ArrayList<FairyTale> getFairyTales() {
        if (fairyTales.isEmpty()) {
            createFairyTales();
        }
        return fairyTales;
    }
    public static FairyTale getFairyTale(int id){
        if(fairyTales.size() == 0){
            createFairyTales();
        }
        return fairyTales.get(id);
    }
}
