package com.smaato.sdk.ng.models.response;

import com.smaato.sdk.ng.utils.json.BindField;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class OpenRTBResponse extends JsonModel {

    @BindField
    private String bidid;

    @BindField
    private String cur = "USD";

    @BindField
    private String customData;

    @BindField
    private String id;

    @BindField
    private Integer nbr;

    @BindField
    private List<SeatBid> seatbid;

    public OpenRTBResponse() {
    }

    public String getBidId() {
        return this.bidid;
    }

    public String getCurrency() {
        return this.cur;
    }

    public String getCustomData() {
        return this.customData;
    }

    public String getId() {
        return this.id;
    }

    public Integer getNoBidReason() {
        return this.nbr;
    }

    public List<SeatBid> getSeatBids() {
        return this.seatbid;
    }

    public OpenRTBResponse(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
