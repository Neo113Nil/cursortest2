package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IdPrivacy extends JsonModel {

    @BindField
    public String iab_ccpa;

    @BindField
    public Boolean lat;

    @BindField
    public String tcfv1;

    @BindField
    public String tcfv2;

    public IdPrivacy() {
    }

    public IdPrivacy(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
