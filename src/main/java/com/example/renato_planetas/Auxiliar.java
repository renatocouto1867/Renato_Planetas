package com.example.renato_planetas;

import android.content.Context;

import java.util.ArrayList;

public class Auxiliar {
    public static ArrayList<Planeta> criaListaPlanetas(Context context) {

        ArrayList<Planeta> lista = new ArrayList<>();

        Planeta mercurio = new Planeta(
                context.getResources().getStringArray(R.array.mercurio)[0].toString(),
                context.getResources().getStringArray(R.array.mercurio)[1].toString(),
                context.getResources().getStringArray(R.array.mercurio)[2].toString(),
                context.getResources().getStringArray(R.array.mercurio)[3].toString(),
                R.drawable.mercurio);

        Planeta venus = new Planeta(
                context.getResources().getStringArray(R.array.venus)[0].toString(),
                context.getResources().getStringArray(R.array.venus)[1].toString(),
                context.getResources().getStringArray(R.array.venus)[2].toString(),
                context.getResources().getStringArray(R.array.venus)[3].toString(),
                R.drawable.venus);

        Planeta terra = new Planeta(
                context.getResources().getStringArray(R.array.terra)[0].toString(),
                context.getResources().getStringArray(R.array.terra)[1].toString(),
                context.getResources().getStringArray(R.array.terra)[2].toString(),
                context.getResources().getStringArray(R.array.terra)[3].toString(),
                R.drawable.terra);

        Planeta marte = new Planeta(
                context.getResources().getStringArray(R.array.marte)[0].toString(),
                context.getResources().getStringArray(R.array.marte)[1].toString(),
                context.getResources().getStringArray(R.array.marte)[2].toString(),
                context.getResources().getStringArray(R.array.marte)[3].toString(),
                R.drawable.marte);

        Planeta jupiter = new Planeta(
                context.getResources().getStringArray(R.array.jupter)[0].toString(),
                context.getResources().getStringArray(R.array.jupter)[1].toString(),
                context.getResources().getStringArray(R.array.jupter)[2].toString(),
                context.getResources().getStringArray(R.array.jupter)[3].toString(),
                R.drawable.jupter);

        Planeta saturno = new Planeta(
                context.getResources().getStringArray(R.array.saturno)[0].toString(),
                context.getResources().getStringArray(R.array.saturno)[1].toString(),
                context.getResources().getStringArray(R.array.saturno)[2].toString(),
                context.getResources().getStringArray(R.array.saturno)[3].toString(),
                R.drawable.saturno);

        Planeta urano = new Planeta(
                context.getResources().getStringArray(R.array.urano)[0].toString(),
                context.getResources().getStringArray(R.array.urano)[1].toString(),
                context.getResources().getStringArray(R.array.urano)[2].toString(),
                context.getResources().getStringArray(R.array.urano)[3].toString(),
                R.drawable.urano);

        Planeta netuno = new Planeta(
                context.getResources().getStringArray(R.array.netuno)[0].toString(),
                context.getResources().getStringArray(R.array.netuno)[1].toString(),
                context.getResources().getStringArray(R.array.netuno)[2].toString(),
                context.getResources().getStringArray(R.array.netuno)[3].toString(),
                R.drawable.netuno);

        lista.add(mercurio);
        lista.add(venus);
        lista.add(terra);
        lista.add(marte);
        lista.add(jupiter);
        lista.add(saturno);
        lista.add(urano);
        lista.add(netuno);


        return lista;
    }

}
