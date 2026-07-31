package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class IdOs extends JsonModel {

    @BindField
    public String build_signature;

    @BindField
    public String name;

    @BindField
    public String version;

    public IdOs() {
    }

    public IdOs(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
