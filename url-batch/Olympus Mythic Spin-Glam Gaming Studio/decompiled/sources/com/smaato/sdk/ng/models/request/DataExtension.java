package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class DataExtension extends JsonModel {

    @BindField
    public String segclass;

    @BindField
    public Long segtax;

    public DataExtension() {
    }

    public DataExtension(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }

    public DataExtension(Long l, String str) {
        this.segtax = l;
        this.segclass = str;
    }
}
