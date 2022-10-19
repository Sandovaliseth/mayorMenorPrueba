package com.wposs.mayormenor;

import java.util.ArrayList;

public class Model implements Interface.Model {

    Interface.Presenter presenter;

    public Model(Interface.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public ArrayList<Integer> ordenarMayorMenor(ArrayList<Integer> lista) {

        int aux;
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1; j++) {
                if (lista.get(j) < lista.get(j + 1)) {
                    aux = lista.get(j + 1);
                    lista.set(j+1, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }

        for (Integer indice : lista) {
            System.out.println("Orden");
            System.out.println(indice);
        }
        return lista;
    }
}
