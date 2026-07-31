package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class IdTtd extends JsonModel {

    @BindField
    public String IDL;

    public IdTtd() {
    }

    public IdTtd(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
