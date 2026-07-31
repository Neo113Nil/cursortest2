package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class RemoteConfigMLModel extends JsonModel {

    @BindField
    public RemoteConfigLastVersion last_version;

    @BindField
    public Double min_score;

    @BindField
    public String name;

    public RemoteConfigMLModel() {
    }

    public RemoteConfigMLModel(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
