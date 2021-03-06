package com.example.sprooktochtapp;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.sql.Array;
import java.util.ArrayList;

public class FairyTaleManager {
    private static ArrayList<FairyTale> fairyTales = new ArrayList<>();

    private FairyTaleManager() {

    }

    public static void createFairyTales() {
        fairyTales.add(new FairyTale(App.getAppResources().getString(R.string.drieBiggetjes), R.drawable.de_drie_biggetjes_uitleg,new String[]{"biggenSpel"}, App.getAppResources().getString(R.string.Fabeltjeswoud), App.getAppResources().getString(R.string.drieBiggetjesOpdracht), App.getAppResources().getString(R.string.drieBiggetjesHulp)));
        fairyTales.add(new FairyTale(App.getAppResources().getString(R.string.hansEnGrietje), R.drawable.hans_en_grietje_uitleg,new String[]{}, App.getAppResources().getString(R.string.Fabeltjeswoud), App.getAppResources().getString(R.string.hansEnGrietjeOpdracht), App.getAppResources().getString(R.string.hansEnGrietjeHulp)));
    }

    public static ArrayList<FairyTale> getFairyTales() {
        if (fairyTales.isEmpty()) {
            createFairyTales();
        }
        return fairyTales;
    }

    public static FairyTale getFairyTale(int id) {
        if (fairyTales.size() == 0) {
            createFairyTales();
        }
        return fairyTales.get(id);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static FairyTale getFairyTale(String fairyTaleName) {
        if (!fairyTaleName.isEmpty() || !fairyTales.isEmpty()) {
            return fairyTales.stream().filter(fairyTale -> fairyTale.getNameOfTale().equals(fairyTaleName)).findFirst().orElse(null);
        }
        return null;
    }
}
