package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class RemoteConfigAppInfo extends JsonModel {

    @BindField
    public String app_store_id;

    @BindField
    public List<String> iab_categories;

    @BindField
    public Double pf;

    @BindField
    public Double pm;

    public RemoteConfigAppInfo() {
    }

    public RemoteConfigAppInfo(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
