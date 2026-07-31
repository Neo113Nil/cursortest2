package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class RemoteConfigAppConfig extends JsonModel {

    @BindField
    public String api;

    @BindField
    public String app_token;

    @BindField
    public List<String> enabled_apis;

    @BindField
    public List<String> enabled_protocols;

    @BindField
    public RemoteConfigAppFeatures features;

    public RemoteConfigAppConfig() {
    }

    public RemoteConfigAppConfig(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
