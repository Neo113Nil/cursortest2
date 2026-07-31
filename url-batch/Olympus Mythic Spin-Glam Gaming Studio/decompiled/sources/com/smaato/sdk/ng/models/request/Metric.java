package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Metric extends JsonModel {

    @BindField
    private String type;

    @BindField
    private Float value;

    @BindField
    private String vendor;

    public Metric() {
    }

    public String getType() {
        return this.type;
    }

    public Float getValue() {
        return this.value;
    }

    public String getVendor() {
        return this.vendor;
    }

    public Metric(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
