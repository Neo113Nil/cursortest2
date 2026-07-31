package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class BuyerSignal extends JsonModel {

    @BindField
    public String buyer_experiment_group_id;

    @BindField
    public List<String> buyerdata;

    @BindField
    public String origin;

    public BuyerSignal() {
    }

    public List<String> getBuyerData() {
        return this.buyerdata;
    }

    public String getBuyerDataJson() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.buyerdata;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = this.buyerdata.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        return jSONArray.toString();
    }

    public String getBuyerExperimentGroupId() {
        return this.buyer_experiment_group_id;
    }

    public String getOrigin() {
        return this.origin;
    }

    public BuyerSignal(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
