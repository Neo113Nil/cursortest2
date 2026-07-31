package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class IdBattery extends JsonModel {

    @BindField
    public String capacity;

    @BindField
    public Boolean charging;

    public IdBattery() {
    }

    public IdBattery(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
