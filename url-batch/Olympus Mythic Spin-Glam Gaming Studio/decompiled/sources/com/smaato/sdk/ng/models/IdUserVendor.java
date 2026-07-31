package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IdUserVendor extends JsonModel {

    @BindField
    public IdApl APL;

    @BindField
    public IdGgl GGL;

    public IdUserVendor() {
    }

    public IdUserVendor(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
