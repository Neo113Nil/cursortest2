package net.pubnative.lite.sdk.models;

import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class SdkConfig extends JsonModel {

    @BindField
    public List<AdData> app_level;

    public SdkConfig() {
    }

    public Boolean isAtomEnabled() {
        AdData adData;
        List<AdData> list = this.app_level;
        if (list == null || list.isEmpty()) {
            return Boolean.FALSE;
        }
        Iterator<AdData> it = this.app_level.iterator();
        while (true) {
            if (!it.hasNext()) {
                adData = null;
                break;
            }
            adData = it.next();
            if (adData.type.equals("atom_enabled")) {
                break;
            }
        }
        return Boolean.valueOf(adData != null && adData.getBoolean().booleanValue());
    }

    public Boolean isExperienceEnabled() {
        AdData adData;
        List<AdData> list = this.app_level;
        if (list == null || list.isEmpty()) {
            return Boolean.FALSE;
        }
        Iterator<AdData> it = this.app_level.iterator();
        while (true) {
            if (!it.hasNext()) {
                adData = null;
                break;
            }
            adData = it.next();
            if (adData.type.equals("experience_enabled")) {
                break;
            }
        }
        return Boolean.valueOf(adData != null && adData.getBoolean().booleanValue());
    }

    public SdkConfig(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
