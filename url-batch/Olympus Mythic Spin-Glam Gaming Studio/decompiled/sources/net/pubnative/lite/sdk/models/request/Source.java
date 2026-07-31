package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes5.dex */
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

    public Source(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
