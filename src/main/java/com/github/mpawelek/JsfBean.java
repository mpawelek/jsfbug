package com.github.mpawelek;

import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by michal on 01.04.17.
 */
@Named("test") @ViewScoped
public class JsfBean implements Serializable {
    boolean edit;

    public boolean getEdit() {
        return edit;
    }

    public void setEdit(boolean e) {
        edit=e;
    }

    public void action() {
        edit=!edit;
    }
}
