package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
final class g implements AuctionResult {
    private final String a;
    private final String b;
    private final double c;
    private final String d;
    private final String e;
    private final String f;
    private final String[] g;
    private final String h;
    private final Map i;
    private final CreativeFormat j;
    private final Map k;

    g(AdsType adsType, Response.Seatbid seatbid, Response.Seatbid.Bid bid, Ad ad, NetworkAdapter networkAdapter, AdExtension adExtension) {
        this.a = bid.getId();
        this.b = seatbid.getSeat();
        this.c = bid.getPrice();
        this.d = bid.getDeal();
        this.e = ad.getId();
        this.f = bid.getCid();
        if (ad.getAdomainCount() > 0) {
            this.g = (String[]) ad.m3247getAdomainList().toArray(new String[0]);
        } else {
            this.g = null;
        }
        this.k = a(adExtension);
        this.h = networkAdapter.getKey();
        this.i = a(adsType.obtainHeaderBiddingAd(ad));
        this.j = a(ad);
    }

    private Map a(AdExtension adExtension) {
        HashMap hashMap = new HashMap();
        if (adExtension != null) {
            try {
                hashMap.putAll(adExtension.getCustomParamsMap());
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    @Override // io.bidmachine.models.AuctionResult
    public String[] getAdDomains() {
        return this.g;
    }

    @Override // io.bidmachine.models.AuctionResult
    public String getCid() {
        return this.f;
    }

    @Override // io.bidmachine.models.AuctionResult
    public CreativeFormat getCreativeFormat() {
        return this.j;
    }

    @Override // io.bidmachine.models.AuctionResult
    public String getCreativeId() {
        return this.e;
    }

    @Override // io.bidmachine.models.AuctionResult
    public Map getCustomParams() {
        return this.k;
    }

    @Override // io.bidmachine.models.AuctionResult
    public String getDeal() {
        return this.d;
    }

    @Override // io.bidmachine.models.AuctionResult
    public String getDemandSource() {
        return this.b;
    }

    @Override // io.bidmachine.models.AuctionResult
    public String getId() {
        return this.a;
    }

    @Override // io.bidmachine.models.AuctionResult
    public String getNetworkKey() {
        return this.h;
    }

    @Override // io.bidmachine.models.AuctionResult
    public Map getNetworkParams() {
        return this.i;
    }

    @Override // io.bidmachine.models.AuctionResult
    public double getPrice() {
        return this.c;
    }

    public String toString() {
        return "id=" + this.a + ", demandSource=" + this.b + ", price=" + this.c + ", creativeId=" + this.e + ", cid=" + this.f;
    }

    Map a(HeaderBiddingAd headerBiddingAd) {
        Map<String, String> clientParamsMap;
        HashMap hashMap = new HashMap();
        if (headerBiddingAd != null && (clientParamsMap = headerBiddingAd.getClientParamsMap()) != null) {
            hashMap.putAll(clientParamsMap);
        }
        return hashMap;
    }

    static CreativeFormat a(Ad ad) {
        if (ad.hasDisplay()) {
            Ad.Display display = ad.getDisplay();
            if (!display.hasBanner() && TextUtils.isEmpty(display.getAdm())) {
                if (display.hasNative()) {
                    return CreativeFormat.Native;
                }
                return null;
            }
            return CreativeFormat.Banner;
        }
        if (ad.hasVideo()) {
            return CreativeFormat.Video;
        }
        return null;
    }
}
