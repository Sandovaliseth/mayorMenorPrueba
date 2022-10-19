package com.wposs.mayormenor;

import java.util.ArrayList;

public interface Interface {

    interface View {
        void variables();
    }

    interface Presenter {
        ArrayList<Integer> ordenar(ArrayList<Integer> lista);
    }

    interface Model {
        ArrayList<Integer> ordenarMayorMenor(ArrayList<Integer> lista);
    }
}
