package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AdExt extends JsonModel {

    @BindField
    protected Map<String, Object> meta;

    public AdExt() {
    }

    public AdExt(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
