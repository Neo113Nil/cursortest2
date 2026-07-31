package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Oo implements Qo {
    public final com.inmobi.media.ads.network.common.model.Ad a;
    public final C4493y9 b;
    public final AtomicBoolean c;

    public Oo(com.inmobi.media.ads.network.common.model.Ad ad, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter("m1", "tag");
        this.a = ad;
        this.b = c4493y9;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        if (!this.c.compareAndSet(false, true)) {
            C4493y9 c4493y9 = this.b;
            if (c4493y9 == null) {
                return "win/loss notification already triggered";
            }
            c4493y9.b("m1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad = this.a;
            List a = ad != null ? Ti.a(ad, "win_beacon") : null;
            if (a != null && !a.isEmpty()) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    String url = P3.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), TuplesKt.to("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                    E3 e3 = E3.a;
                    C4493y9 c4493y92 = this.b;
                    Intrinsics.checkNotNullParameter(url, "url");
                    E3.a(url, true, c4493y92);
                }
                if (d > 0.0d) {
                    return null;
                }
                C4493y9 c4493y93 = this.b;
                if (c4493y93 == null) {
                    return "notification triggering with invalid params";
                }
                c4493y93.b("m1", "Win notification triggered with invalid minBidToWin: " + d);
                return "notification triggering with invalid params";
            }
            C4493y9 c4493y94 = this.b;
            if (c4493y94 == null) {
                return "no win/loss notification url";
            }
            c4493y94.b("m1", "Win beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e) {
            C4493y9 c4493y95 = this.b;
            if (c4493y95 == null) {
                return "win notification failed internally";
            }
            c4493y95.a("m1", "Exception in notifyWin", e);
            return "win notification failed internally";
        }
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        if (this.c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad = this.a;
                List a = ad != null ? Ti.a(ad, "loss_beacon") : null;
                if (a != null && !a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        String url = P3.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_LOSS}", String.valueOf(i)), TuplesKt.to("${AUCTION_PRICE}", String.valueOf(d))));
                        E3 e3 = E3.a;
                        C4493y9 c4493y9 = this.b;
                        Intrinsics.checkNotNullParameter(url, "url");
                        E3.a(url, true, c4493y9);
                    }
                    if (i > 0 && d > 0.0d) {
                        return null;
                    }
                    C4493y9 c4493y92 = this.b;
                    if (c4493y92 != null) {
                        c4493y92.b("m1", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                        return "notification triggering with invalid params";
                    }
                    return "notification triggering with invalid params";
                }
                C4493y9 c4493y93 = this.b;
                if (c4493y93 != null) {
                    c4493y93.b("m1", "Loss beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                return "no win/loss notification url";
            } catch (Exception e) {
                C4493y9 c4493y94 = this.b;
                if (c4493y94 != null) {
                    c4493y94.a("m1", "Exception in notifyLoss", e);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        C4493y9 c4493y95 = this.b;
        if (c4493y95 != null) {
            c4493y95.b("m1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
