package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4834q2;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class POBBid implements POBAdDescriptor {
    private boolean C;
    private String D;
    private List E;
    private POBCTAOverlayData F;
    private JSONArray G;
    private JSONObject H;
    private String b;
    private String c;
    private double d;
    private int e;
    private int f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m;
    private int n;
    private List o;
    private Map p;
    private JSONObject q;
    private String r;
    private String s;
    private String t;
    private String u;
    private boolean v;
    private List w;
    private boolean x;
    private long y;
    private boolean z;
    private POBImpressionCountingMethod B = POBImpressionCountingMethod.ON_LOAD;
    private final long a = System.currentTimeMillis();
    private String A = POBAdDescriptor.DYNAMIC_PRICE_BID;

    public static class Builder {
        private final POBBid a;
        private String b;
        private String c;
        private int d;
        private int e;
        private String f;
        private int g;
        private String h;

        public Builder(@NonNull POBBid pOBBid) {
            this.a = pOBBid;
            this.b = pOBBid.s;
            this.c = pOBBid.h;
            this.d = pOBBid.m;
            this.e = pOBBid.n;
            this.f = pOBBid.A;
            this.g = pOBBid.e;
            this.h = pOBBid.j;
        }

        @NonNull
        public POBBid build() {
            POBBid pOBBid = this.a;
            POBBid create = POBBid.create(pOBBid, pOBBid.p);
            create.s = this.b;
            create.h = this.c;
            create.m = this.d;
            create.n = this.e;
            create.A = this.f;
            create.e = this.g;
            create.j = this.h;
            return create;
        }

        @NonNull
        public Builder setBidStatus(int i) {
            this.g = i;
            return this;
        }

        @NonNull
        public Builder setBidType(@NonNull String str) {
            this.f = str;
            return this;
        }

        @NonNull
        public Builder setCreative(@Nullable String str) {
            this.h = str;
            return this;
        }

        @NonNull
        public Builder setCreativeType(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public Builder setHeight(int i) {
            this.e = i;
            return this;
        }

        @NonNull
        public Builder setPartnerId(@NonNull String str) {
            this.c = str;
            return this;
        }

        @NonNull
        public Builder setWidth(int i) {
            this.d = i;
            return this;
        }
    }

    private POBBid() {
    }

    @NonNull
    public static POBBid build(@NonNull String str, @NonNull JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONArray optJSONArray;
        int i;
        List list;
        POBBid pOBBid = new POBBid();
        pOBBid.q = jSONObject;
        pOBBid.b = jSONObject.optString(POBConstants.KEY_IMPRESSION_ID);
        pOBBid.c = jSONObject.optString("id");
        pOBBid.j = jSONObject.optString("adm");
        pOBBid.i = jSONObject.optString("crid");
        pOBBid.g = str;
        double optDouble = jSONObject.optDouble("price", 0.0d);
        pOBBid.d = optDouble;
        pOBBid.e = optDouble > 0.0d ? 1 : 0;
        String optString = jSONObject.optString("dealid");
        if (!POBUtils.isNullOrEmpty(optString)) {
            pOBBid.k = optString;
        }
        pOBBid.l = jSONObject.optString(C4834q2.A);
        pOBBid.m = jSONObject.optInt("w");
        pOBBid.n = jSONObject.optInt("h");
        pOBBid.r = jSONObject.optString(C4834q2.z);
        pOBBid.D = jSONObject.optString(POBConstants.KEY_BUNDLE, null);
        pOBBid.G = jSONObject.optJSONArray(POBConstants.KEY_ADOMAIN);
        JSONObject optJSONObject5 = jSONObject.optJSONObject("ext");
        if (optJSONObject5 != null) {
            pOBBid.H = optJSONObject5;
            pOBBid.z = optJSONObject5.optInt("winner") == 1;
            String optString2 = optJSONObject5.optString("crtype");
            pOBBid.s = optString2;
            pOBBid.x = "video".equals(optString2);
            if (optJSONObject5.optInt(POBConstants.KEY_IMP_CT_MTHD, 0) == 1) {
                pOBBid.B = POBImpressionCountingMethod.ONE_PX_VIEWABLE;
            } else {
                pOBBid.B = POBImpressionCountingMethod.ON_LOAD;
            }
            int optInt = optJSONObject5.optInt("refreshInterval", 0);
            JSONObject optJSONObject6 = pOBBid.x ? optJSONObject5.optJSONObject("video") : optJSONObject5.optJSONObject("banner");
            if (optJSONObject6 != null && (optJSONObject3 = optJSONObject6.optJSONObject(POBConstants.KEY_CLIENT_CONFIG)) != null) {
                optInt = optJSONObject3.optInt("refreshinterval", optInt);
                if (pOBBid.x && (optJSONObject4 = optJSONObject3.optJSONObject("reward")) != null && (optJSONArray = optJSONObject4.optJSONArray("rewards")) != null && optJSONArray.length() > 0) {
                    pOBBid.o = new ArrayList(optJSONArray.length());
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject optJSONObject7 = optJSONArray.optJSONObject(i2);
                        if (optJSONObject7 != null && optJSONObject7.has("type") && optJSONObject7.has("value")) {
                            String optString3 = optJSONObject7.optString("type", "");
                            try {
                                i = Integer.parseInt(optJSONObject7.optString("value"));
                            } catch (NumberFormatException unused) {
                                POBLog.warn("POBBid", POBLogConstants.MSG_INVALID_REWARD_RECEIVED, new Object[0]);
                                i = 0;
                            }
                            if (i > 0 && (list = pOBBid.o) != null) {
                                list.add(new POBReward(optString3, i));
                            }
                        }
                    }
                }
            }
            pOBBid.f = POBUtils.getValidRefreshInterval(optInt, 5);
            JSONObject optJSONObject8 = optJSONObject5.optJSONObject(POBConstants.KEY_PREBID);
            if (optJSONObject8 != null && (optJSONObject2 = optJSONObject8.optJSONObject("targeting")) != null) {
                try {
                    pOBBid.p = new HashMap(4);
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = optJSONObject2.getString(next);
                        Map map = pOBBid.p;
                        if (map != null) {
                            map.put(next, string);
                        }
                    }
                } catch (JSONException e) {
                    POBLog.error("POBBid", "Exception on parsing prebid object : " + e.getMessage(), new Object[0]);
                }
            }
            JSONObject optJSONObject9 = optJSONObject5.optJSONObject(POBConstants.KEY_DSA);
            if (optJSONObject9 != null) {
                pOBBid.t = optJSONObject9.optString("behalf");
                pOBBid.u = optJSONObject9.optString(POBConstants.KEY_PAID);
                JSONArray optJSONArray2 = optJSONObject9.optJSONArray("transparency");
                if (optJSONArray2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        POBDSATransparencyInfo build = POBDSATransparencyInfo.build(optJSONArray2.optJSONObject(i3));
                        if (build != null) {
                            arrayList.add(build);
                        }
                    }
                    pOBBid.w = arrayList;
                }
                pOBBid.v = optJSONObject9.optInt("adrender", 1) == 0;
            }
            JSONArray optJSONArray3 = optJSONObject5.optJSONArray("clicktrackers");
            if (!POBUtils.isJsonArrayNullOrEmpty(optJSONArray3)) {
                pOBBid.E = new ArrayList(optJSONArray3.length());
                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                    pOBBid.E.add(optJSONArray3.optString(i4));
                }
            }
            JSONObject optJSONObject10 = optJSONObject5.optJSONObject(POBConstants.KEY_OWSDK);
            if (optJSONObject10 != null && (optJSONObject = optJSONObject10.optJSONObject("ctaoverlay")) != null) {
                pOBBid.F = POBCTAOverlayData.parse(optJSONObject);
            }
        }
        return pOBBid;
    }

    @NonNull
    public static POBBid create(@NonNull POBBid pOBBid, @Nullable Map<String, String> map) {
        POBBid pOBBid2 = new POBBid();
        a(pOBBid2, pOBBid);
        Map map2 = pOBBid.p;
        if (map2 == null || map2.isEmpty()) {
            pOBBid2.p = map;
            return pOBBid2;
        }
        pOBBid2.p = pOBBid.p;
        return pOBBid2;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public POBAdDescriptor buildWithRefreshAndExpiryTimeout(int i, int i2) {
        POBBid create = create(this, this.p);
        create.f = i;
        create.y = i2;
        return create;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean enableDsaInfoIcon() {
        if (this.v) {
            return (POBUtils.isNullOrEmpty(this.t) && POBUtils.isNullOrEmpty(this.u)) ? false : true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POBBid) || (str = this.c) == null) {
            return false;
        }
        return str.equals(((POBBid) obj).getId());
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONArray getAdomains() {
        return this.G;
    }

    @Nullable
    public List<POBReward> getAllRewards() {
        return this.o;
    }

    @NonNull
    public String getBidType() {
        return this.A;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getBundle() {
        return this.D;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public POBCTAOverlayData getCTAOverlayData() {
        return this.F;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.E;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.n;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.m;
    }

    @Nullable
    public String getCreative() {
        return this.j;
    }

    @Nullable
    public String getCreativeId() {
        return this.i;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return this.s;
    }

    @Nullable
    public String getDealId() {
        return this.k;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return this.t;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getExtension() {
        return this.H;
    }

    @Nullable
    public POBReward getFirstReward() {
        List list = this.o;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (POBReward) this.o.get(0);
    }

    public int getHeight() {
        return this.n;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getId() {
        return this.c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @NonNull
    public POBImpressionCountingMethod getImpressionCountingMethod() {
        return this.B;
    }

    @Nullable
    public String getImpressionId() {
        return this.b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return this.u;
    }

    @Nullable
    public String getPartnerId() {
        return this.h;
    }

    @Nullable
    public String getPartnerName() {
        return this.g;
    }

    public double getPrice() {
        return this.d;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getRawBid() {
        return this.q;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getRefreshInterval() {
        return this.f;
    }

    public int getRemainingExpirationTime() {
        return (int) (this.y - (System.currentTimeMillis() - this.a));
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getRenderableContent() {
        return this.j;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getStatus() {
        return this.e;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public Map<String, String> getTargetingInfo() {
        if (this.e == 1) {
            return this.p;
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return this.w;
    }

    public int getWidth() {
        return this.m;
    }

    @Nullable
    public String getlURL() {
        return this.r;
    }

    @Nullable
    public String getnURL() {
        return this.l;
    }

    public boolean hasWon() {
        return this.C;
    }

    public int hashCode() {
        return (this.q + this.b + this.e).hashCode();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return false;
    }

    public boolean isExpired() {
        return getRemainingExpirationTime() <= 0;
    }

    public boolean isServerSideAuctionWinner() {
        return this.z;
    }

    public boolean isStaticBid() {
        return "static".equals(this.A);
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return this.x;
    }

    public void setHasWon(boolean z) {
        this.C = z;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Price=");
        sb.append(this.d);
        sb.append("PartnerName=");
        sb.append(this.g);
        sb.append("impressionId");
        sb.append(this.b);
        sb.append(UnifiedMediationParams.KEY_BID_ID);
        sb.append(this.c);
        sb.append("creativeId=");
        sb.append(this.i);
        if (this.o != null) {
            sb.append("Reward List:");
            sb.append(this.o.toString());
        }
        if (this.p != null) {
            sb.append(" Prebid targeting Info:");
            sb.append(this.p.toString());
        }
        return sb.toString();
    }

    private static void a(POBBid pOBBid, POBBid pOBBid2) {
        pOBBid.b = pOBBid2.b;
        pOBBid.c = pOBBid2.c;
        pOBBid.d = pOBBid2.d;
        pOBBid.e = pOBBid2.e;
        pOBBid.f = pOBBid2.f;
        pOBBid.y = pOBBid2.y;
        pOBBid.g = pOBBid2.g;
        pOBBid.i = pOBBid2.i;
        pOBBid.j = pOBBid2.j;
        pOBBid.k = pOBBid2.k;
        pOBBid.l = pOBBid2.l;
        pOBBid.m = pOBBid2.m;
        pOBBid.n = pOBBid2.n;
        pOBBid.o = pOBBid2.o;
        pOBBid.x = pOBBid2.x;
        pOBBid.s = pOBBid2.s;
        pOBBid.h = pOBBid2.h;
        pOBBid.z = pOBBid2.z;
        pOBBid.q = pOBBid2.q;
        pOBBid.r = pOBBid2.r;
        pOBBid.A = pOBBid2.A;
        pOBBid.D = pOBBid2.D;
        pOBBid.C = pOBBid2.C;
        pOBBid.p = pOBBid2.p;
        pOBBid.t = pOBBid2.t;
        pOBBid.u = pOBBid2.u;
        pOBBid.v = pOBBid2.v;
        pOBBid.w = pOBBid2.w;
        pOBBid.B = pOBBid2.B;
        pOBBid.E = pOBBid2.E;
        pOBBid.F = pOBBid2.F;
        pOBBid.G = pOBBid2.G;
        pOBBid.H = pOBBid2.H;
    }
}
