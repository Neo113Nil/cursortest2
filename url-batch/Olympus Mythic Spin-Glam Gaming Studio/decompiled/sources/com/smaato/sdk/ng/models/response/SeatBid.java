package com.smaato.sdk.ng.models.response;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class SeatBid extends JsonModel {

    @BindField
    private List<Bid> bid;

    @BindField
    private Integer group = 0;

    @BindField
    private String seat;

    public SeatBid() {
    }

    public List<Bid> getBids() {
        return this.bid;
    }

    public Integer getGroup() {
        return this.group;
    }

    public String getSeat() {
        return this.seat;
    }

    public SeatBid(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
