package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RemoteConfigVoyager extends JsonModel {

    @BindField
    public RemoteConfigAppInfo app_info;

    @BindField
    public Integer audience_refresh_frequency;

    @BindField
    public List<RemoteConfigAudience> audiences;

    @BindField
    public List<RemoteConfigMetadata> metadata;

    @BindField
    public List<RemoteConfigMLModel> models;

    @BindField
    public Integer session_sample;

    @BindField
    public String vg_encoding;

    @BindField
    public String vg_targeting_key;

    public RemoteConfigVoyager() {
    }

    public RemoteConfigVoyager(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
