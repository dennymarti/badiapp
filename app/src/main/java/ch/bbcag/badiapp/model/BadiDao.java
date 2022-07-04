package ch.bbcag.badiapp.model;

import java.util.ArrayList;
import java.util.List;

public class BadiDao {

    public static List<Badi> getAll() {
        List<Badi> avaibleBadis = new ArrayList<>();
        avaibleBadis.add(new Badi(71, "Swimmbad", "Aarberg", "BE"));
        avaibleBadis.add(new Badi(27, "Schwimmbad Gruebi", "Adelboden", "BE"));
        avaibleBadis.add(new Badi(6, "Stadtberner Baeder", "Bern", "BE"));
        avaibleBadis.add(new Badi(55, "Zürichsee", "Zürich", "ZH"));

        return avaibleBadis;
    }
}
