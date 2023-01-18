package de.javabegin.kino.interfaces;

import java.util.ArrayList;

public interface IKinoTheather {
    ArrayList<ISeans> getSeansList();
    String getName();

    public void addSeans(ISeans seans);
}
