package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class IdGgl extends JsonModel {

    @BindField
    public String GAID;

    public IdGgl() {
    }

    public IdGgl(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
