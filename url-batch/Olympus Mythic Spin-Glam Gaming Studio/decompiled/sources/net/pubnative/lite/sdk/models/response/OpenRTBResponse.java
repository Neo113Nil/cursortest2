package net.pubnative.lite.sdk.models.response;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
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

    public OpenRTBResponse(JSONObject jSONObject) {
        fromJson(jSONObject);
    }
}
