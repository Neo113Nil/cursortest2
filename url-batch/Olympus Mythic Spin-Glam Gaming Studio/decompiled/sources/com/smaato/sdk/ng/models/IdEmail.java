package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IdEmail extends JsonModel {

    @BindField
    public String email;

    public IdEmail() {
    }

    public IdEmail(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
