package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class TrackingUrlModel extends JsonModel {

    @BindField
    public String url = null;

    @BindField
    public long startTimestamp = 0;

    public TrackingUrlModel() {
    }

    public TrackingUrlModel(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
