package net.pubnative.lite.sdk.models;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AdData extends JsonModel implements Serializable {

    @BindField
    public Map<String, Object> data;

    @BindField
    public String type;

    public AdData() {
    }

    public Boolean getBoolean() {
        return getBooleanField("boolean");
    }

    public Boolean getBooleanField(String str) {
        if (getDataField(str) instanceof Boolean) {
            return (Boolean) getDataField(str);
        }
        return null;
    }

    protected Object getDataField(String str) {
        Map<String, Object> map = this.data;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.data.get(str);
    }

    public Double getDoubleField(String str) {
        if (getDataField(str) instanceof Number) {
            return Double.valueOf(((Number) getDataField(str)).doubleValue());
        }
        return null;
    }

    public int getHeight() {
        Integer intField = getIntField("h");
        if (intField == null) {
            return 0;
        }
        return intField.intValue();
    }

    public String getHtml() {
        return getStringField("html");
    }

    public Integer getIntField(String str) {
        Object dataField = getDataField(str);
        if (dataField instanceof Integer) {
            return (Integer) dataField;
        }
        return null;
    }

    public String getJS() {
        return getStringField(POBConstants.KEY_JS);
    }

    public JSONObject getJSONObjectField(String str) {
        Object dataField = getDataField(str);
        if (dataField instanceof JSONObject) {
            return (JSONObject) dataField;
        }
        return null;
    }

    public Double getNumber() {
        return getDoubleField("number");
    }

    public String getStringField(String str) {
        try {
            return (String) getDataField(str);
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public String getText() {
        return getStringField("text");
    }

    public String getURL() {
        return getStringField("url");
    }

    public int getWidth() {
        Integer intField = getIntField("w");
        if (intField == null) {
            return 0;
        }
        return intField.intValue();
    }

    public Boolean hasField(String str) {
        Map<String, Object> map = this.data;
        return Boolean.valueOf(map != null && map.containsKey(str));
    }

    public AdData(JSONObject jSONObject) {
        fromJson(jSONObject);
    }

    public AdData(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        this.data = hashMap;
        hashMap.put(str, str3);
        this.type = str2;
    }
}
