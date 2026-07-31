package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Source extends JsonModel {

    @BindField
    private Integer fd;

    @BindField
    private String pchain;

    @BindField
    private String tid;

    public Source() {
    }

    public Integer getFinalDecision() {
        return this.fd;
    }

    public String getPaymentIdChain() {
        return this.pchain;
    }

    public String getTransactionId() {
        return this.tid;
    }

    public Source(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
