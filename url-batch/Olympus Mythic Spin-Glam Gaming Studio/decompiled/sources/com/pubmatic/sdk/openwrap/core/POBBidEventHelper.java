package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;

/* loaded from: classes15.dex */
public class POBBidEventHelper {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBBidEvent.BidEventError.values().length];
            a = iArr;
            try {
                iArr[POBBidEvent.BidEventError.CLIENT_SIDE_AUCTION_LOSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBBidEvent.BidEventError.BID_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[POBBidEvent.BidEventError.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    public static POBError convertToPOBError(@NonNull POBBidEvent.BidEventError bidEventError) {
        int i = a.a[bidEventError.ordinal()];
        return i != 1 ? i != 2 ? new POBError(1006, bidEventError.getErrorMessage()) : new POBError(1011, bidEventError.getErrorMessage()) : new POBError(3001, bidEventError.getErrorMessage());
    }
}
