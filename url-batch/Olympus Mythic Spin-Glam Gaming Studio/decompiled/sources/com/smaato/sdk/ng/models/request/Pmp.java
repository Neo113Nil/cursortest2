package com.smaato.sdk.ng.models.request;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Pmp extends JsonModel {

    @BindField
    private List<Deal> deals;

    @BindField
    private Integer private_auction = 0;

    public Pmp() {
    }

    public List<Deal> getDeals() {
        return this.deals;
    }

    public Integer getPrivateAuction() {
        return this.private_auction;
    }

    public void setDeals(List<Deal> list) {
        this.deals = list;
    }

    public void setPrivateAuction(Integer num) {
        this.private_auction = num;
    }

    public Pmp(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
