package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class BuyerSignals extends JsonModel {

    @BindField
    public List<BuyerSignal> igbuyer;

    public BuyerSignals() {
    }

    public List<BuyerSignal> getBuyerSignals() {
        return this.igbuyer;
    }

    public BuyerSignals(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
