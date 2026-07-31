package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class DataExtension extends JsonModel {

    @BindField
    public String segclass;

    @BindField
    public Long segtax;

    public DataExtension() {
    }

    public DataExtension(JSONObject jSONObject) {
        fromJson(jSONObject);
    }

    public DataExtension(Long l, String str) {
        this.segtax = l;
        this.segclass = str;
    }
}
