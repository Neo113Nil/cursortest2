package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class RemoteConfigAppFeatures extends JsonModel {

    @BindField
    public List<String> ad_formats;

    @BindField
    public List<String> rendering;

    @BindField
    public List<String> reporting;

    @BindField
    public List<String> user_consent;

    public RemoteConfigAppFeatures() {
    }

    public RemoteConfigAppFeatures(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
