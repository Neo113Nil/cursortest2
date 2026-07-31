package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IdAppVendor extends JsonModel {

    @BindField
    public IdApl APL;

    @BindField
    public IdLr LR;

    @BindField
    public IdTtd TTD;

    public IdAppVendor() {
    }

    public IdAppVendor(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
