package com.pubmatic.sdk.openwrap.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdBuilding;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class POBBidsBuilder implements POBAdBuilding<POBBid> {
    private String a;
    private String b;
    private int c;
    private int d;
    private String e;
    private POBAdBuilding.POBAdBuilderListener f;

    private JSONArray a(JSONObject jSONObject) {
        if (POBUtils.isJsonObjectNullOrEmpty(jSONObject)) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(POBConstants.KEY_PREBID);
        if (POBUtils.isJsonObjectNullOrEmpty(optJSONObject)) {
            return null;
        }
        return optJSONObject.optJSONArray("seatnonbid");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    @Override // com.pubmatic.sdk.common.base.POBAdBuilding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void build(@NonNull POBAdResponse<POBBid> pOBAdResponse) {
        JSONObject jSONObject;
        List<POBBid> bids;
        JSONArray optJSONArray;
        JSONArray a;
        int i;
        if (this.f == null) {
            POBLog.error("POBBidsBuilder", "Listener is null, execution of Wrapper ad builder gets break.", new Object[0]);
            return;
        }
        POBAdResponse.Builder builder = new POBAdResponse.Builder(pOBAdResponse);
        JSONObject customData = pOBAdResponse.getCustomData();
        if (customData != null) {
            try {
                builder.setNbrCode(Integer.valueOf(customData.getInt("nbr")));
            } catch (ClassCastException | JSONException unused) {
                POBLog.info("POBBidsBuilder", "Unable to fetch nbr error code from the ad response", new Object[0]);
            }
            try {
                jSONObject = customData.getJSONObject("ext");
            } catch (JSONException unused2) {
                jSONObject = null;
            }
            try {
                builder.setSendAllBidsState(jSONObject.optInt("sendallbids") != 0);
            } catch (JSONException unused3) {
                POBLog.error("POBBidsBuilder", "Unable to fetch logger and tracker details", new Object[0]);
                bids = pOBAdResponse.getBids();
                optJSONArray = customData.optJSONArray("seatbid");
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                    }
                }
                a = a(jSONObject);
                if (!POBUtils.isJsonArrayNullOrEmpty(a)) {
                }
                if (bids.size() > 0) {
                }
                this.f.adBuilderOnSuccess(builder.build());
            }
            bids = pOBAdResponse.getBids();
            optJSONArray = customData.optJSONArray("seatbid");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("bid");
                        String optString = optJSONObject.optString("seat");
                        if (optString.isEmpty()) {
                            optString = this.a;
                        }
                        if (optJSONArray2 != null) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                POBBid build = POBBid.build(optString, optJSONArray2.optJSONObject(i2));
                                if (POBUtils.isNullOrEmpty(build.getId())) {
                                    POBLog.warn("POBBidsBuilder", "Bid id is invalid and hence ignoring this OW bid.", new Object[0]);
                                } else {
                                    POBBid.Builder builder2 = new POBBid.Builder(build);
                                    if (POBUtils.isNullOrEmpty(build.getCreativeType())) {
                                        builder2.setCreativeType(this.e);
                                    }
                                    if (POBUtils.isNullOrEmpty(build.getPartnerId())) {
                                        builder2.setPartnerId(this.b);
                                    }
                                    if (build.getWidth() == 0) {
                                        builder2.setWidth(this.c);
                                    }
                                    if (build.getHeight() == 0) {
                                        builder2.setHeight(this.d);
                                    }
                                    bids.add(builder2.build());
                                }
                            }
                        }
                    }
                }
            }
            a = a(jSONObject);
            if (!POBUtils.isJsonArrayNullOrEmpty(a)) {
                POBLog.debug("POBBidsBuilder", "Received Seat Non Bids: %s", a);
            }
            if (bids.size() > 0) {
                builder.setRefreshInterval(bids.get(0).getRefreshInterval());
            }
            this.f.adBuilderOnSuccess(builder.build());
        }
    }

    @Nullable
    public String getPartnerId() {
        return this.b;
    }

    public void setCreativeType(@Nullable String str) {
        this.e = str;
    }

    public void setHeight(int i) {
        this.d = i;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdBuilding
    public void setListener(@Nullable POBAdBuilding.POBAdBuilderListener<POBBid> pOBAdBuilderListener) {
        this.f = pOBAdBuilderListener;
    }

    public void setPartnerId(@Nullable String str) {
        this.b = str;
    }

    public void setPartnerName(@Nullable String str) {
        this.a = str;
    }

    public void setWidth(int i) {
        this.c = i;
    }
}
