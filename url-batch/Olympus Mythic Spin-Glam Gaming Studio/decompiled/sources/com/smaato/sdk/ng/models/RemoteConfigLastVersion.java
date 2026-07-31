package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class RemoteConfigLastVersion extends JsonModel {

    @BindField
    public Integer input_size;

    @BindField
    public String publish_date;

    @BindField
    public String version_no;

    public RemoteConfigLastVersion() {
    }

    public RemoteConfigLastVersion(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
