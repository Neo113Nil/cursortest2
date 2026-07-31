package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class RemoteConfigDependencies extends JsonModel {

    @BindField
    public List<String> metadata;

    @BindField
    public List<String> models;

    public RemoteConfigDependencies() {
    }

    public RemoteConfigDependencies(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
