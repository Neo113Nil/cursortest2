package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class RemoteConfigMeasurement extends JsonModel {

    @BindField
    public Boolean viewability;

    public RemoteConfigMeasurement() {
    }

    public RemoteConfigMeasurement(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
