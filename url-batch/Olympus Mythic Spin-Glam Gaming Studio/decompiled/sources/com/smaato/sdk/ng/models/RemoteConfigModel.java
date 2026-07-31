package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class RemoteConfigModel extends JsonModel {

    @BindField
    public RemoteConfigAppConfig app_config;

    @BindField
    public String key;

    @BindField
    public RemoteConfigMeasurement measurement;

    @BindField
    public Integer ttl;

    @BindField
    public RemoteConfigVoyager voyager;

    public RemoteConfigModel() {
    }

    public RemoteConfigModel(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
