package com.wposs.mayormenor;

import java.util.ArrayList;

public class Present implements Interface.Presenter {
    Interface.View view;
    Interface.Model model;

    public Present (Interface.View view) {
        this.view = view;
        this.model = new Model(this);
    }

    @Override
    public ArrayList<Integer> ordenar(ArrayList<Integer> lista) {
        return this.model.ordenarMayorMenor(lista);
    }
}
