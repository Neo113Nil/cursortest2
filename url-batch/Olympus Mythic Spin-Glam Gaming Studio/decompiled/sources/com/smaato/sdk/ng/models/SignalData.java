package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SignalData extends JsonModel {

    @BindField
    public AdResponse adm;

    @BindField
    public String admurl;

    @BindField
    public String format;

    @BindField
    public String status;

    @BindField
    public String tagid;

    public SignalData() {
    }

    public SignalData(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
