package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IdApl extends JsonModel {

    @BindField
    public String IDFA;

    @BindField
    public String IDFV;

    public IdApl() {
    }

    public IdApl(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
