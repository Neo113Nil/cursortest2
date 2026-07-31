package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class IdLr extends JsonModel {

    @BindField
    public String IDL;

    public IdLr() {
    }

    public IdLr(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
