package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class IdTtd extends JsonModel {

    @BindField
    public String IDL;

    public IdTtd() {
    }

    public IdTtd(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
