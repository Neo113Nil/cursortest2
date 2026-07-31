package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IdOs extends JsonModel {

    @BindField
    public String build_signature;

    @BindField
    public String name;

    @BindField
    public String version;

    public IdOs() {
    }

    public IdOs(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
