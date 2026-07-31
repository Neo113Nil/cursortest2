package com.smaato.sdk.iahb;

import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.ng.models.response.Bid;
import com.smaato.sdk.ng.models.response.OpenRTBResponse;
import com.smaato.sdk.ng.models.response.SeatBid;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class InAppBid {
    private String json;

    InAppBid(String str) {
        SeatBid seatBid;
        Bid bid;
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                OpenRTBResponse openRTBResponse = new OpenRTBResponse(new JSONObject(str));
                if (openRTBResponse.getSeatBids() == null || openRTBResponse.getSeatBids().isEmpty() || (seatBid = openRTBResponse.getSeatBids().get(0)) == null || seatBid.getBids() == null || seatBid.getBids().isEmpty() || (bid = seatBid.getBids().get(0)) == null || bid.getExt() == null || bid.getExt().getSignaldata() == null || TextUtils.isEmpty(bid.getExt().getSignaldata())) {
                    return;
                }
                this.json = bid.getExt().getSignaldata();
                return;
            } catch (Exception unused) {
                this.json = null;
                return;
            }
        }
        this.json = null;
    }

    public static InAppBid create(String str) {
        return new InAppBid(str);
    }

    public String getJson() {
        return this.json;
    }
}
