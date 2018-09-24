
package jg3_explorer;

import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class DateiModell extends AbstractListModel {
    private ArrayList<Datei> dateien = new ArrayList<>();
    @Override
    public int getSize() {
       return dateien.size();
    }

    @Override
    public Object getElementAt(int index) {
        return dateien.get(index);
    }
    public void addDatei(Datei d){
        dateien.add(d);
        fireIntervalAdded(this, dateien.size()-1, dateien.size()-1);
    }
}
