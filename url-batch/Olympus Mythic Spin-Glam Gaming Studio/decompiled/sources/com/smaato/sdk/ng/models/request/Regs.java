package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Regs extends JsonModel {

    @BindField
    private Integer coppa;

    @BindField
    private Ext ext;

    public Regs() {
    }

    public Integer getCOPPA() {
        return this.coppa;
    }

    public Ext getExt() {
        return this.ext;
    }

    public void setExt(Ext ext) {
        this.ext = ext;
    }

    public Regs(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
