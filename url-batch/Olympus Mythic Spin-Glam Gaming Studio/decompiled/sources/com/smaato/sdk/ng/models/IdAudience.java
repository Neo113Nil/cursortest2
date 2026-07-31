package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class IdAudience extends JsonModel {

    @BindField
    public String id;

    @BindField
    public String ts;

    @BindField
    public String type;

    public IdAudience() {
    }

    public IdAudience(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
