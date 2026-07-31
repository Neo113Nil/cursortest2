package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class RemoteConfigParams extends JsonModel {

    @BindField
    public Integer distance_threshold;

    @BindField
    public RemoteConfigResolutions resolutions;

    @BindField
    public List<String> wl_taxonomy2;

    @BindField
    public List<String> wl_taxonomy3;

    public RemoteConfigParams() {
    }

    public RemoteConfigParams(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
