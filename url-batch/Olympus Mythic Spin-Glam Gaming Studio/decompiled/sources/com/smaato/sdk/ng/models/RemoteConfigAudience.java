package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class RemoteConfigAudience extends JsonModel {

    @BindField
    public RemoteConfigDependencies dependencies;

    @BindField
    public Double min_score;

    @BindField
    public String name;

    @BindField
    public RemoteConfigParams params;

    @BindField
    public Boolean requires_geolocation;

    public RemoteConfigAudience() {
    }

    public RemoteConfigAudience(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
