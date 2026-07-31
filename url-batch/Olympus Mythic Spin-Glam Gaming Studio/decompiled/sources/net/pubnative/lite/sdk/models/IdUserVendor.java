package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IdUserVendor extends JsonModel {

    @BindField
    public IdApl APL;

    @BindField
    public IdGgl GGL;

    public IdUserVendor() {
    }

    public IdUserVendor(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
