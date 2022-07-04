package ch.bbcag.badiapp.helper;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

import ch.bbcag.badiapp.model.Badi;
import ch.bbcag.badiapp.model.Becken;

public class WieWarmJsonParser {

    public static Badi createBadiFromJsonString(String badiJsonString) throws JSONException {
        Badi badi = new Badi();
        JSONObject jsonObject = new JSONObject(badiJsonString);
        badi.setId(Integer.parseInt(jsonObject.getString("badid")));
        badi.setName(jsonObject.getString("badname"));
        badi.setKanton(jsonObject.getString("kanton"));
        badi.setOrt(jsonObject.getString("ort"));

        JSONObject beckenJson = jsonObject.getJSONObject("becken");
        Iterator keys = beckenJson.keys();

        while (keys.hasNext()) {
            Becken becken = new Becken();
            String key = (String) keys.next();
            JSONObject subObject = beckenJson.getJSONObject(key);
            becken.setName(subObject.getString("beckenname"));
            becken.setTemperature(Double.parseDouble(subObject.getString("temp")));
            badi.addBecken(becken);
        }
        return badi;
    }
}
