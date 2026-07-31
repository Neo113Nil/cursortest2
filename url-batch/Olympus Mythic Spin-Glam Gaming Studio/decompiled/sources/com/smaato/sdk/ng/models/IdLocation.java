package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class IdLocation extends JsonModel {

    @BindField
    public String accuracy;

    @BindField
    public String category;

    @BindField
    public String lat;

    @BindField
    public String lon;

    @BindField
    public String ts;

    @BindField
    public String type;

    public IdLocation() {
    }

    public IdLocation(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
