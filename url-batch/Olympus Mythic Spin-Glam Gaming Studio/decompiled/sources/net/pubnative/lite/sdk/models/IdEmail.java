package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IdEmail extends JsonModel {

    @BindField
    public String email;

    public IdEmail() {
    }

    public IdEmail(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
