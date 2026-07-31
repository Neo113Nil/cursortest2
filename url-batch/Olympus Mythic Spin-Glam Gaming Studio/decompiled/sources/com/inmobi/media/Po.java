package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class Po {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final String a(C4456x adComponent, double d) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = a;
        Integer valueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new AtomicBoolean(false);
            linkedHashMap.put(valueOf, obj);
        }
        if (!((AtomicBoolean) obj).compareAndSet(false, true)) {
            C4493y9 c4493y9 = adComponent.a.c;
            if (c4493y9 == null) {
                return "win/loss notification already triggered";
            }
            c4493y9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList a2 = H4.a(adComponent.b, "win_beacon");
            if (a2.isEmpty()) {
                C4493y9 c4493y92 = adComponent.a.c;
                if (c4493y92 == null) {
                    return "no win/loss notification url";
                }
                c4493y92.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                String url = P3.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), TuplesKt.to("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                E3 e3 = E3.a;
                C4493y9 c4493y93 = adComponent.a.c;
                Intrinsics.checkNotNullParameter(url, "url");
                E3.a(url, true, c4493y93);
            }
            if (d > 0.0d) {
                return null;
            }
            C4493y9 c4493y94 = adComponent.a.c;
            if (c4493y94 == null) {
                return "notification triggering with invalid params";
            }
            c4493y94.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d);
            return "notification triggering with invalid params";
        } catch (Exception e) {
            C4493y9 c4493y95 = adComponent.a.c;
            if (c4493y95 == null) {
                return "win notification failed internally";
            }
            c4493y95.a("NativeWinLossBeacon", "Exception in notifyWin", e);
            return "win notification failed internally";
        }
    }

    public static final String a(C4456x adComponent, int i, double d) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = a;
        Integer valueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new AtomicBoolean(false);
            linkedHashMap.put(valueOf, obj);
        }
        if (((AtomicBoolean) obj).compareAndSet(false, true)) {
            try {
                ArrayList a2 = H4.a(adComponent.b, "loss_beacon");
                if (a2.isEmpty()) {
                    C4493y9 c4493y9 = adComponent.a.c;
                    if (c4493y9 != null) {
                        c4493y9.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                        return "no win/loss notification url";
                    }
                    return "no win/loss notification url";
                }
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    String url = P3.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_LOSS}", String.valueOf(i)), TuplesKt.to("${AUCTION_PRICE}", String.valueOf(d))));
                    E3 e3 = E3.a;
                    C4493y9 c4493y92 = adComponent.a.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    E3.a(url, true, c4493y92);
                }
                if (i > 0 && d > 0.0d) {
                    return null;
                }
                C4493y9 c4493y93 = adComponent.a.c;
                if (c4493y93 != null) {
                    c4493y93.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                    return "notification triggering with invalid params";
                }
                return "notification triggering with invalid params";
            } catch (Exception e) {
                C4493y9 c4493y94 = adComponent.a.c;
                if (c4493y94 != null) {
                    c4493y94.a("NativeWinLossBeacon", "Exception in notifyLoss", e);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        C4493y9 c4493y95 = adComponent.a.c;
        if (c4493y95 != null) {
            c4493y95.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
